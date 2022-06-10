package com.musicmundo.musicstorecatalog.controller;

import com.musicmundo.musicstorecatalog.exception.BadTrackIdException;
import com.musicmundo.musicstorecatalog.model.Track;
import com.musicmundo.musicstorecatalog.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/track")
public class TrackInventoryController {
    @Autowired
    private TrackRepository repo;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Track createTrack(@RequestBody Track track) {
        return repo.save(track);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Track> getAllTracks() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Track getTrackById(@PathVariable int id) {
        Optional<Track> optionalTrack = repo.findById(id);
        if (optionalTrack.isPresent() == false) {
            throw new BadTrackIdException("There is no Track with id " + id);
        }
        return optionalTrack.get();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateTrack(@PathVariable int id, @RequestBody Track track) {
        if (track.getId() == null) {
            track.setId(id);
        } else if (track.getId() != id) {
            throw new BadTrackIdException("The id in your path (" + id + ") is different than the id in your body (" + track.getId() + ").");
        }

        repo.save(track);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeTrack(@PathVariable int id) {
        repo.deleteById(id);
    }
}
