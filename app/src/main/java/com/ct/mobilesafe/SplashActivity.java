package com.ct.mobilesafe;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView tvVersion;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        context = this;

        initView();
        initData();
        setListener();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(2000);

                startActivity(new Intent(context, HomeActivity.class));
            }
        }).start();
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
