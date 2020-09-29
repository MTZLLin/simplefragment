package com.myanmarit.simplefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_navigation.*
import kotlinx.android.synthetic.main.fragment_hello.*

class HelloFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_hello,container,false)
        // Inflate the layout for this fragment
       return root
       // return inflater.inflate(R.layout.fragment_hello, container, false)
    }
    override fun onViewCreated(view: View,savedInstanceState: Bundle?){
        super.onViewCreated(view,savedInstanceState)

        goToNext.setOnClickListener {
            findNavController().navigate(R.id.action_helloFragment_to_nextFragment)
        }
    }
}