package com.zainab.diceRollerApp.model.repository

import com.zainab.diceRollerApp.model.SetupDice

object Repository {
    fun getRandomDiceFace() = SetupDice.getARandomDiceFace()
}