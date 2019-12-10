package com.ops1ops.films.repository;

import com.ops1ops.films.model.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, Long> {
}
