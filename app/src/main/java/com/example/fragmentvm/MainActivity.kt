package com.example.fragmentvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.fragmentvm.databinding.ActivityMainBinding
import com.example.fragmentvm.fragments.LowerFragment
import com.example.fragmentvm.viewmodels.FragmentsViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<FragmentsViewModel>()

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }
}