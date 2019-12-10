package com.ops1ops.films.service;

import com.ops1ops.films.model.Film;
import com.ops1ops.films.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;

    public Film findById(Long id) {
        return filmRepository.findById(id).orElse(null);
    }

    public Iterable<Film> getAll() {
        return filmRepository.findAll();
    }
}
