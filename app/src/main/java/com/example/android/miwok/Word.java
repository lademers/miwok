package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wantsto learn.
 * It contains a default translation and a Minwok translation for that word.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Minwok translation for the word */
    private String  mMiwokTranslation;

    /** Audio for the word. */
    private int mAudioResourceId;

    /** Image for the word. */
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /*public Word(String defaultTranslation, String minwokTranslation) {
        mDefaultTranslation  = defaultTranslation;
        mMiwokTranslation = minwokTranslation;
    }*/

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public  Word(String defaultTranslation, String minwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = minwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /** Get the default translation of the word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /** Get the Miwok translation of the word */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

}
