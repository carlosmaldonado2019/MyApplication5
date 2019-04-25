package com.mgtic.dapm.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class dos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dos)
        supportActionBar!!.title = "Go back"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
