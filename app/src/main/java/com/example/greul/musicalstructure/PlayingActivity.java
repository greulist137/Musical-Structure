package com.example.greul.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playing_item);

        setUpViews();
    }

    public void setUpViews(){
        // Find the TextView in the library_item.xmlxml layout with the ID artist_text_view.
        TextView artistTextView = (TextView) findViewById(R.id.artist_text_view);
        artistTextView.setText("Artist");

        // Find the TextView in the library_item.xmlxml layout with the ID album_text_view.
        TextView albumTextView = (TextView) findViewById(R.id.album_text_view);
        albumTextView.setText("Album");

        // Find the TextView in the library_itemtem.xml layout with the ID song_text_view.
        TextView priceTextView = (TextView) findViewById(R.id.song_text_view);
        priceTextView.setText("Song");
    }
}
