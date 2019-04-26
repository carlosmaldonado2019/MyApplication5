package com.mgtic.dapm.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class cinco : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinco)
        supportActionBar!!.title = "Referencias"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
