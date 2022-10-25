package com.guahoo.twofragmentsoneviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SingleViewModel: ViewModel() {
    val valueForIncrease = MutableLiveData(0)
}