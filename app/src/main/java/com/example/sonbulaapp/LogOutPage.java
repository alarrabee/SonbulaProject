package com.example.sonbulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogOutPage extends AppCompatActivity {
Button buttonBackSetting;
Button btn_logout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out_page);
        buttonBackSetting=findViewById(R.id.setting_volunteer_btn_back);
        buttonBackSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToSetting();
            }
        });

        btn_logout=findViewById(R.id.btn_logout);
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               LogOutButton();
            }
        });
    }
    public void backToSetting()
    {
        Intent intentButtonBackSetting=new Intent(LogOutPage.this, SettingPage.class);
        startActivity(intentButtonBackSetting);
    }public void LogOutButton()
    {
        Intent intentBtn_logout=new Intent(LogOutPage.this,MainActivity.class);
        startActivity(intentBtn_logout);
    }
}