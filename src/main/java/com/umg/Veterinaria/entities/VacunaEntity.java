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
@Table(name = "vacunas")
public class VacunaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vacuna;
    @Basic
    private String anio;
    @Basic
    private String vacuna;
    @Basic
    private int id_mascota;
}
