package com.sundy.business.login;

import android.os.Bundle;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.sundy.business.R;
import com.sundy.common.base.BaseActivity;


@Route(path = "/sundy/login")
public class LoginActivity extends BaseActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bbl_login_layout);

    }


}
