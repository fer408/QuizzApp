package com.example.android.quizzapp.ScreenActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.quizzapp.MainActivity;
import com.example.android.quizzapp.R;

public class ScreenFourActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);


//Calls button that Connects FifthaActivity(activity_fifth)to MainActivity(activity_main)
        Button mainBtn4 =(Button)findViewById(R.id.main4);

        mainBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_fifth_activity = new Intent(ScreenFourActivity.this,MainActivity.class);
                startActivity(m_fifth_activity);
            }
        });

    }
}
