package com.example.apploto11032022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTvHistory, mTvResult;
    Button mBtnReset, mBtnRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mTvHistory=findViewById(R.id.textViewHistory);
        mTvResult=findViewById(R.id.textViewResult);
        mBtnRandom=findViewById(R.id.buttonRandom);
        mBtnReset=findViewById(R.id.buttonReset);
    }
}