package com.example.greul.musicalstructure;

public class Music {

    private String mAlbum;
    private String mArtist;
    private String mSongs;
    private double mprices;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    public Music(String album, String artist, String songs, int imageResourceID){
        mAlbum = album;
        mArtist = artist;
        mSongs = songs;
        mImageResourceID = imageResourceID;
    }

    public Music(String album, String artist, double prices, int imageResourceID){
        mAlbum = album;
        mArtist = artist;
        mprices = prices;
        mImageResourceID = imageResourceID;
    }


    public String getAlbum(){
        return mAlbum;
    }

    public String getArtist(){
        return mArtist;
    }

    public String getSongs(){
        return mSongs;
    }

    public double getPrices(){
        return mprices;
    }

    public int getImage(){
        return mImageResourceID;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return  mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
