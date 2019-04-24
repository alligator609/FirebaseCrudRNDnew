package com.zia.alligator.firebasecrudrndnew;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Showrav on 11/3/2017.
 */

public class ArtistList extends ArrayAdapter<ArtistClass> {
    private Activity context;
    List<ArtistClass> artists;

    public ArtistList(Activity context, List<ArtistClass> artists) {
        super(context, R.layout.activity_artist_list, artists);
        this.context = context;
        this.artists = artists;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.activity_artist_list, null, true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewGenre = (TextView) listViewItem.findViewById(R.id.textViewGenre);
        ArtistClass artist = artists.get(position);
        textViewName.setText(artist.getArtistName());
        textViewGenre.setText(artist.getArtistGenre());
        return listViewItem;
    }
}