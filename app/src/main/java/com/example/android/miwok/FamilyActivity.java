package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Family> families = new ArrayList<>();

        families.add(new Family("Father", "әpә", R.drawable.family_father));
        families.add(new Family("Mother", "әṭa",R.drawable.family_mother));
        families.add(new Family("son", "angsi",R.drawable.family_son));
        families.add(new Family("daughter", "tune",R.drawable.family_daughter));
        families.add(new Family("older brother", "taachi",R.drawable.family_older_brother));
        families.add(new Family("younger brother", "chalitti",R.drawable.family_younger_brother));
        families.add(new Family("older sister", "teṭe",R.drawable.family_older_sister));
        families.add(new Family("younger sister", "kolliti",R.drawable.family_younger_sister));
        families.add(new Family("grandmother", "ama",R.drawable.family_grandmother));
        families.add(new Family("grandfather", "paapa",R.drawable.family_grandfather));

        FamilyAdapter adapter = new FamilyAdapter(this,families, R.color.category_family);

        ListView listView = (ListView)findViewById(R.id.list_family);

        listView.setAdapter(adapter);

    }
}
