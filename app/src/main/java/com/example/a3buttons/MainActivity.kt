package com.example.a3buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun newpage(view: View) {
        var name=ed_name.text.toString()
        var location=ed_location.text.toString()
        var mobile=ed_mobile.text.toString()
   val intent= Intent(this,Newpage::class.java)
        intent.putExtra("name",name)
        intent.putExtra("location",location)
        intent.putExtra("mobile",mobile)
        startActivity(intent)
    }
    fun print(view: View) {
        var name=ed_name.text.toString()
        var location=ed_location.text.toString()
        var mobile=ed_mobile.text.toString()

        textView.setText("$name | $location | $mobile")

    }
    fun newtoast(view: View) {
        var name=ed_name.text.toString()
        var location=ed_location.text.toString()
        var mobile=ed_mobile.text.toString()

        Toast.makeText(applicationContext,"$name | $location | $mobile",Toast.LENGTH_SHORT).show()
    }
}