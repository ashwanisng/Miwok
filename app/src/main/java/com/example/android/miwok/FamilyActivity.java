package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer.OnCompletionListener completionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    private MediaPlayer mMediaPlayer;
    private AudioManager mAudioManager;

    AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener =
            new AudioManager.OnAudioFocusChangeListener(){
                @Override
                public void onAudioFocusChange(int focusChange) {
                    if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                            focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
//                        pause playback
                        mMediaPlayer.pause();
                        mMediaPlayer.seekTo(0);
                    }else if (focusChange == AudioManager.AUDIOFOCUS_GAIN){
//                        playback resume
                        mMediaPlayer.start();
                    }else if (focusChange == AudioManager.AUDIOFOCUS_LOSS){
                        releaseMediaPlayer();
//                        stop media playback
                    }
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);


//      to get reference to the audio manager system service
        mAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);


        final ArrayList<Family> families = new ArrayList<>();

        families.add(new Family("Father", "әpә", R.drawable.family_father,R.raw.family_father));
        families.add(new Family("Mother", "әṭa",R.drawable.family_mother,R.raw.family_mother));
        families.add(new Family("son", "angsi",R.drawable.family_son,R.raw.family_son));
        families.add(new Family("daughter", "tune",R.drawable.family_daughter,R.raw.family_daughter));
        families.add(new Family("older brother", "taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        families.add(new Family("younger brother", "chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        families.add(new Family("older sister", "teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        families.add(new Family("younger sister", "kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        families.add(new Family("grandmother", "ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        families.add(new Family("grandfather", "paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

        FamilyAdapter adapter = new FamilyAdapter(this,families, R.color.category_family);

        ListView listView = (ListView)findViewById(R.id.list_family);

        listView.setAdapter(adapter);


//        set up the on click listner to play the audio file when listview clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                to get the object postion when user click
                Family family = families.get(position);

//                release the media player if its exist because we want to play the different sound file
                releaseMediaPlayer();

                // request audio focus for playback
                int result  = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
//                       Use the music stream
                        AudioManager.STREAM_MUSIC,
//                      request permanent focus
                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
//                create setup of resource id
                    mMediaPlayer = MediaPlayer.create(FamilyActivity.this, family.getmAudioResourceId());
                    mMediaPlayer.start();

//                create and setup the audio resource file so that we can
//                play and release the song once its finished

                    mMediaPlayer.setOnCompletionListener(completionListener);
                }
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
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;

            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);

        }
    }

}
