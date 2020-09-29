package com.myanmarit.simplefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloFragment = HelloFragment()
        val transaction = supportFragmentManager.beginTransaction()

        transaction.add(R.id.fragmentContainer,helloFragment)
        transaction.commit()

       btnNext.setOnClickListener {
           val nextFragment = NextFragment()
           val transaction = supportFragmentManager.beginTransaction()
           transaction.replace(R.id.fragmentContainer,nextFragment)
           transaction.addToBackStack(null)
           transaction.commit()
        }
    }
}