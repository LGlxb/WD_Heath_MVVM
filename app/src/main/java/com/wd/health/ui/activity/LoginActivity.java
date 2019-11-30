package com.wd.health.ui.activity;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.wd.health.R;
import com.wd.health.databinding.ActivityLoginBinding;
import com.wd.health.di.viewmodel.LoginViewModel;

import me.goldze.mvvmhabit.base.BaseActivity;

public class LoginActivity extends BaseActivity<ActivityLoginBinding, LoginViewModel> {
    //ActivityLoginBinding类是databinding框架自定生成的,对activity_login.xml
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_login;
    }

    @Override
    public int initVariableId() {
        return com.wd.health.BR.viewModel;
    }

    @Override
    public LoginViewModel initViewModel() {
        //View持有ViewModel的引用，如果没有特殊业务处理，这个方法可以不重写
        return ViewModelProviders.of(this).get(LoginViewModel.class);
    }
}
