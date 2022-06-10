package com.musicmundo.musicstorecatalog.repository;

import com.musicmundo.musicstorecatalog.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabelRepository extends JpaRepository <Label, Integer> {
}
