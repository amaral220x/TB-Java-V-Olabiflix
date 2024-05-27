package com.olabi.olabiflix.model.entity;

import java.util.UUID;
import java.util.ArrayList;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

import com.olabi.olabiflix.model.value.Ratings;



@Entity
@Table(name = "serie")
public class Serie {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    UUID id; 
    String title;
    String totalSeasons;
    ArrayList<String> genre;
    String writers;
    String poster; //URL do poster
    ArrayList<String> actors;
    @Embedded
    Ratings ratings;

    public Serie() {
    }

    public Serie(String title, String totalSeasons, ArrayList<String> genre, String writers, String poster, ArrayList<String> actors, Ratings ratings) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.totalSeasons = totalSeasons;
        this.genre = genre;
        this.writers = writers;
        this.poster = poster;
        this.actors = actors;
        this.ratings = ratings;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTotalSeasons() {
        return totalSeasons;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public String getWriters() {
        return writers;
    }

    public String getPoster() {
        return poster;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public Ratings getRatings() {
        return ratings;
    }

    @Override
    public String toString() {
        return "Serie [actors=" + actors + ", genre=" + genre + ", id=" + id + ", poster=" + poster + ", ratings="
                + ratings + ", title=" + title + ", totalSeasons=" + totalSeasons + ", writers=" + writers + "]";
    }  
}
