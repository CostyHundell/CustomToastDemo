package com.thepeafactory.toastdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customToast = CustomToast(this)

        toast_button_1.setOnClickListener {
            customToast
                .setText("Set New Custom Text 1")
                .show()
        }

        toast_button_2.setOnClickListener {
            customToast
                .setText("Set New Custom Text 2")
                .show()
        }
    }
}
