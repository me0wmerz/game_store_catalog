package com.musicmundo.musicstorecatalog.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private Integer id;

    private String name;
    private String instagram;
    private String twitter;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public Artist(Integer id, String name, String instagram, String twitter) {
        this.id = id;
        this.name = name;
        this.instagram = instagram;
        this.twitter = twitter;
    }

    public Artist() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist arist = (Artist) o;
        return Objects.equals(id, arist.id) && Objects.equals(name, arist.name) && Objects.equals(instagram, arist.instagram) && Objects.equals(twitter, arist.twitter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, instagram, twitter);
    }

    @Override
    public String toString() {
        return "Arist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", instagram='" + instagram + '\'' +
                ", twitter='" + twitter + '\'' +
                '}';
    }
}
