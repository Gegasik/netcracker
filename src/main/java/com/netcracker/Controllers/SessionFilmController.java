package com.netcracker.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionFilmController {
    @GetMapping
    public String getSession(@PathVariable String Id ){
        return "SessionFilm"+Id;
    }
    @PostMapping //admin create
    public String create(){
        return "";
    }
}
