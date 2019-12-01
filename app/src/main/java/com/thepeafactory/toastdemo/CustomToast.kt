package com.thepeafactory.toastdemo

import android.content.Context
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast

class CustomToast(context: Context): Toast(context) {

    val toastTextView: TextView

    init {
        view = LayoutInflater.from(context).inflate(R.layout.custom_toast_layout, null)
        toastTextView = view.findViewById(R.id.toast_text)
        toastTextView.text = "Show Custom Toast Clicked"
        duration = LENGTH_LONG
    }
}