package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Color> colors = new ArrayList<>();

        colors.add(new Color("Red", "Weṭeṭṭi"));
        colors.add(new Color("Green", "Chokokki"));
        colors.add(new Color("Brown", "Takaakki"));
        colors.add(new Color("Gray", "Topoppi"));
        colors.add(new Color("Black", "Kululli"));
        colors.add(new Color("White", "Kelelli"));
        colors.add(new Color("Dusty Yellow", "Topiisә"));
        colors.add(new Color("Mustard Yellow", "Chiwiiṭә"));

        ColorAdapter colorAdapter = new ColorAdapter(this, colors);
        ListView listView = (ListView) findViewById(R.id.list_color);
        listView.setAdapter(colorAdapter);

    }
}
