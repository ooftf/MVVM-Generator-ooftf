//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package com.github.ooftf.androidmvvmgenerator.real.utils

import org.apache.http.util.TextUtils

object StringUtils {
    const val EMPTY = ""
    const val NEW_LINE = "\n"
    const val TAB = "\t"
    const val MONEY = "￥"
    const val ZERO = "0"
    fun plusString(vararg strs: Any): String {
        val builder = StringBuilder()
        val var2: Array<Any> = strs as Array<Any>
        val var3 = strs.size
        for (var4 in 0 until var3) {
            val str = var2[var4]
            val _str = str.toString()
            if (!TextUtils.isEmpty(_str)) {
                builder.append(str)
            }
        }
        return builder.toString()
    }

    fun isEmpty(str: String?): Boolean {
        return str == null || str.length == 0
    }

    fun format(content: String): String {
        var content = content
        val username = System.getenv("USERNAME")
        val date: String = DateUtils.format(System.currentTimeMillis(), DateUtils.FORMAT_YMD)
        if (!isEmpty(username)) {
            content = content.replace("\\$\\{USER}".toRegex(), username!!)
        }
        content = content.replace("\\$\\{DATE}".toRegex(), date)
        return content
    }

    fun humpToLine(str: String): String {
        return str.replace("[A-Z]".toRegex(), "_$0").toLowerCase()
    }
}