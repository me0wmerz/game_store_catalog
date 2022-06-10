package com.musicmundo.musicstorecatalog.controller;

import com.musicmundo.musicstorecatalog.exception.BadAlbumIdException;
import com.musicmundo.musicstorecatalog.model.Album;
import com.musicmundo.musicstorecatalog.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/album")
public class AlbumInventoryController {
    @Autowired
    private AlbumRepository repo;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Album createAlbum(@RequestBody Album album) {
        return repo.save(album);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Album> getAllAlbums() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Album getAlbumById(@PathVariable int id) {
        Optional<Album> optionalAlbum = repo.findById(id);
        if (optionalAlbum.isPresent() == false) {
            throw new BadAlbumIdException("There is no Album with id " + id);
        }
        return optionalAlbum.get();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateAlbum(@PathVariable int id, @RequestBody Album album) {
        if (album.getId() == null) {
            album.setId(id);
        } else if (album.getId() != id) {
            throw new BadAlbumIdException("The id in your path (" + id + ") is different than the id in your body (" + album.getId() + ").");
        }

        repo.save(album);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeAlbum(@PathVariable int id) {
        repo.deleteById(id);
    }
}
