package com.example.android.miwok;

public class Family {

    private String mDefaulFamilyText;
    private String mMiwokFamilyText;

    public Family(String defaulFamilyText, String miwokFamilyText){
        mDefaulFamilyText = defaulFamilyText;
        mMiwokFamilyText = miwokFamilyText;
    }

    public String getmDefaulFamilyText() {
        return mDefaulFamilyText;
    }

    public String getmMiwokFamilyText() {
        return mMiwokFamilyText;
    }
}
