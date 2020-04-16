package com.example.android.miwok;

import android.content.Context;

public class Word {
    /** Default translational of the word */
    private String mDefaultTranslation;

    /** Miwok translational of the word */
    private String mMiwokTranslaton;


//  Constructor that take 2 inputs
   public Word(String defaultTranslation, String miwokTranslaton){

       mDefaultTranslation = defaultTranslation;
       mMiwokTranslaton = miwokTranslaton;
   }

   /**methods */

   public  String getDefaultTranslation(){
       return  mDefaultTranslation;
   }

    public String getMiwokTranslaton(){
        return mMiwokTranslaton;
    }


}
