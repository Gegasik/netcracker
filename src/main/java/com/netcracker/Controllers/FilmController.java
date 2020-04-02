package com.netcracker.Controllers;

import com.netcracker.entity.Film;
import com.netcracker.entity.Users;
import com.netcracker.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    //посмотреть список доступных фильмов
    @RequestMapping(value = "/{filmId}", method = RequestMethod.GET)
    public ResponseEntity<Film> getFilmById(@PathVariable(name = "filmId") Long id) {
        Film film = filmService.getFilm(id).get();
        return ResponseEntity.ok(film);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Film> getAllFilms() {
        return filmService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Film saveFilm(@RequestBody Film film) {
        return filmService.save(film);
    }

    @RequestMapping(value = "/{filmId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "filmId") Long id) {
        filmService.delete(id);
    }

}