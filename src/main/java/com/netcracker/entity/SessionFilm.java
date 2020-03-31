package com.netcracker.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "session_film")
public class SessionFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_session")
    private Long idSession;
    @Column(name = "session_film")
    private Long sessionFilm;
    @Column(name="cinema_hall_id")
    private Long cinemaHallId;
    @ManyToOne
    @JoinColumn(name="id_film")
    private Film FilmId;
    @ManyToOne
    @JoinColumn(name="id_hall")
    private CinemaHall cinemaHall;
    @ManyToMany(mappedBy = "sessionFilms")
    private Set<Users> users;

    public SessionFilm() {
    }

    public Long getIdSession() {
        return idSession;
    }

    public void setIdSession(Long idSession) {
        this.idSession = idSession;
    }

    public Long getSessionFilm() {
        return sessionFilm;
    }

    public void setSessionFilm(Long sessionFilm) {
        this.sessionFilm = sessionFilm;
    }

    public Long getCinemaHallId() {
        return cinemaHallId;
    }

    public void setCinemaHallId(Long cinemaHallId) {
        this.cinemaHallId = cinemaHallId;
    }

    public Film getFilmId() {
        return FilmId;
    }

    public void setFilmId(Film filmId) {
        FilmId = filmId;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }
}
