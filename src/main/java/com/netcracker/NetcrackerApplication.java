package com.netcracker;

import com.netcracker.entity.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.netcracker.repositories.FilmRepository;

@SpringBootApplication
public class NetcrackerApplication {
	@Autowired
	FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(NetcrackerApplication.class, args);
	}
	@Bean
	public void springdata() {
		Film film = new Film();
		film.setFilmName("ewq");
		film.setIdFilm(23);
		film.setFilmDescriptions("das");
//filmRepository.save(film);

	}

}
