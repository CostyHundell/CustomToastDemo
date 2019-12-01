package com.thepeafactory.toastdemo

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast

class CustomToast(context: Context): Toast(context) {

    val toastTextView: TextView

    init {
        view = LayoutInflater.from(context).inflate(R.layout.custom_toast_layout, null)
        toastTextView = view.findViewById(R.id.toast_text)
        duration = LENGTH_LONG
        setGravity(Gravity.TOP, 0, 100)
    }

    fun setText(toastTextValue: String): CustomToast {
        toastTextView.text = toastTextValue
        return this
    }
}