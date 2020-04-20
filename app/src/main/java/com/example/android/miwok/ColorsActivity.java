package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Color> colors = new ArrayList<>();

        colors.add(new Color("Red", "Weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        colors.add(new Color("Green", "Chokokki",R.drawable.color_green,R.raw.color_green));
        colors.add(new Color("Brown", "Takaakki",R.drawable.color_brown,R.raw.color_brown));
        colors.add(new Color("Gray", "Topoppi",R.drawable.color_gray,R.raw.color_gray));
        colors.add(new Color("Black", "Kululli",R.drawable.color_black,R.raw.color_black));
        colors.add(new Color("White", "Kelelli",R.drawable.color_white,R.raw.color_white));
        colors.add(new Color("Dusty Yellow", "Topiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        colors.add(new Color("Mustard Yellow", "Chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));

        final ColorAdapter colorAdapter = new ColorAdapter(this, colors, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list_color);
        listView.setAdapter(colorAdapter);

//        set up on click listner for the audiofile when user clicked the listview

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                get the object when user clicked on
                Color color = colors.get(position);

//                create and setup for audio resource
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, color.getmAudioResourceId());
                mediaPlayer.start();
            }
        });

    }
}
