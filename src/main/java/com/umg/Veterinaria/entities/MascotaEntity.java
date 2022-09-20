package com.umg.Veterinaria.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "mascotas")
public class MascotaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_mascota;
    @Basic
    private String nombre;
}
