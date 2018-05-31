package com.example.greul.musicalstructure;

public class Music {

    private String mAlbum;
    private String mArtist;
    private String[] mSongs;
    private double[] mprices;

    public Music(String album, String artist, String[] songs, double[] prices){
        mAlbum = album;
        mArtist = artist;
        mSongs = songs;
        mprices = prices;
    }

    public String getAlbum(){
        return mAlbum;
    }

    public String getArtist(){
        return mArtist;
    }

    public String[] getSongs(){
        return mSongs;
    }

    public double[] getPrices(){
        return mprices;
    }
}
