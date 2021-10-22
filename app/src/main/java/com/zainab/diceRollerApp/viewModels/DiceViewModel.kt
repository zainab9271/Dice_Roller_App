package com.zainab.diceRollerApp.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zainab.diceRollerApp.model.domain.DiceFace
import com.zainab.diceRollerApp.model.repository.Repository

class DiceViewModel: ViewModel() {

    private val _diceFace = MutableLiveData<DiceFace>(Repository.getRandomDiceFace())
    val diceFace: LiveData<DiceFace>
        get() = _diceFace

    fun getRandomFaceDice(){
        _diceFace.postValue(Repository.getRandomDiceFace())
    }
}