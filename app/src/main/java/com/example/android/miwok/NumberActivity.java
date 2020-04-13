package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        String[] words = new String[10];

         words[0] = "one";
         words[1] = "two";
         words[2] = "three";
         words[3] = "four";
         words[4] = "five";
         words[5] = "six";
         words[6] = "seven";
         words[7] = "Eight";
         words[8] = "nine";
         words[9] = "ten";

        Log.v("NumberActivity", "word at index 0 : " + words[0] );
        Log.v("NumberActivity", "word at index 1 : " + words[1] );



    }




}
