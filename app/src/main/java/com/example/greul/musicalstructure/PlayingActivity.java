package com.example.greul.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playing_item);

        TextView artistTextView = (TextView) findViewById(R.id.artist_text_view);
        artistTextView.setText("-");

        // Find the TextView with the ID album_text_view.
        TextView albumTextView = (TextView) findViewById(R.id.album_text_view);
        albumTextView.setText("-");

        // Find the TextView with the ID song_text_view.
        TextView songTextView = (TextView) findViewById(R.id.song_text_view);
        songTextView.setText("TEST");


    }

    public void setNowPlaying(String artist, String album, String song){
        TextView artistTextView = (TextView) findViewById(R.id.artist_text_view);
        artistTextView.setText(artist);

        // Find the TextView with the ID album_text_view.
        TextView albumTextView = (TextView) findViewById(R.id.album_text_view);
        albumTextView.setText(album);

        // Find the TextView with the ID song_text_view.
        TextView songTextView = (TextView) findViewById(R.id.song_text_view);
        songTextView.setText(song);
    }
}
