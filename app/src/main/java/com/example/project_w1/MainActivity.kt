package com.example.project_w1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gotoTab1()

        gotoTab2()

        gotoTab3()
    }

    fun gotoTab1(){
        val btn = findViewById<Button>(R.id.BT_tab1)

        btn.setOnClickListener{
            val intent = Intent(this, Activity_Tab1::class.java)
            startActivity(intent)
        }
    }

    fun gotoTab2(){
        val btn = findViewById<Button>(R.id.BT_tab2)

        btn.setOnClickListener{
            val intent = Intent(this, Activity_Tab2::class.java)
            startActivity(intent)
        }
    }

    fun gotoTab3(){
        val btn = findViewById<Button>(R.id.BT_tab3)

        btn.setOnClickListener{
            val intent = Intent(this, Activity_Tab3::class.java)
            startActivity(intent)
        }
    }
}