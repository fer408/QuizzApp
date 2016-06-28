package com.example.android.quizzapp.ScreenActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.example.android.quizzapp.MainActivity;
import com.example.android.quizzapp.R;

public class ScreenFiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);


        Button mainBtn5 =(Button)findViewById(R.id.main5);



        mainBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_sixth_activity = new Intent(ScreenFiveActivity.this,MainActivity.class);
                startActivity(m_sixth_activity);
            }
        });


        }
    }

