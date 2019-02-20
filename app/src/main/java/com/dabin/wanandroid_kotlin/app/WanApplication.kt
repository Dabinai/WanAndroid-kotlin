package com.dabin.wanandroid_kotlin.app

import android.app.Application
import me.jessyan.autosize.AutoSize

/**
 * 所在包名：com.dabin.wanandroid_kotlin.app
 * 描述：
 * 作者：Dabin
 * 创建时间：2019-02-20
 * 修改人：
 * 修改时间：
 * 修改描述：
 */
class WanApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AutoSize.initCompatMultiProcess(this)
    }
}