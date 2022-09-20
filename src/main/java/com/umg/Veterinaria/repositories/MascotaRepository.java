package com.umg.Veterinaria.repositories;

import com.umg.Veterinaria.entities.MascotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository extends JpaRepository<MascotaEntity, Integer> {
}
