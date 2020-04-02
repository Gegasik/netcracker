package com.netcracker.service;


import com.netcracker.entity.SessionFilm;

import java.util.List;
import java.util.Optional;

public interface SessionFilmService {
    void delete(Long idSession);

    SessionFilm save(SessionFilm cinemaHall);

    List<SessionFilm> getAll();

    Optional<SessionFilm> getCinemaHallById(Long id);
}
