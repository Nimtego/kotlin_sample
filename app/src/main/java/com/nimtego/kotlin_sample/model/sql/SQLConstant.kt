package com.nimtego.kotlin_sample.model.sql

import android.provider.BaseColumns

class SQLConstant {
    companion object {
        const val TABLE_NAME: String = "guests"
        const val ID: String = BaseColumns._ID
        const val COLUMN_NAME: String = "name"
        const val COLUMN_PASSWORD: String = "password"
    }
}