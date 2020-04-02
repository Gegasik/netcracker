package com.netcracker.service.impl;

import com.netcracker.entity.SessionFilm;
import com.netcracker.service.SessionFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import com.netcracker.repositories.SessionFilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionFilmServiceImpl implements SessionFilmService {
    @Autowired
    SessionFilmRepository sessionFilmRepository;

    @Override
    public void delete(Long idSession) {
        sessionFilmRepository.deleteById(idSession);
    }

    @Override
    public SessionFilm save(SessionFilm cinemaHall) {
        return sessionFilmRepository.save(cinemaHall);
    }

    @Override
    public List<SessionFilm> getAll() {
        return (List<SessionFilm>) sessionFilmRepository.findAll();
    }

    @Override
    public Optional<SessionFilm> getCinemaHallById(Long id) {
        return sessionFilmRepository.findById(id);
    }
}
