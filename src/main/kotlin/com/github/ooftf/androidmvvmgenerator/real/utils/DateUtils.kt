//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package com.github.ooftf.androidmvvmgenerator.real.utils

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

object DateUtils {
    const val SECOND_1 = 1000L
    const val SECOND_30 = 30000L
    const val MINUTE_1 = 60000L
    const val HOUR_1 = 3600000L
    const val DAY_1 = 86400000L
    const val DAY_7 = 604800000L
    const val ONE_YEAR = 31536000000L
    var FORMAT_YEAR = "yyyy"
    var FORMAT_HM = "HH:mm"
    var FORMAT_MDHM = "MM-dd HH:mm"
    var FORMAT_YMD = "yyyy-MM-dd"
    var FORMAT_YMDHM = "yyyy-MM-dd HH:mm"
    var FORMAT_YMDHMS = "yyyy-MM-dd HH:mm:ss"
    var FORMAT_YMD_CN = "yyyy年MM月dd日"
    var FORMAT_YMDHM_CN = "yyyy年MM月dd日 HH时mm分"
    var FORMAT_YMDHMS_CN = "yyyy年MM月dd日  HH时mm分ss秒"
    @JvmOverloads
    fun format(
        time: String,
        targetModel: String,
        nowModel: String,
        locale: Locale = Locale.getDefault()
    ): String {
        var time = time
        try {
            val nowFormatter = SimpleDateFormat(nowModel, locale)
            val taggetFormatter = SimpleDateFormat(targetModel, locale)
            val data = nowFormatter.parse(time)
            time = taggetFormatter.format(data)
        } catch (var7: ParseException) {
            var7.printStackTrace()
        }
        return time
    }

    @JvmOverloads
    fun formatTolong(
        time: String,
        nowModel: String,
        locale: Locale = Locale.getDefault()
    ): Long {
        return try {
            val formatter = SimpleDateFormat(nowModel, locale)
            val data = formatter.parse(time)
            data.time
        } catch (var5: ParseException) {
            var5.printStackTrace()
            0L
        }
    }

    fun format(time: Long, tagModel: String): String {
        val date = Date(time)
        return format(date, tagModel)
    }

    fun format(time: Long, tagModel: String, locale: Locale): String {
        val data = Date(time)
        return format(data, tagModel, locale)
    }

    @JvmOverloads
    fun format(date: Date?, tagModel: String, locale: Locale = Locale.getDefault()): String {
        val formatter = SimpleDateFormat(tagModel, locale)
        return formatter.format(date)
    }

    fun getTime(year: Int, month: Int, daya: Int): Long {
        val calendar = Calendar.getInstance()
        calendar.clear()
        calendar[1] = year
        calendar[2] = month
        calendar[5] = daya
        return calendar.timeInMillis
    }

    fun removeHourMinSec(time: Long): Long {
        val c = Calendar.getInstance()
        c.timeInMillis = time
        c[11] = 0
        c[12] = 0
        c[13] = 0
        c[14] = 0
        return c.timeInMillis
    }

    fun isSameDay(time1: Long, time2: Long): Boolean {
        var varTime1 = time1
        var varTime2 = time2
        varTime1 = removeHourMinSec(varTime1)
        varTime2 = removeHourMinSec(varTime2)
        return varTime1 == varTime2
    }

    val currentTimeWithoutHourMinSec: Long
        get() = removeHourMinSec(System.currentTimeMillis())
}