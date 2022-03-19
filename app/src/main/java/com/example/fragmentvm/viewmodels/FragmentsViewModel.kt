package com.example.fragmentvm.viewmodels

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fragmentvm.R
import com.example.fragmentvm.databinding.ActivityMainBinding
import com.example.fragmentvm.fragments.AboutFragment
import com.example.fragmentvm.fragments.MainFragment

/**
 * View Model for Upper and LowerFragments
 */
class FragmentsViewModel() : ViewModel() {

    constructor(context: Context,binding: ActivityMainBinding):this(){

        binding.aboutBtn.setOnClickListener{

            (context as AppCompatActivity).supportFragmentManager
                .beginTransaction()
                .replace(binding.mainFragment.id, AboutFragment())
                .commit()
        }
    }



    //While unused
    val relationships:MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }

    /**
     * Returns message for UpperFragment
     *
     */
    val messageForUpperFragment:MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    /**
     * Returns message for LowerFragment
     */
    val  messageForLowerFragment:MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

}