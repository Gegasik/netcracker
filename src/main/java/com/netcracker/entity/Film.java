package com.netcracker.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Film {
    public Film() {
    }
    @Id
    @Column(name="id_film")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idFilm;
    @Column(name="film_name")
    private String filmName;
    @Column(name="descriptions")
    private String filmDescriptions;
    @OneToMany(mappedBy = "FilmId")
    private Set<SessionFilm> Sessions_films;
    @ManyToMany
    @JoinTable(
            name="films_categories",
            joinColumns= {@JoinColumn (name = "id_film")},
            inverseJoinColumns= {@JoinColumn (name = "id_category")})
    Set<Category> categories = new HashSet<>();

    public long getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(long idFilm) {
        this.idFilm = idFilm;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmDescriptions() {
        return filmDescriptions;
    }

    public void setFilmDescriptions(String filmDescriptions) {
        this.filmDescriptions = filmDescriptions;
    }

    public Set<SessionFilm> getSessions_films() {
        return Sessions_films;
    }

    public void setSessions_films(Set<SessionFilm> sessions_films) {
        Sessions_films = sessions_films;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> subscriptions) {
        this.categories = subscriptions;
    }
}
