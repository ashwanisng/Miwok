package com.example.android.miwok;

public class Family {

    private String mDefaulFamilyText;
    private String mMiwokFamilyText;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Family(String defaulFamilyText, String miwokFamilyText, int imageResourceId, int audioResourceId){
        mDefaulFamilyText = defaulFamilyText;
        mMiwokFamilyText = miwokFamilyText;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getmDefaulFamilyText() {
        return mDefaulFamilyText;
    }

    public String getmMiwokFamilyText() {
        return mMiwokFamilyText;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}
