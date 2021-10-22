package com.zainab.diceRollerApp.util

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.zainab.diceRollerApp.model.domain.DiceFace

@BindingAdapter(value = ["app:diceSetup"])
fun diceSetup(view: View, diceFace: DiceFace?){
    if (view is ImageView)
        diceFace?.let { view.setImageResource(it.diceFaceImageID) }
    else
        (view as TextView).text = diceFace?.diceFaceNumber.toString()
}
