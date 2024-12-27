package com.example.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.bottomnavigation.databinding.LoginBinding

class loginfragment:Fragment() {
    private lateinit var binding: LoginBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LoginBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogSave.setOnClickListener(){
            Toast.makeText(context,"login is ok", Toast.LENGTH_SHORT).show()
        }
    }

}