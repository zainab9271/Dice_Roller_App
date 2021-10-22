package com.zainab.diceRollerApp.util

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["app:diceSetup"])
fun diceSetup(view: View, diceFace: List<Int>){
    if (view is ImageView)
        view.setImageResource(diceFace[0])
    else
        (view as TextView).text = diceFace[1].toString()
}
