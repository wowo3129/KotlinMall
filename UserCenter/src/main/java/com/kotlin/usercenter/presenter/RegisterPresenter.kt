package com.kotlin.usercenter.presenter

import com.kotlin.baselibrary.presenter.BasePresenter
import com.kotlin.usercenter.presenter.view.RegisterView

class RegisterPresenter: BasePresenter<RegisterView>() {

    fun register(mobile :String ,verifyCode :String){
        /**
         * 业务逻辑
         * 为什么这块可以直接使用mView 因为泛型直接通过BasePresenter<RegisterView>传进来了
         */
        mView.onRegisterResult(true)
    }


}