/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.greul.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Music Adapter is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of Music objects.
 */
public class StoreAdapter extends ArrayAdapter<Music> {

    /**
     * Create a new Music Adapter object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of Musics to be displayed.
     */
    public StoreAdapter(Context context, ArrayList<Music> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.store_item, parent, false);
        }

        // Get the {@link Music} object located at this position in the list
        Music currentMusic = getItem(position);

        // Find the TextView in the library_item.xmlxml layout with the ID artist_text_view.
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentMusic.getArtist());

        // Find the TextView in the library_item.xmlxml layout with the ID album_text_view.
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_text_view);
        albumTextView.setText(currentMusic.getAlbum());

        // Find the TextView in the library_itemtem.xml layout with the ID price_text_view.
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.price_text_view);
        priceTextView.setText(Double.toString(currentMusic.getPrices()));

        // Find the ImageView in the library_itemtem.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentMusic.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentMusic.getImage());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}