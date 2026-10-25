package com.netology.tabbedapplication.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class PageViewModel : ViewModel() {

    private val mIndex = MutableLiveData<Int>()

    val mText: LiveData<String> = mIndex.map { input ->
        "Page: $input"
    }

    fun setIndex(index: Int) {
        mIndex.value = index
    }

    fun getText(): LiveData<String> = mText
}