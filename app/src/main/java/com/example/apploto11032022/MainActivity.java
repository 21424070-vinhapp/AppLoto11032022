package com.example.apploto11032022;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView mTvHistory, mTvResult;
    Button mBtnReset, mBtnRandom;
    ArrayList<Integer> mArrNumbers;
    Random mRandom;
    String mStringHistory="";
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
        //Khoi tao random
        mRandom=new Random();
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
                //xu ly neu 99 so thi reset ma 100 thi thoat khong lam gi het
                if(mArrNumbers!=null)
                {
                    if( mArrNumbers.size()>0 && mArrNumbers.size()<100)
                    {
                        mArrNumbers.clear();
                    }
                    else
                    {
                        return;
                    }

                }

                mArrNumbers=creatArrNumbers();
            }
        });


        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                //random cho so thuc
//                double value=Math.floor((Math.random() *10) +1);
//                Log.d("BBB", "Gia tri random: "+value);

                // cong thuc random trong khoang bat ky (max - min + 1) + min
                //vi du 1 -> 10: random.nextInt(10-1+1)+1;
                //vi du:
//                Random random=new Random();
//                int a=random.nextInt(10-1+1)+1;
//                Log.d("BBB", "A: "+a);
                handleRandom();
            }
        });
    }
    private void handleRandom()
    {
        if(mArrNumbers.size()>0)
        {
            int index=mRandom.nextInt(mArrNumbers.size());
            int value=mArrNumbers.get(index);

            mStringHistory +=value+" - ";
            mTvResult.setText(value+"");
            mTvHistory.setText(mStringHistory);
            mArrNumbers.remove(index);
        }
        else{
            Toast.makeText(MainActivity.this, "Tro choi ket thuc", Toast.LENGTH_SHORT).show();
        }
    }
    private void initView() {
        mTvHistory=findViewById(R.id.textViewHistory);
        mTvResult=findViewById(R.id.textViewResult);
        mBtnRandom=findViewById(R.id.buttonRandom);
        mBtnReset=findViewById(R.id.buttonReset);
    }
}