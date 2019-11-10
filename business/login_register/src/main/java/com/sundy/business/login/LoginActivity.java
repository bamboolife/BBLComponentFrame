package com.sundy.business.login;

import android.os.Bundle;
import android.widget.EditText;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.sundy.business.R;
import com.sundy.business.R2;
import com.sundy.common.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


@Route(path = "/sundy/login")
public class LoginActivity extends BaseActivity {
  @BindView(R2.id.username)
  EditText etUserName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bbl_login_layout);
        ButterKnife.bind(this);
         etUserName.setText("我的名字");
    }


}
