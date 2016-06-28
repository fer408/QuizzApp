package com.example.android.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.android.quizzapp.ScreenActivities.ScreenFiveActivity;
import com.example.android.quizzapp.ScreenActivities.ScreenFourActivity;
import com.example.android.quizzapp.ScreenActivities.ScreenOneActivity;
import com.example.android.quizzapp.ScreenActivities.ScreenThreeActivity;
import com.example.android.quizzapp.ScreenActivities.ScreenTwoActivity;

public class MainActivity extends AppCompatActivity {

    int points = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Buttons that connect to my buttons are created here
        Button btn1 = (Button)findViewById(R.id.button1);
        Button btn2 = (Button)findViewById(R.id.button2);
        Button btn3 = (Button)findViewById(R.id.button3);
        Button btn4 = (Button)findViewById(R.id.button4);
        Button btn5 = (Button)findViewById(R.id.button5);
//Button to submits

//code that connects MainActivity to ScreenOneActivity(activity_second)

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_second_activity = new Intent(MainActivity.this,ScreenOneActivity.class);
                startActivity(i_second_activity);
            }
        });

//code that connects MainActivity to ScreenTwoActivity(activity_third)

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_third_activity = new Intent(MainActivity.this,ScreenTwoActivity.class);
                startActivity(i_third_activity);
            }
        });

//code that connects MainActivity to ScreenThreeActivity(activity_fourth)

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_fourth_activity = new Intent(MainActivity.this,ScreenThreeActivity.class);
                startActivity(i_fourth_activity);
            }
        });

//code that connects MainActivity to ScreenFourActivity(activity_fifth)

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_fifth_activity = new Intent(MainActivity.this,ScreenFourActivity.class);
                startActivity(i_fifth_activity);
            }
        });

//code that connects MainActivity to ScreenFiveActivity(activity_sixth)

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_sixth_activity = new Intent(MainActivity.this,ScreenFiveActivity.class);
                startActivity(i_sixth_activity);
            }
        });



    }





    private void displayPoints(int number) {
        TextView scoreTextView = (TextView) findViewById(
                R.id.score);
        scoreTextView.setText("" + number);
    }

    public void submitPoints(View view){
        int point = points;
//Question 1



//Question 2



//Question 3



//Question 4



//Question 5
        //Access the RadioGroup view and save it to a variable.
        RadioGroup radioGroupQuestionFive = (RadioGroup) findViewById(R.id.question_five);
//Get the id of the RadioButton that is checked and save it
//as an integer variable.
        int solutionId = radioGroupQuestionFive.getCheckedRadioButtonId();
//Use if statements to respond based on whether
//it is the id of the correct answer.
        if (solutionId == R.id.question5_btn3) {
            //Respond to correct answer
            point = point+ 1;
            displayPoints(point);
        } else {
            //Respond to incorrect answer
            System.out.println("Incorrect");
        }
    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.question1_checkbx:
                if (checked){
                    points = points + 1;
                    displayPoints(points);
                }

                else{
                    System.out.println("Sorry please check this box");
                }

                break;
            case R.id.question1_checkbx2:
                if (checked){
                    points = points + 1;
                    displayPoints(points);
                }

                else{
                    System.out.println("Sorry please check this box");
                }

                break;
            case R.id.question1_checkbx3:
                if (checked){
                    points = points + 1;
                    displayPoints(points);
                }

                else{
                    System.out.println("Sorry please check this box");
                }

                break;
            case R.id.question1_checkbx4:
                if (checked){
                    points = points + 1;
                    displayPoints(points);
                }

                else{
                    System.out.println("Sorry please check this box");
                }

                break;
        }
    }
}
