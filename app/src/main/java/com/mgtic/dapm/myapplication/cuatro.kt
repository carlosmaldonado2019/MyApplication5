package com.mgtic.dapm.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class cuatro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuatro)
        supportActionBar!!.title = "Resumen"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
