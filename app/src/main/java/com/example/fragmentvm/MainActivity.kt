package com.example.fragmentvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.FragmentContainerView
import com.example.fragmentvm.databinding.ActivityMainBinding
import com.example.fragmentvm.fragments.AboutFragment
import com.example.fragmentvm.fragments.LowerFragment
import com.example.fragmentvm.viewmodels.FragmentsViewModel
import com.example.fragmentvm.R
import com.example.fragmentvm.fragments.MainFragment


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel:FragmentsViewModel

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        viewModel = FragmentsViewModel(this,binding)

        supportFragmentManager
            .beginTransaction()
            .add(MainFragment(),"main_fragment")
            .commit()


        setContentView(binding.root)
    }

    override fun onBackPressed() {

        supportFragmentManager
            .beginTransaction()
            .replace(binding.mainFragment.id,MainFragment())
            .commit()

        super.onBackPressed()
    }
}