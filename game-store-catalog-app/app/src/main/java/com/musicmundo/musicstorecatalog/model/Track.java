package com.musicmundo.musicstorecatalog.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="track")
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "track_id")
    private Integer id;

    @Column(name = "album_id")
    private Integer albumId;

    private String title;

    @Column(name = "run_time")
    private int runTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public Track(Integer id, Integer albumId, String title, int runTime) {
        this.id = id;
        this.albumId = albumId;
        this.title = title;
        this.runTime = runTime;
    }

    public Track() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return runTime == track.runTime && Objects.equals(id, track.id) && Objects.equals(albumId, track.albumId) && Objects.equals(title, track.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, albumId, title, runTime);
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", albumId=" + albumId +
                ", title='" + title + '\'' +
                ", runTime=" + runTime +
                '}';
    }
}
