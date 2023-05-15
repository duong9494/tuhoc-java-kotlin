package com.example.bai224_crud_sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.view.HapticFeedbackConstants

class MyHelper(context: Context) :SQLiteOpenHelper(context, "TUHOCDB", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        // tạo table, column
        p0?.execSQL("CREATE TABLE TUHOC(_id integer primary key autoincrement, user TEXT, email TEXT)")
        p0?.execSQL("insert into TUHOC(user, email) values ('mot', 'mot@gmail.com')")
        p0?.execSQL("insert into TUHOC(user, email) values ('hai', 'hai@gmail.com')")
        p0?.execSQL("insert into TUHOC(user, email) values ('ba', 'ba@gmail.com')")
        p0?.execSQL("insert into TUHOC(user, email) values ('tuhoc.cc', 'thuhoc@gmail.com')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}