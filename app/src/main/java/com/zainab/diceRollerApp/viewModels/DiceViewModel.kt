package com.zainab.diceRollerApp.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zainab.diceRollerApp.model.repository.Repository
import com.zainab.diceRollerApp.util.DiceFace

class DiceViewModel: ViewModel() {

    private val _diceFace = MutableLiveData<List<Int>>(DiceFace.ONE.getADiceFace())
    val diceFace: LiveData<List<Int>>
        get() = _diceFace

    fun getRandomFaceDice(){
        _diceFace.postValue(Repository.getRandomDiceFace())
    }
}