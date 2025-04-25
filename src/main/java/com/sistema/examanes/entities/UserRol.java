package com.sistema.examanes.entities;

import jakarta.persistence.*;

@Entity
public class UserRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne
    private Rol rol;

    public UserRol() {
    }

    public UserRol(User user, Rol rol) {
        this.user = user;
        this.rol = rol;
    }
}
