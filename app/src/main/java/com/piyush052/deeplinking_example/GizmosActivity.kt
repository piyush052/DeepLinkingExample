package com.piyush052.deeplinking_example

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class GizmosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gizmos)

        val action: String? = intent?.action
        val data: Uri? = intent?.data
        Log.e("GizmosActivity Action ", action)
        Log.e("GizmosActivity Uri ", data.toString())
    }
}
