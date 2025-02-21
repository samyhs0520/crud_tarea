package com.pruebash.crud_tareas.controller;

import com.pruebash.crud_tareas.entity.Tarea;
import com.pruebash.crud_tareas.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tareas")
@CrossOrigin(origins = "http://localhost:4200")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tarea> getAllTareas() {
        return tareaService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Tarea> getTareaById(@PathVariable Integer id) {
        return tareaService.getById(id);
    }

    @PostMapping
    public Tarea saveTarea(@RequestBody Tarea tarea) {
        return tareaService.save(tarea);
    }
    @PutMapping("/{id}")
    public Tarea updateTarea(@PathVariable Integer id, @RequestBody Tarea tarea) {
        tarea.setId(id);
        return tareaService.save(tarea);

    }
    @DeleteMapping("/{id}")
    public void deleteTareaById(@PathVariable Integer id) {
        tareaService.delete(id);

    }


}
