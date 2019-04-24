package com.zia.alligator.firebasecrudrndnew;

/**
 * Created by GPI on 3/15/2018.
 */

public class ArtistClass {

    private String artistId;
    private String artistName;
    private String artistGenre;

    public ArtistClass (){
        //this constructor is required
    }

    public ArtistClass (String artistId, String artistName, String artistGenre) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistGenre() {
        return artistGenre;
    }
}