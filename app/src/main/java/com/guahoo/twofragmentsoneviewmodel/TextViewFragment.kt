package com.guahoo.twofragmentsoneviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.activityViewModels

class TextViewFragment : Fragment() {
private val viewModel: SingleViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_text_view, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvDisplayNumber = view.findViewById<TextView>(R.id.tv_display_number)
        viewModel.valueForIncrease.observe(viewLifecycleOwner){ number ->
            tvDisplayNumber.text = number.toString()
        }
    }


}