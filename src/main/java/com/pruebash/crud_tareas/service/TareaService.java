package com.pruebash.crud_tareas.service;

import com.pruebash.crud_tareas.entity.Tarea;
import com.pruebash.crud_tareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService implements CommandLineRunner {
    @Autowired
    private TareaRepository tareaRepository;

    public List<Tarea> getAll(){
        return tareaRepository.findAll();
    }
    public Optional<Tarea> getById(Integer id){
        return tareaRepository.findById(id);
    }
    public Tarea save(Tarea tarea){
        return tareaRepository.save(tarea);
    }
    public void delete(Integer id){}

    @Override
    public void run(String... args) throws Exception {
        // Insertar tres tareas al iniciar la aplicación
        if (tareaRepository.count() == 0) {  // Evita duplicados al reiniciar
            tareaRepository.save(new Tarea("Aprender Spring Boot", "Estudiar la documentación", false));
            tareaRepository.save(new Tarea("Crear API CRUD", "Implementar backend con Spring Boot", false));
            tareaRepository.save(new Tarea("Conectar con Angular", "Hacer la integración con el frontend", false));
        }
    }
}
