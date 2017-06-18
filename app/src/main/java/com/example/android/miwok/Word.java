package com.example.android.miwok;

/**
 * Created by jose on 5/23/17.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mResourceid;


    //Constructor

    public Word(String Default, String Miwok, int Resourceid){
        mDefaultTranslation = Default;
        mMiwokTranslation = Miwok;
        mResourceid = Resourceid;
    }

    public Word(String Default, String Miwok){
        mDefaultTranslation = Default;
        mMiwokTranslation = Miwok;
        mResourceid = -99;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getResourceid() {return mResourceid; }
}
