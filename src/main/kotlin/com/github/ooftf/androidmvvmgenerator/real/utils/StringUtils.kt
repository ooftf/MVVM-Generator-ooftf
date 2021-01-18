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
        strs.forEach {
            if (!TextUtils.isEmpty(it.toString())) {
                builder.append(it)
            }
        }
        return builder.toString()
    }

    fun isEmpty(str: String?): Boolean {
        return str == null || str.isEmpty()
    }

    fun format(content: String): String {
        var varContent = content
        val username = System.getenv("USERNAME")
        val date: String = DateUtils.format(System.currentTimeMillis(), DateUtils.FORMAT_YMD)
        if (!isEmpty(username)) {
            varContent = varContent.replace("\\$\\{USER}".toRegex(), username!!)
        }
        varContent = varContent.replace("\\$\\{DATE}".toRegex(), date)
        return varContent
    }

    fun humpToLine(str: String): String {
        return str.replace("[A-Z]".toRegex(), "_$0").toLowerCase()
    }
}