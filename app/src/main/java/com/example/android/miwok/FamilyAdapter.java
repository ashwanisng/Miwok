package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyAdapter extends ArrayAdapter<Family> {

    public FamilyAdapter(Activity context, ArrayList<Family>families) {
        super(context, 0, families);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Family currentFam = getItem(position);

        View listItemView  = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_family, parent, false);
        }

        TextView textView1 = (TextView)listItemView.findViewById(R.id.default_family_view);
        textView1.setText(currentFam.getmDefaulFamilyText());

        TextView textView = (TextView)listItemView.findViewById(R.id.miwok_family_view);
        textView.setText(currentFam.getmMiwokFamilyText());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_fam);
        imageView.setImageResource(currentFam.getmImageResourceId());

        return listItemView;
    }
}
