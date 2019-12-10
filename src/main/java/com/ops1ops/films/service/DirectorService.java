package com.ops1ops.films.service;

import com.ops1ops.films.model.Director;
import com.ops1ops.films.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    public Iterable<Director> getAll() {
        return directorRepository.findAll();
    }

    public Director findById(Long id) {
        return directorRepository.findById(id)
                .orElse(null);
    }
}
