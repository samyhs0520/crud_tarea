package com.pruebash.crud_tareas.repository;

// Correct declaration for a repository
import com.pruebash.crud_tareas.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TareaRepository extends JpaRepository<Tarea, Integer> {
    // Custom queries if necessary
}
