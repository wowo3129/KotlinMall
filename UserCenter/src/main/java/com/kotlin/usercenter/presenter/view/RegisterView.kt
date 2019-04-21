package com.kotlin.usercenter.presenter.view

import com.kotlin.baselibrary.presenter.view.BaseView

open interface RegisterView : BaseView {

    fun onRegisterResult(result: Boolean)

}