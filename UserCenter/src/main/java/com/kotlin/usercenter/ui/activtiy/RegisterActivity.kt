package com.kotlin.usercenter.ui.activtiy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.usercenter.R
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.singleTop
import org.jetbrains.anko.toast

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btn_register.setOnClickListener {
            toast("注册")
            startActivity(intentFor<UcTestActivity>("name" to 123).singleTop())
        }
    }
}
