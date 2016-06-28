package com.example.android.quizzapp.ScreenActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.quizzapp.MainActivity;
import com.example.android.quizzapp.R;

public class ScreenTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button mainBtn2 =(Button)findViewById(R.id.main2);



        mainBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_third_activity = new Intent(ScreenTwoActivity.this,MainActivity.class);
                startActivity(m_third_activity);
            }
        });
    }
}
