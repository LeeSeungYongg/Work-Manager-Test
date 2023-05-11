package com.example.workmanagertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val manager = TestWorkManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStop() {
        super.onStop()
        manager.reserveWork()
    }

    override fun onResume() {
        super.onResume()
//        manager.cancelWork()
    }
}