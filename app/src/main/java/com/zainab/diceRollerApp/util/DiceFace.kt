package com.zainab.diceRollerApp.util

import com.zainab.diceRollerApp.R

enum class DiceFace(private var diceFaceImageID: Int, private var diceFaceNumber: Int) {
    ONE(R.drawable.diceface1, 1),
    TWO(R.drawable.diceface2, 2),
    THREE(R.drawable.diceface3, 3),
    FOUR(R.drawable.diceface4, 4),
    FIVE(R.drawable.diceface5, 5),
    SIX(R.drawable.diceface6, 6);

    fun getADiceFace(): List<Int>{
        return listOf(diceFaceImageID, diceFaceNumber)
    }
}