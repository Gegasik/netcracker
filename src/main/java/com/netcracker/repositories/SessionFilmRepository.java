package com.netcracker.repositories;

import com.netcracker.entity.Film;
import com.netcracker.entity.SessionFilm;
import com.netcracker.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface SessionFilmRepository extends CrudRepository<SessionFilm, Long> {
    List<SessionFilm> findByFilm_IdFilm(Long idFilm);
}
