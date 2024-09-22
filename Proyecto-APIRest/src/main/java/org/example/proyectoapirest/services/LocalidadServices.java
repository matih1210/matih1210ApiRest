package org.example.proyectoapirest.services;

import jakarta.transaction.Transactional;
import org.example.proyectoapirest.entities.Localidad;
import org.example.proyectoapirest.entities.Persona;
import org.example.proyectoapirest.repositories.LocalidadRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class LocalidadServices implements BaseService<Localidad> {

    private LocalidadRepository localidadRepository;

    public LocalidadServices(LocalidadRepository localidadRepository) {
        this.localidadRepository = localidadRepository;
    }

    @Override
    @Transactional
    public List<Localidad> findAll() throws Exception {
        try {
            List<Localidad> entities = localidadRepository.findAll();
            return entities;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Localidad findById(Long id) throws Exception {
        try {
            Optional<Localidad> entityOptional = localidadRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Localidad save(Localidad entity) throws Exception {
        try {
            entity = localidadRepository.save(entity);
            return entity;
        } catch (Exception e){
            throw new Exception(e.getMessage());

        }
    }

    @Override
    @Transactional
    public Localidad update(Long id, Localidad entity) throws Exception {
        try {
            Optional<Localidad> entityOpcional = localidadRepository.findById(id);
            Localidad localidad = entityOpcional.get();
            localidad = localidadRepository.save(entity);
            return localidad;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if (localidadRepository.existsById(id)) {
                localidadRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
