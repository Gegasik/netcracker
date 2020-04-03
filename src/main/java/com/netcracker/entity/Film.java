package com.netcracker.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Film {
    public Film() {
    }

    @Id
    @Column(name = "id_film")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFilm;
    @Column(name = "film_name")
    private String filmName;
    @Column(name = "film_description")
    private String filmDescriptions;
    @OneToMany(mappedBy = "film")
    @JsonManagedReference
    private Set<SessionFilm> sessions;

    @ManyToMany
    @JoinTable(
            name = "films_categories",
            joinColumns = {@JoinColumn(name = "id_film")},
            inverseJoinColumns = {@JoinColumn(name = "id_category")})
    @JsonManagedReference
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

    public Set<SessionFilm> getSessions() {
        return sessions;
    }

    public void setSessions(Set<SessionFilm> sessions_films) {
        this.sessions = sessions_films;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
