package com.example.rgb_color_visualizer;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //creating an object from the textChangeHandler class
        textChangedHandler handler = new textChangedHandler();


        //getting hold of the EditTexts boxes

        //getting the red
        EditText redBox = findViewById(R.id.inputRed);
        redBox.addTextChangedListener(handler);

        //getting the green
        EditText greenBox = findViewById(R.id.inputGtreen);
        greenBox.addTextChangedListener(handler);

        //getting the blue
        EditText blueBox = findViewById(R.id.inputBlue);
        blueBox.addTextChangedListener(handler);

    }

    private class textChangedHandler implements TextWatcher{

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

            //get red EditBox
            EditText redEditBox = findViewById(R.id.inputRed);
            String strRed = redEditBox.getText().toString();
            int redColor;
            //check if the string is empty , set the value to zero
            if(strRed.isEmpty())
            {
                redColor = 0;
            }
            else
            {
                redColor= Integer.parseInt(strRed);
            }
            //if the value is greater than 255 , set the value to 255
            if(redColor > 255)
                redColor = 255;



            //get green EditBox
            EditText greenEditBox = findViewById(R.id.inputGtreen);
            String strGreen = greenEditBox.getText().toString();
            int greenColor;
            //check if the string is empty , set the value to zero
            if(strGreen.isEmpty())
            {
                greenColor = 0;
            }
            else
            {
                greenColor= Integer.parseInt(strGreen);
            }
            //if the value is greater than 255 , set the value to 255
            if(greenColor > 255)
                greenColor = 255;



            //get blue EditBox
            EditText blueEditBox = findViewById(R.id.inputBlue);
            String strBlue = blueEditBox.getText().toString();
            int blueColor;
            //check if the string is empty , set the value to zero
            if(strBlue.isEmpty())
            {
                blueColor = 0;
            }
            else
            {
                blueColor= Integer.parseInt(strBlue);
            }
            //if the value is greater than 255 , set the value to 255
            if(blueColor > 255)
                blueColor = 255;

            //setting the text view color
            TextView outputColor = findViewById(R.id.ResultTextView);
            outputColor.setBackgroundColor(Color.rgb(redColor,greenColor,blueColor));

        }
    }
}