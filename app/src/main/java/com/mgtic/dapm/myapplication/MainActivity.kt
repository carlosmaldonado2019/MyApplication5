package com.mgtic.dapm.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View
import android.widget.GridLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mainGrid = findViewById(R.id.mainGrid) as GridLayout

        //Set Event
        setSingleEvent(mainGrid)

    }

    private fun setSingleEvent(mainGrid: GridLayout) {
        //Loop all child item of Main Grid
        for (i in 0 until mainGrid.childCount) {
            //You can see , all child item is CardView , so we just cast object to CardView
            val cardView = mainGrid.getChildAt(i) as CardView
            cardView.setOnClickListener {
                if(i ==0) {
                    val intent = Intent(this@MainActivity, dos::class.java)
                    startActivity(intent)
                }
                if(i == 1) {
                    val intent = Intent(this@MainActivity, tres::class.java)
                    startActivity(intent)
                }
                if(i == 2) {
                    val intent = Intent(this@MainActivity, cuatro::class.java)
                    startActivity(intent)
                }

                if(i == 3){
                    val intent = Intent(this@MainActivity, cinco::class.java)
                    startActivity(intent)
                }

                //intent.putExtra("info", "This is activity from card item index  $i")

            }
        }
    }
}
