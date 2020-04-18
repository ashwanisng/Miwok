package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
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

        // Check if the existing view is being reused, otherwise inflate the view

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).
                    inflate(R.layout.item_number, parent, false);
        }


        TextView defaultWord = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultWord.setText(currentWord.getDefaultTranslation());


        // Find the TextView in the list_item.xml layout with the ID version_name

        TextView miwokWord = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokWord.setText(currentWord.getMiwokTranslaton());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image_num);
        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getmImage());

//            set the Visibility of the image
            imageView.setVisibility(View.VISIBLE);
        }
        else {
//            set visibility to gone does not show any thing
            imageView.setVisibility(View.GONE);
        }




        return listItemView;
    }
}


