package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PhraseAdapter extends ArrayAdapter<Phrases> {

    private int mColorResourceIdl;


    public PhraseAdapter(Activity context, ArrayList<Phrases> phrases, int colorResourceIdl) {
        super(context, 0, phrases);
        mColorResourceIdl = colorResourceIdl;
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

//        set the background theme
        View textContainer = listItemView.findViewById(R.id.txt_container_phrases);

//        call the color by id
        int color = ContextCompat.getColor(getContext(),mColorResourceIdl);

//        call the colors
        textContainer.setBackgroundColor(color);



        return listItemView;
    }
}
