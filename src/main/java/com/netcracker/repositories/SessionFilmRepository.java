package com.netcracker.repositories;

import com.netcracker.entity.SessionFilm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionFilmRepository extends CrudRepository<SessionFilm, Long> {
}
