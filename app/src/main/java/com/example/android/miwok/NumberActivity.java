package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<String> words = new ArrayList<String>();

         words.add("one");
         words.add("two");
         words.add("three");
         words.add("four");
         words.add("five");
         words.add("six");
         words.add("seven");
         words.add("Eight");
         words.add("nine");
         words.add("ten");

         TextView textView = (TextView) findViewById(R.id.word);
         textView.setText((CharSequence) words);


        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words );
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

    }

}
