package com.wd.health.di.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;

import me.goldze.mvvmhabit.base.BaseModel;
import me.goldze.mvvmhabit.base.BaseViewModel;

/**
 * Author by 刘小笨LG,  Date on 2019/11/29.
 * Email sy_android@sina.cn,
 * Role:
 */
public class LoginViewModel extends BaseViewModel {
    public LoginViewModel(@NonNull Application application) {
        super(application);
    }

    public LoginViewModel(@NonNull Application application, BaseModel model) {
        super(application, model);
    }
}
