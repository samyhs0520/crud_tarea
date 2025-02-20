package com.pruebash.crud_tareas.service;

import com.pruebash.crud_tareas.entity.Tarea;
import com.pruebash.crud_tareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService {
    @Autowired
    private TareaRepository tareaRepository;

    public List<Tarea> getAll(){
        return tareaRepository.findAll();
    }
    public Optional<Tarea> getById(Long id){
        return tareaRepository.findById(id);
    }
    public Tarea save(Tarea tarea){
        return tareaRepository.save(tarea);
    }
    public void delete(Long id){}
}
