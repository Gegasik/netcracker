package com.netcracker.service;

import com.netcracker.entity.Film;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    List<Film> findAll();

    Optional<Film> getFilm(Long id);

    void delete(Long id);

    Film save(Film film);
}
