package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Phrases> pharses = new ArrayList<>();

        pharses.add(new Phrases("Where are you going?", "Minto Wuksus"));
        pharses.add(new Phrases("What is your name?", "Tinnә Oyaase'nә"));
        pharses.add(new Phrases("My name is...", "Oyaaset..."));
        pharses.add(new Phrases("How are you feeling?", "Michәksәs?"));
        pharses.add(new Phrases("I’m feeling good.", "Kuchi Achit"));
        pharses.add(new Phrases("Are you coming?", "әәnәs'aa?"));
        pharses.add(new Phrases("Yes, I’m coming.", "Hәә’ әәnәm"));
        pharses.add(new Phrases("I’m coming.", "әәnәm"));
        pharses.add(new Phrases("Let’s go.", "Yoowutis"));
        pharses.add(new Phrases("Come here.", "әnni'nem"));

        PhraseAdapter adapter = new PhraseAdapter(this, pharses);

        ListView listView = (ListView)findViewById(R.id.list_phrases);
        listView.setAdapter(adapter);

    }
}
