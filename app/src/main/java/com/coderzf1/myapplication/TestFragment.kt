package com.coderzf1.myapplication

import android.view.LayoutInflater
import androidx.lifecycle.ViewModel
import com.coderzf1.myapplication.databinding.FragmentTestBinding

class TestFragment : ViewModel() {
    lateinit var binding: FragmentTestBinding

    fun setTextViewText(text:String){
        binding.textview.text = text
    }

    fun initBinding(inflater: LayoutInflater){
        binding = FragmentTestBinding.inflate(inflater)
    }

}