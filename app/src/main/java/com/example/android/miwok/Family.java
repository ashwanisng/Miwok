package com.example.android.miwok;

public class Family {

    private String mDefaulFamilyText;
    private String mMiwokFamilyText;
    private int mImageResourceId;

    public Family(String defaulFamilyText, String miwokFamilyText, int imageResourceId){
        mDefaulFamilyText = defaulFamilyText;
        mMiwokFamilyText = miwokFamilyText;
        mImageResourceId = imageResourceId;
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
}
