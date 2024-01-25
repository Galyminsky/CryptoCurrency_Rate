package com.galyaminsky.cryptocurrency_rate.utils

import android.icu.text.SimpleDateFormat
import android.icu.util.TimeZone
import java.sql.Timestamp
import java.util.Date
import java.util.Locale

fun convertTimestampToTime(timestamp: Long?): String {
    if (timestamp == null) return ""
    val stamp = Timestamp(timestamp * 1000)
    val date = Date(stamp.time)
    val pattern = "HH:mm:ss"
    val sdf = SimpleDateFormat(pattern, Locale.getDefault())
    sdf.timeZone = TimeZone.getDefault()
    return sdf.format(date)
}