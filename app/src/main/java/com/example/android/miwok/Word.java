package com.example.android.miwok;

public class Word {
    /** Default translational of the word */
    private String mDefaultTranslation;

    /** Miwok translational of the word */
    private String mMiwokTranslaton;

    private int mMediaAudio;

    /**Image of the word */

    private int mImageResourceId = No_IMAGE_PROVIDE;

    private static final int No_IMAGE_PROVIDE = -1;

//  Constructor that take 2 inputs
   public Word(String defaultTranslation, String miwokTranslaton, int imageResourceId, int mediaAudio){

       mDefaultTranslation = defaultTranslation;
       mMiwokTranslaton = miwokTranslaton;
       mImageResourceId = imageResourceId;
       mMediaAudio = mediaAudio;
   }

   /**methods */

   public  String getDefaultTranslation(){
       return  mDefaultTranslation;
   }

    public String getMiwokTranslaton(){
        return mMiwokTranslaton;
    }

    public int getmImage() {
        return mImageResourceId;
    }

    public int getmMediaAudio() {
        return mMediaAudio;
    }

    public boolean hasImage(){
       return mImageResourceId != No_IMAGE_PROVIDE;
    }
}
