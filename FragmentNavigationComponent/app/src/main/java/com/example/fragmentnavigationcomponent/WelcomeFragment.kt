package com.example.fragmentnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.fragmentnavigationcomponent.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeBinding.inflate(inflater,container,false)
        val name = requireArguments().getString("user_name")
        val email = requireArguments().getString("user_email")
        binding.apply {
            tvWelcomeName.text = name
            tvWelcomeEmail.text = email
            btnViewTerms.setOnClickListener {
             it.findNavController().navigate(R.id.action_welcomeFragment_to_termsFragment)
            }
        }
        return binding.root
    }

}