package com.example.android.miwok;

public class Color {

    private String mDefaultColorText;
    private String mMiwokColorText;
    private int mImageResourceId = No_IMAGE_PROVIDE;
    public static final int No_IMAGE_PROVIDE = -1;


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

    public boolean hasImage(){
        return mImageResourceId != No_IMAGE_PROVIDE;
    }
}
