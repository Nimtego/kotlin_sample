package com.nimtego.kotlin_sample.model.sql

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class UserDBHelper(context: Context?)
    : SQLiteOpenHelper(context, SQLConstant.TABLE_NAME, 1, null) {


    override fun onCreate(db: SQLiteDatabase?) {
        val sqlTable = "CREATE TABLE ${SQLConstant.TABLE_NAME} (${SQLConstant.ID} INTEGER PRIMARY KEY AUTOINCREMENT, ${SQLConstant.COLUMN_NAME} TEXT NOT NULL, ${SQLConstant.COLUMN_PASSWORD} );"
        db?.execSQL(sqlTable)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
