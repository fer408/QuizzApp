package com.example.android.quizzapp.ScreenActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.quizzapp.MainActivity;
import com.example.android.quizzapp.R;

public class ScreenThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Button mainBtn3 =(Button)findViewById(R.id.main3);


        mainBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_fourth_activity = new Intent(ScreenThreeActivity.this,MainActivity.class);
                startActivity(m_fourth_activity);
            }
        });

    }
}
