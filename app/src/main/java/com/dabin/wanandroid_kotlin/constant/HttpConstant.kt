package com.dabin.wanandroid_kotlin.constant

/**
 * 所在包名：com.dabin.wanandroid_kotlin.constant
 * 描述：
 * 作者：Dabin
 * 创建时间：2019-02-20
 * 修改人：
 * 修改时间：
 * 修改描述：
 */
object HttpConstant {
    const val DEFAULT_TIMEOUT: Long = 15
    const val SAVE_USER_LOGIN_KEY = "user/login"
    const val SAVE_USER_REGISTER_KEY = "user/register"

    const val COLLECTIONS_WEBSITE = "lg/collect"
    const val UNCOLLECTIONS_WEBSITE = "lg/uncollect"
    const val ARTICLE_WEBSITE = "article"
    const val TODO_WEBSITE = "lg/todo"

    const val SET_COOKIE_KEY = "set-cookie"
    const val COOKIE_NAME = "Cookie"

    const val MAX_CACHE_SIZE: Long = 1024 * 1024 * 50 // 50M 的缓存大小
}