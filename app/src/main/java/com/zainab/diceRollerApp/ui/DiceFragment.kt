package com.zainab.diceRollerApp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.zainab.diceRollerApp.databinding.FragmentDiceBinding
import com.zainab.diceRollerApp.viewModels.DiceViewModel

class DiceFragment: Fragment() {

    lateinit var binding: FragmentDiceBinding

    private val viewModel: DiceViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDiceBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        return binding.root
    }

}