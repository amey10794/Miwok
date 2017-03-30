package com.example.android.miwok;

/**
 * Created by Amey on 1/4/2017.
 */

public class Words {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImage=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED=-1;

    private int mAudio;
    //default contructor of the class
    public Words(String defaultTranslation, String miwokTranslation, int AudioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudio=AudioResourceId;

    }

    public Words(String defaultTranslation, String miwokTranslation, int image, int AudioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImage=image;
        mAudio=AudioResourceId;
    }
    //returns the default or english translation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //returns the miwok translation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceId(){
        return mImage;
    }
    public int getAudioResourceId(){
        return mAudio;
    }
    public  boolean hasImage(){
        return mImage!=NO_IMAGE_PROVIDED;
    }
}
