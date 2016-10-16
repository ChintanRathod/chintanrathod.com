package com.chintanrathod.shimmerdemo;

/**
 * Created by Rathod on 16-Jul-16.
 */
public class Celebrity {

    private String name;

    private String famousMovie;

    private String profilePhotoLocation;

    private boolean showShimmer;

    public Celebrity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePhotoLocation() {
        return profilePhotoLocation;
    }

    public void setProfilePhotoLocation(String profilePhotoLocation) {
        this.profilePhotoLocation = profilePhotoLocation;
    }

    public String getFamousMovie() {
        return famousMovie;
    }

    public void setFamousMovie(String famousMovie) {
        this.famousMovie = famousMovie;
    }

    public boolean isShowShimmer() {
        return showShimmer;
    }

    public void setShowShimmer(boolean showShimmer) {
        this.showShimmer = showShimmer;
    }
}
