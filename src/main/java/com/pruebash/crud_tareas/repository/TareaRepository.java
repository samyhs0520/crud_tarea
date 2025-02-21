package com.pruebash.crud_tareas.repository;

// Correct declaration for a repository
import com.pruebash.crud_tareas.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TareaRepository extends JpaRepository<Tarea, Integer> {
    List<Tarea> titulo(String titulo);
    // Custom queries if necessary
}
