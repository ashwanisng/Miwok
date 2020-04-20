package com.example.android.miwok;

public class Color {

    private String mDefaultColorText;
    private String mMiwokColorText;
    private int mImageResourceId = No_IMAGE_PROVIDE;
    public static final int No_IMAGE_PROVIDE = -1;

    private int mAudioResourceId;


    public Color(String defaultColorText, String miwokColorText, int imageResourceId, int audioResourceId){
        mDefaultColorText = defaultColorText;
        mMiwokColorText = miwokColorText;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}
