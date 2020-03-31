package com.netcracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "category")
public class Category {
    public Category() {
    }
    @Id
    @Column(name = "id_category")
    private long idCategory;
    @Column(name="name_category")
    private String nameCategory;
            @ManyToMany(mappedBy="categories")
    private Set<Film> films = new HashSet<>();

    public long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(long idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> accounts) {
        this.films = accounts;
    }
}
