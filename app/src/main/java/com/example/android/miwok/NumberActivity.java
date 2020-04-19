package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

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

         words.add(new Word("One", "Lutti",R.drawable.number_one));
         words.add(new Word("Two", "Otiiko",R.drawable.number_two));
         words.add(new Word("Three", "Tolookosu",R.drawable.number_three));
         words.add(new Word("Four", "Oyyisa",R.drawable.number_four));
         words.add(new Word("Five", "Massokka",R.drawable.number_five));
         words.add(new Word("Six", "Temmokka",R.drawable.number_six));
         words.add(new Word("Seven", "Kenekaku",R.drawable.number_seven));
         words.add(new Word("Eight", "Kawinta",R.drawable.number_eight));
         words.add(new Word("Nine", "Wo'e",R.drawable.number_nine));
         words.add(new Word("Ten", "Na'accha",R.drawable.number_ten));


//      Now pass ArrayList into the adapter

        WordAdapter adapter = new WordAdapter(this,  words, R.color.category_numbers );
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
