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

        colors.add(new Color("Red", "Weṭeṭṭi",R.drawable.color_red));
        colors.add(new Color("Green", "Chokokki",R.drawable.color_green));
        colors.add(new Color("Brown", "Takaakki",R.drawable.color_brown));
        colors.add(new Color("Gray", "Topoppi",R.drawable.color_gray));
        colors.add(new Color("Black", "Kululli",R.drawable.color_black));
        colors.add(new Color("White", "Kelelli",R.drawable.color_white));
        colors.add(new Color("Dusty Yellow", "Topiisә",R.drawable.color_dusty_yellow));
        colors.add(new Color("Mustard Yellow", "Chiwiiṭә",R.drawable.color_mustard_yellow));

        ColorAdapter colorAdapter = new ColorAdapter(this, colors, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list_color);
        listView.setAdapter(colorAdapter);

    }
}
