package com.ops1ops.films.repository;

import com.ops1ops.films.model.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {
}
