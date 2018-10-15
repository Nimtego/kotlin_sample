package com.nimtego.kotlin_sample

import android.database.sqlite.SQLiteOpenHelper
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nimtego.kotlin_sample.model.sql.UserDBHelper

class MainActivity : AppCompatActivity() {

    private var dbHelper : SQLiteOpenHelper? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dbHelper = UserDBHelper(this)
    }
}
