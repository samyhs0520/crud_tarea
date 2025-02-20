package com.pruebash.crud_tareas.repository;

import com.pruebash.crud_tareas.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TareaRepository extends JpaRepository<Tarea,Long> {

}
