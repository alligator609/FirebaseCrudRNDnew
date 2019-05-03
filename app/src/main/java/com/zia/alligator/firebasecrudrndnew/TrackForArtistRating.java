package com.zia.alligator.firebasecrudrndnew;


public class TrackForArtistRating {

    private String id;
    private String trackName;
    private int rating;

    public TrackForArtistRating() {

    }

    public TrackForArtistRating(String id, String trackName, int rating) {
        this.trackName = trackName;
        this.rating = rating;
        this.id = id;
    }

    public String getTrackName() {
        return trackName;
    }

    public int getRating() {
        return rating;
    }
}
