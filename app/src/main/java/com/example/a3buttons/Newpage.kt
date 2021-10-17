package com.example.a3buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_newpage.*

class Newpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newpage)
        val name=intent.getStringExtra("name")
        val location=intent.getStringExtra("location")
        val mobile=intent.getStringExtra("mobile")
        textView2.setText("$name | $location | $mobile")

    }
}