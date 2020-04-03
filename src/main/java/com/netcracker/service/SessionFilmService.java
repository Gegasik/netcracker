package com.netcracker.service;


import com.netcracker.entity.Film;
import com.netcracker.entity.SessionFilm;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface SessionFilmService {
    void delete(Long idSession);

    SessionFilm save(SessionFilm cinemaHall);

    List<SessionFilm> getAll();

    Optional<SessionFilm> getSessionFilmById(Long id);

    List<SessionFilm> findByFilmId(Long filmId);
}
