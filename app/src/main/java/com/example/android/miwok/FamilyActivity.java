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

        families.add(new Family("Father", "әpә"));
        families.add(new Family("Mother", "әṭa"));
        families.add(new Family("son", "angsi"));
        families.add(new Family("daughter", "tune"));
        families.add(new Family("older brother", "taachi"));
        families.add(new Family("younger brother", "chalitti"));
        families.add(new Family("older sister", "teṭe"));
        families.add(new Family("younger sister", "kolliti"));
        families.add(new Family("grandmother", "ama"));
        families.add(new Family("grandfather", "paapa"));

        FamilyAdapter adapter = new FamilyAdapter(this,families);
        ListView listView = (ListView)findViewById(R.id.list_family);
        listView.setAdapter(adapter);

    }
}
