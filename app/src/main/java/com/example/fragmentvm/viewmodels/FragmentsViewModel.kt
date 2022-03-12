package com.example.fragmentvm.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fragmentvm.databinding.ActivityMainBinding
import com.example.fragmentvm.databinding.FragmentLowerBinding
import com.example.fragmentvm.databinding.FragmentUpperBinding

/**
 * View Model for Upper and LowerFragments
 */
class FragmentsViewModel() : ViewModel() {

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