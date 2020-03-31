package com.netcracker.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController {
    @PostMapping // ADMIN добавить фильм
    public String create(){
        return"";
    }

    @DeleteMapping // АДМИН удалить фильм
    public String delete(){
        return"";
    }
    @GetMapping //посмотреть список доступных фильмов
    public String getFilms(){
        return "films.html";
    }

}
