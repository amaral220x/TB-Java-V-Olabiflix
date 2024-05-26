package com.olabi.olabiflix.model.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity 
@Table(name = "filme")
public class Filme {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    private String title;
    private String year;
    private String rated;
    private String released;
    private String genre;
    private String director;
    private String writer;
    private String actors;
    private String plot;
    private String language;
    private String country;
    private String awards;



    public Filme() {
    }

    public Filme(String title, String year, String rated, String released, String genre, String director, String writer, String actors, String plot, String language, String country, String awards) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.released = released;
        this.genre = genre;
        this.director = director;
        this.writer = writer;
        this.actors = actors;
        this.plot = plot;
        this.language = language;
        this.country = country;
        this.awards = awards;
    }
    
    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getRated() {
        return rated;
    }

    public String getReleased() {
        return released;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getWriter() {
        return writer;
    }

    public String getActors() {
        return actors;
    }

    public String getPlot() {
        return plot;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }

    public String getAwards() {
        return awards;
    }



    @Override
    public String toString() {
        return "Filme{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", year='" + year + '\'' +
            ", rated='" + rated + '\'' +
            ", released='" + released + '\'' +
            ", genre='" + genre + '\'' +
            ", director='" + director + '\'' +
            ", writer='" + writer + '\'' +
            ", actors='" + actors + '\'' +
            ", plot='" + plot + '\'' +
            ", language='" + language + '\'' +
            ", country='" + country + '\'' +
            ", awards='" + awards + '\'' +
            '}';
    }

}