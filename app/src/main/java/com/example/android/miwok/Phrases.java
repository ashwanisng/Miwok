package com.example.android.miwok;

public class Phrases {

    private String mDefaultPhrasesText;
    private String mMiwokPhrasesText;
    private int mAudioResorceId;

    public Phrases(String defaultPhrasesText, String miwokPhrasesText, int audioResorceId){
        mDefaultPhrasesText = defaultPhrasesText;
        mMiwokPhrasesText = miwokPhrasesText;
        mAudioResorceId = audioResorceId;
    }

    public String getDefaultPhrasesText() {
        return mDefaultPhrasesText;
    }

    public String getMiwokPhrasesText() {
        return mMiwokPhrasesText;
    }

    public int getmAudioResorceId() {
        return mAudioResorceId;
    }
}
