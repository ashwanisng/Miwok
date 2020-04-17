package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PhraseAdapter extends ArrayAdapter<Phrases> {


    public PhraseAdapter(Activity context, ArrayList<Phrases> phrases) {
        super(context, 0, phrases);
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        Phrases currentPharses = getItem(position);

        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).
                    inflate(R.layout.item_phrases, parent,false);
        }

        TextView defaultText = (TextView)listItemView.findViewById(R.id.default_phrases_text);
        defaultText.setText(currentPharses.getDefaultPhrasesText());

        TextView miwokText = (TextView)listItemView.findViewById(R.id.miwok_phrase_text);
        miwokText.setText(currentPharses.getMiwokPhrasesText());

        return listItemView;
    }
}
