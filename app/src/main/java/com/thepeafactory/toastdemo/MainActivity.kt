package com.thepeafactory.toastdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = Toast(this)
        toast.view = LayoutInflater.from(this).inflate(R.layout.custom_toast_layout, null)
        val toastTextView = toast.view.findViewById<TextView>(R.id.toast_text)
        toastTextView.text = "Show Toast Clicked"
        toast.duration = Toast.LENGTH_LONG

        toast_button.setOnClickListener {
           toast.show()
        }
    }
}
