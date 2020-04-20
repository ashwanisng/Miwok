package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class NumberActivity extends AppCompatActivity {

    private MediaPlayer.OnCompletionListener completionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);


        final ArrayList<Word> words = new ArrayList<>();

//         one way of creating the object of word class
//         Word w = new Word("Lutti", "One");
//         words.add(w);

         words.add(new Word("One", "Lutti",R.drawable.number_one,R.raw.number_one));
         words.add(new Word("Two", "Otiiko",R.drawable.number_two,R.raw.number_two));
         words.add(new Word("Three", "Tolookosu",R.drawable.number_three,R.raw.number_three));
         words.add(new Word("Four", "Oyyisa",R.drawable.number_four,R.raw.number_four));
         words.add(new Word("Five", "Massokka",R.drawable.number_five,R.raw.number_five));
         words.add(new Word("Six", "Temmokka",R.drawable.number_six,R.raw.number_six));
         words.add(new Word("Seven", "Kenekaku",R.drawable.number_seven,R.raw.number_seven));
         words.add(new Word("Eight", "Kawinta",R.drawable.number_eight,R.raw.number_eight));
         words.add(new Word("Nine", "Wo'e",R.drawable.number_nine,R.raw.number_nine));
         words.add(new Word("Ten", "Na'accha",R.drawable.number_ten,R.raw.number_ten));


//      Now pass ArrayList into the adapter

        WordAdapter adapter = new WordAdapter(this,  words, R.color.category_numbers );
        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word =words.get(position);

//                release the media player if its exist because we want to play the different sound file
                releaseMediaPlayer();

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                mediaPlayer = MediaPlayer.create(NumberActivity.this,word.getmMediaAudio());
                mediaPlayer.start();

//              set up and create the resource file so that we can release the media player
//                once the song is finished
                mediaPlayer.setOnCompletionListener(completionListener);
            }
        });
    }

    @Override
    protected void onStop(){
        super.onStop();
//        when activity is stopped the release media player is called to stop
        releaseMediaPlayer();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }


}
