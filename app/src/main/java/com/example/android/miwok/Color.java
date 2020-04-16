package com.example.android.miwok;

public class Color {

    private String mDefaultColorText;
    private String mMiwokColorText;

    public Color(String defaultColorText, String miwokColorText){
        mDefaultColorText = defaultColorText;
        mMiwokColorText = miwokColorText;
    }

    public String getmDefaultColorText() {
        return mDefaultColorText;
    }

    public String getmMiwokColorText() {
        return mMiwokColorText;
    }
}
