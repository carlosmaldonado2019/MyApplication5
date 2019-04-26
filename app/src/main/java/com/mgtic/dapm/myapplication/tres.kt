package com.mgtic.dapm.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class tres : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tres)
        supportActionBar!!.title = "Director"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
