package com.example.android.miwok;

/**
 * Created by jose on 5/23/17.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;


    //Constructor

    public Word(String Default, String Miwok){
        mDefaultTranslation = Default;
        mMiwokTranslation = Miwok;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
