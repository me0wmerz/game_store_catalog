package com.musicmundo.musicstorecatalog.repository;

import com.musicmundo.musicstorecatalog.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends JpaRepository <Track, Integer> {
}
