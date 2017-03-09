package com.ct.mobilesafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView tvVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();
        initData();
        setListener();
    }

    private void initView() {

        tvVersion = (TextView) findViewById(R.id.tv_version);

        tvVersion.setText("版本：1.1");
    }

    private void initData() {
    }

    private void setListener() {
    }
}
