package com.example.hw2_2_20170822;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button imgTxtBtn;
    ImageView imgCat;
    static int rotate = 10;//이미지를 회전시킬 때 쓸 상수

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //title의 아이콘을 q10 이미지로 설정
        getSupportActionBar().setIcon(R.drawable.q10);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        imgTxtBtn = (Button) findViewById(R.id.imageTxtBtn);
        imgCat = (ImageView) findViewById(R.id.imageCat);

        imgTxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgCat.setRotation(rotate);
                rotate += 10;
            }
        });

    }
}