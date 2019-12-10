package com.ops1ops.films.controller;

import com.ops1ops.films.model.Director;
import com.ops1ops.films.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/directors")
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @GetMapping
    @RequestMapping("/getAll")
    public Iterable<Director> getAll() {
        return directorService.getAll();
    }

    @GetMapping
    @RequestMapping("/{id}")
    public Director getDirector(@PathVariable Long id) {
        return directorService.findById(id);
    }
}
