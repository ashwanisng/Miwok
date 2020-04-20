package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final ArrayList<Family> families = new ArrayList<>();

        families.add(new Family("Father", "әpә", R.drawable.family_father,R.raw.family_father));
        families.add(new Family("Mother", "әṭa",R.drawable.family_mother,R.raw.family_mother));
        families.add(new Family("son", "angsi",R.drawable.family_son,R.raw.family_son));
        families.add(new Family("daughter", "tune",R.drawable.family_daughter,R.raw.family_daughter));
        families.add(new Family("older brother", "taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        families.add(new Family("younger brother", "chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        families.add(new Family("older sister", "teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        families.add(new Family("younger sister", "kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        families.add(new Family("grandmother", "ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        families.add(new Family("grandfather", "paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

        FamilyAdapter adapter = new FamilyAdapter(this,families, R.color.category_family);

        ListView listView = (ListView)findViewById(R.id.list_family);

        listView.setAdapter(adapter);


//        set up the on click listner to play the audio file when listview clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                to get the object postion when user click
                Family family = families.get(position);

//                create setup of resource id
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, family.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });

    }
}
