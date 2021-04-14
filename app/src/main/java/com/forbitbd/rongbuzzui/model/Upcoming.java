package com.forbitbd.rongbuzzui.model;

public class Upcoming {

    Integer coverimage, movieimage;
    String moviename, genre, actors, description;

    public Upcoming(Integer coverimage, Integer movieimage, String moviename, String genre, String actors, String description) {
        this.coverimage = coverimage;
        this.movieimage = movieimage;
        this.moviename = moviename;
        this.genre = genre;
        this.actors = actors;
        this.description = description;
    }

    public Integer getCoverimage() {
        return coverimage;
    }

    public void setCoverimage(Integer coverimage) {
        this.coverimage = coverimage;
    }

    public Integer getMovieimage() {
        return movieimage;
    }

    public void setMovieimage(Integer movieimage) {
        this.movieimage = movieimage;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
