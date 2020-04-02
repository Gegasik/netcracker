package com.netcracker.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "cinema_hall")
public class CinemaHall {
    public CinemaHall() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hall")
    private Long idHall;
    @Column(name = "name_hall")
    private String nameHall;
    private int capacity;
    @OneToMany(mappedBy = "cinemaHall")
    private Set<SessionFilm> sessionFilms;


    public Long getIdHall() {
        return idHall;
    }

    public void setIdHall(Long idHall) {
        this.idHall = idHall;
    }

    public String getNameHall() {
        return nameHall;
    }

    public void setNameHall(String nameHall) {
        this.nameHall = nameHall;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Set<SessionFilm> getSessionFilms() {
        return sessionFilms;
    }

    public void setSessionFilms(Set<SessionFilm> sessionFilms) {
        this.sessionFilms = sessionFilms;
    }

}
