package com.sistema.examanes.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="roles")
public class Rol {

    @Id
    private Long rolId;
    private String rolName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rol")
    private Set<UserRol> userRoles = new HashSet<>();

    public Rol() {}

    public Rol(String rolName) {
        this.rolName = rolName;
    }
}
