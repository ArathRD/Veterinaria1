package com.umg.Veterinaria.controller;
import com.umg.Veterinaria.dto.MascotaDTO;
import com.umg.Veterinaria.entities.MascotaEntity;
import com.umg.Veterinaria.repositories.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.tags.HtmlEscapeTag;

@RestController
public class indexController {

    @Autowired
    private MascotaRepository mascotaRepository;

    @PostMapping(value = "/createMascota", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public MascotaEntity createMascota(@RequestBody MascotaDTO mascotaDTO) {
        MascotaEntity mascotaEntity = new MascotaEntity();


        mascotaEntity.setNombre(mascotaDTO.getNombre());
        this.mascotaRepository.save(mascotaEntity);
        return mascotaEntity;
    }
}
