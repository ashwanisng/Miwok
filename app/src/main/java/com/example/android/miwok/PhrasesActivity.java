package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        final ArrayList<Phrases> pharses = new ArrayList<>();

        pharses.add(new Phrases("Where are you going?", "Minto Wuksus",R.raw.phrase_where_are_you_going));
        pharses.add(new Phrases("What is your name?", "Tinnә Oyaase'nә",R.raw.phrase_what_is_your_name));
        pharses.add(new Phrases("My name is...", "Oyaaset...",R.raw.phrase_my_name_is));
        pharses.add(new Phrases("How are you feeling?", "Michәksәs?",R.raw.phrase_how_are_you_feeling));
        pharses.add(new Phrases("I’m feeling good.", "Kuchi Achit",R.raw.phrase_im_feeling_good));
        pharses.add(new Phrases("Are you coming?", "әәnәs'aa?",R.raw.phrase_are_you_coming));
        pharses.add(new Phrases("Yes, I’m coming.", "Hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        pharses.add(new Phrases("I’m coming.", "әәnәm",R.raw.phrase_im_coming));
        pharses.add(new Phrases("Let’s go.", "Yoowutis",R.raw.phrase_lets_go));
        pharses.add(new Phrases("Come here.", "әnni'nem",R.raw.phrase_come_here));

        PhraseAdapter adapter = new PhraseAdapter(this, pharses, R.color.category_phrases);

        ListView listView = (ListView)findViewById(R.id.list_phrases);

        listView.setAdapter(adapter);

//        set up onclick listner of listview to play audio
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // get the object at a given position
                Phrases phrase = pharses.get(position);

//                create and setup for the resource id
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, phrase.getmAudioResorceId());
                mediaPlayer.start();


            }
        });

    }
}
