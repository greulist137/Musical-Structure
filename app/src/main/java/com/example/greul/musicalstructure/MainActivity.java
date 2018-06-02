package com.example.greul.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout library = (LinearLayout) findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LibraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(LibraryIntent);
            }
        });

        LinearLayout store = (LinearLayout) findViewById(R.id.store);
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StoreIntent = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(StoreIntent);
            }
        });
    }
}
