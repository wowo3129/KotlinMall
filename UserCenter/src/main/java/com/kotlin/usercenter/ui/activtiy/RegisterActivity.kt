package com.kotlin.usercenter.ui.activtiy

import android.os.Bundle
import com.kotlin.baselibrary.ui.activity.BaseMvpActivity
import com.kotlin.usercenter.R
import com.kotlin.usercenter.presenter.RegisterPresenter
import com.kotlin.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.singleTop
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mPresenter = RegisterPresenter()
        mPresenter.mView = this
        btn_register.setOnClickListener {
            toast("注册")
            mPresenter.register("", "")
//            startActivity(intentFor<UcTestActivity>("name" to 123).singleTop())
        }
    }

    override fun onRegisterResult(result: Boolean) {
        toast("onRegisterResult注册")
    }
}

