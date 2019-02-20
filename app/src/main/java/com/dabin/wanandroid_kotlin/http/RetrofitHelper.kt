package com.dabin.wanandroid_kotlin.http

import com.dabin.wanandroid_kotlin.constant.Constant
import com.dabin.wanandroid_kotlin.constant.HttpConstant
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.internal.cache.CacheInterceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

/**
 * 所在包名：com.dabin.wanandroid_kotlin.http
 * 描述：
 * 作者：Dabin
 * 创建时间：2019-02-20
 * 修改人：
 * 修改时间：
 * 修改描述：
 */
object RetrofitHelper{
    private var retrofit : Retrofit? = null

    private fun getRetrofit() : Retrofit?{
        if(retrofit == null){
            synchronized(RetrofitHelper::class.java){
                if(retrofit == null){
                    retrofit = Retrofit.Builder()
                            .baseUrl(Constant.BASE_URL)
//                            .client()
                            .addConverterFactory(MoshiConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .build()
                }
            }
        }
        return  retrofit
    }

    /**
     * 获取 OkHttpClient
     */
//    private fun getOkHttpClient(): OkHttpClient {
//        val builder = OkHttpClient().newBuilder()
//        val httpLoggingInterceptor = HttpLoggingInterceptor()
//        if (BuildConfig.DEBUG) {
//            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
//        } else {
//            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.NONE
//        }
//
//        //设置 请求的缓存的大小跟位置
//        val cacheFile = File(App.context.cacheDir, "cache")
//        val cache = Cache(cacheFile, HttpConstant.MAX_CACHE_SIZE)
//
//        builder.run {
//            addInterceptor(httpLoggingInterceptor)
//            addInterceptor(HeaderInterceptor())
//            addInterceptor(SaveCookieInterceptor())
//            addInterceptor(CacheInterceptor())
//            cache(cache)  //添加缓存
//            connectTimeout(HttpConstant.DEFAULT_TIMEOUT, TimeUnit.SECONDS)
//            readTimeout(HttpConstant.DEFAULT_TIMEOUT, TimeUnit.SECONDS)
//            writeTimeout(HttpConstant.DEFAULT_TIMEOUT, TimeUnit.SECONDS)
//            retryOnConnectionFailure(true) // 错误重连
//            // cookieJar(CookieManager())
//        }
//        return builder.build()
//    }

}