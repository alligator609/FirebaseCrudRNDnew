package com.zia.alligator.firebasecrudrndnew;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by GPI on 3/15/2018.
 */

public class Tracklistclass extends ArrayAdapter<TrackForArtistRating> {
    private Activity context;
    List<TrackForArtistRating> tracks;

    public Tracklistclass(Activity context, List<TrackForArtistRating> tracks) {
        super(context, R.layout.activity_artist_list, tracks);
        this.context = context;
        this.tracks = tracks;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.activity_artist_list, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewRating = (TextView) listViewItem.findViewById(R.id.textViewGenre);

        TrackForArtistRating track = tracks.get(position);
        textViewName.setText(track.getTrackName());
        textViewRating.setText(String.valueOf(track.getRating()));
        return listViewItem;
    }
}