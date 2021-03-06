package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends ArrayAdapter<Color> {

    private int mColorResourceId;

    public ColorAdapter(Activity context, ArrayList<Color> colors, int colorResourceId) {
        super(context, 0, colors);
         mColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Color cuurentColor = getItem(position);

        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).
                    inflate(R.layout.item_colors,parent,false);
        }

        TextView defaultColor = (TextView)listItemView.findViewById(R.id.default_color_view);

        defaultColor.setText(cuurentColor.getmDefaultColorText());


        TextView miwokColor = (TextView)listItemView.findViewById(R.id.miwok_color_view);

        miwokColor.setText(cuurentColor.getmMiwokColorText());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_col);
        if (cuurentColor.hasImage()){
            imageView.setImageResource(cuurentColor.getmImageResourceId());

//            set the Visibility of the image
            imageView.setVisibility(View.VISIBLE);
        }
        else {
//            set visibility to gone does not show any thing
            imageView.setVisibility(View.GONE);
        }

//        set background theme of the text color
        View textContainer = listItemView.findViewById(R.id.txt_container_col);

//        set color by id
        int color = ContextCompat.getColor(getContext(),mColorResourceId);

//        call the background color
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
