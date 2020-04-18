package com.example.android.miwok;

public class Word {
    /** Default translational of the word */
    private String mDefaultTranslation;

    /** Miwok translational of the word */
    private String mMiwokTranslaton;

    /**Image of the word */

    private int mImageResourceId;

//  Constructor that take 2 inputs
   public Word(String defaultTranslation, String miwokTranslaton, int imageResourceId){

       mDefaultTranslation = defaultTranslation;
       mMiwokTranslaton = miwokTranslaton;
       mImageResourceId = imageResourceId;
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
}
