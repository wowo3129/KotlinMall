package com.kotlin.usercenter.ui.activtiy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.usercenter.R
import org.jetbrains.anko.toast

class UcTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uc_test)
        toast("${intent.getIntExtra("name", -1)}")
    }
}
