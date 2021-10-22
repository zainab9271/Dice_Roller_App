package com.zainab.diceRollerApp.model

import com.zainab.diceRollerApp.R
import com.zainab.diceRollerApp.model.domain.DiceFace

object SetupDice {

    private val diceFaces = listOf<DiceFace>(
        DiceFace(R.drawable.diceface1, 1),
        DiceFace(R.drawable.diceface2, 2),
        DiceFace(R.drawable.diceface3, 3),
        DiceFace(R.drawable.diceface4, 4),
        DiceFace(R.drawable.diceface5, 5),
        DiceFace(R.drawable.diceface6, 6),
    )

    fun getARandomDiceFace(): DiceFace{
        return diceFaces[(0..5).random()]
    }
}