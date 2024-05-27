package com.olabi.olabiflix.model.value;

import javax.persistence.Embeddable;

@Embeddable
public class Ratings {
    private String rating;
    private String likes;

    public Ratings() {
    }

    public Ratings(String rating, String likes) {
        this.rating = rating;
        this.likes = likes;
    }

    public String getRating() {
        return rating;
    }

    public String getLikes() {
        return likes;
    }

    
}
