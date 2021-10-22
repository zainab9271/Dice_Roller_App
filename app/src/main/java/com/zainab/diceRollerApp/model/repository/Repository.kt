package com.zainab.diceRollerApp.model.repository

import com.zainab.diceRollerApp.util.DiceFace

object Repository {
    fun getRandomDiceFace() = DiceFace.values().random().getADiceFace()
}