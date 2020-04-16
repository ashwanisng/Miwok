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

        ArrayList<Word> words = new ArrayList<>();

//         one way of creating the object of word class
//         Word w = new Word("Lutti", "One");
//         words.add(w);

         words.add(new Word("One", "Lutti"));
         words.add(new Word("Two", "Otiiko"));
         words.add(new Word("Three", "Tolookosu"));
         words.add(new Word("Four", "Oyyisa"));
         words.add(new Word("Five", "Massokka"));
         words.add(new Word("Six", "Temmokka"));
         words.add(new Word("Seven", "Kenekaku"));
         words.add(new Word("Eight", "Kawinta"));
         words.add(new Word("Nine", "Wo'e"));
         words.add(new Word("Ten", "Na'accha"));


//      Now pass ArrayList into the adapter

        WordAdapter adapter = new WordAdapter(this,  words );
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}
