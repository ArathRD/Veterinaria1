package com.umg.Veterinaria.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class VacunaDTO {
    private String anio;
    private String vacuna;
    private int id_mascota;
}
