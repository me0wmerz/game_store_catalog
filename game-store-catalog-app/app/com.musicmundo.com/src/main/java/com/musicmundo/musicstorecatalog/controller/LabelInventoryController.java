package com.musicmundo.musicstorecatalog.controller;

import com.musicmundo.musicstorecatalog.exception.BadLabelIdException;
import com.musicmundo.musicstorecatalog.model.Label;
import com.musicmundo.musicstorecatalog.repository.LabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/label")
public class LabelInventoryController {
    @Autowired
    private LabelRepository repo;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Label createLabel(@RequestBody Label label) {
        return repo.save(label);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Label> getAllLabels() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Label getLabelById(@PathVariable int id) {
        Optional<Label> optionalLabel = repo.findById(id);
        if (optionalLabel.isPresent() == false) {
            throw new BadLabelIdException("There is no Label with id " + id);
        }
        return optionalLabel.get();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateLabel(@PathVariable int id, @RequestBody Label label) {
        if (label.getId() == null) {
            label.setId(id);
        } else if (label.getId() != id) {
            throw new BadLabelIdException("The id in your path (" + id + ") is different than the id in your body (" + label.getId() + ").");
        }

        repo.save(label);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeLabel(@PathVariable int id) {
        repo.deleteById(id);
    }
}
