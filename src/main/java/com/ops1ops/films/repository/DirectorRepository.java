package com.ops1ops.films.repository;

import com.ops1ops.films.model.Director;
import org.springframework.data.repository.CrudRepository;

public interface DirectorRepository extends CrudRepository<Director, Long> {
}
