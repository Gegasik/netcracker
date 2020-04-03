package com.netcracker.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Users {
    public Users() {
    }

    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_email")
    private String user_Email;
    @Column(name = "password")
    private String password;

    @ManyToMany
    @JoinTable(
            name = "ticket",
            joinColumns = {@JoinColumn(name = "owner_id")},
            inverseJoinColumns = {@JoinColumn(name = "id_session")})
    @JsonManagedReference
    Set<SessionFilm> sessionFilms = new HashSet<>();

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUser_Email() {
        return user_Email;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<SessionFilm> getSessionFilms() {
        return sessionFilms;
    }

    public void setSessionFilms(Set<SessionFilm> subscriptions) {
        this.sessionFilms = subscriptions;
    }
}
