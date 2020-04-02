package com.netcracker.service.impl;

import com.netcracker.entity.Film;
import com.netcracker.repositories.FilmRepository;
import com.netcracker.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmsServiceImpl implements FilmService {
    @Autowired
    private FilmRepository filmRepository;

    @Override
    public List<Film> findAll() {
        return (List<Film>) filmRepository.findAll();
    }

    @Override
    public Optional<Film> getFilm(Long id) {
        return filmRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        filmRepository.deleteById(id);
    }

    @Override
    public Film save(Film film) {
        return filmRepository.save(film);
    }


}
