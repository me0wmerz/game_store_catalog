package com.musicmundo.musicstorecatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.musicmundo.musicstorecatalog.model.Artist;

@Repository
public interface ArtistRepository extends JpaRepository <Artist, Integer> {
}
