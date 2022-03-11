package com.example.apploto11032022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView mTvHistory, mTvResult;
    Button mBtnReset, mBtnRandom;
    ArrayList<Integer> mArrNumbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        event();
    }

    private void initData() {
        //tao 1 mang 100 so tu 1->100
        mArrNumbers=creatArrNumbers();
    }

    private ArrayList<Integer> creatArrNumbers() {

        mArrNumbers=new ArrayList<>();
        for(int i=1;i<=100;i++)
        {
            mArrNumbers.add(i);
        }
        return mArrNumbers;
    }

    private void event() {
        mBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void initView() {
        mTvHistory=findViewById(R.id.textViewHistory);
        mTvResult=findViewById(R.id.textViewResult);
        mBtnRandom=findViewById(R.id.buttonRandom);
        mBtnReset=findViewById(R.id.buttonReset);
    }
}