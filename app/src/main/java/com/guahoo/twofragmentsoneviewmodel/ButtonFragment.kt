package com.guahoo.twofragmentsoneviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels

class ButtonFragment : Fragment() {
    private val viewModel: SingleViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_button, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnIncrease = view.findViewById<Button>(R.id.increase_btn)
        btnIncrease.setOnClickListener {
            viewModel.valueForIncrease.value = viewModel.valueForIncrease.value?.plus(1)
        }
    }
}