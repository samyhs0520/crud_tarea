package com.pruebash.crud_tareas.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tarea")

public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable=false)
    private String titulo;
    private String descripcion ;
    private boolean completado = false;

    public Tarea() {
    }
    public Tarea(String titulo, String descripcion, boolean completado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completado = completado;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public boolean isCompletado() {
        return completado;
    }
}
