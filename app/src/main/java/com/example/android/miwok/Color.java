package com.example.android.miwok;

public class Color {

    private String mDefaultColorText;
    private String mMiwokColorText;
    private int mImageResourceId;


    public Color(String defaultColorText, String miwokColorText, int imageResourceId){
        mDefaultColorText = defaultColorText;
        mMiwokColorText = miwokColorText;
        mImageResourceId = imageResourceId;
    }

    public String getmDefaultColorText() {
        return mDefaultColorText;
    }

    public String getmMiwokColorText() {
        return mMiwokColorText;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
