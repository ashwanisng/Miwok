package com.example.android.miwok;

public class Phrases {

    private String mDefaultPhrasesText;
    private String mMiwokPhrasesText;

    public Phrases(String defaultPhrasesText, String miwokPhrasesText){
        mDefaultPhrasesText = defaultPhrasesText;
        mMiwokPhrasesText = miwokPhrasesText;
    }

    public String getDefaultPhrasesText() {
        return mDefaultPhrasesText;
    }

    public String getMiwokPhrasesText() {
        return mMiwokPhrasesText;
    }
}
