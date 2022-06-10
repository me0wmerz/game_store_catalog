package com.musicmundo.musicstorecatalog.repository;

import com.musicmundo.musicstorecatalog.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository <Album, Integer> {
}
