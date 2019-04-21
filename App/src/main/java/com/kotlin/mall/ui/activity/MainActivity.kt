package com.kotlin.mall.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.mall.R

import org.jetbrains.anko.intentFor
import org.jetbrains.anko.singleTop
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity<UcTestActivity>("id" to 3)
        startActivity(intentFor<UcTestActivity>("id" to 4).singleTop())
        startActivity<UcTestActivity>("id" to 3, "name" to "asd")


    }

}
