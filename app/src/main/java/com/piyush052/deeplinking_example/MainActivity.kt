package com.piyush052.deeplinking_example

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

// adb shell am start -W -a android.intent.action.VIEW -d "example://gizmos" com.piyush052.deeplinking_example

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val action: String? = intent?.action
        val data: Uri? = intent?.data
        Log.e("String Action ", action)
        Log.e("Uri ", data.toString())
    }
}
