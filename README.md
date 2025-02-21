# Proyecto Full Stack: Spring Boot & Angular

Este repositorio contiene dos proyectos:
- **Backend**: Implementado en Spring Boot.
- **Frontend**: Implementado en Angular.

## Requisitos previos
Asegúrate de tener instalados los siguientes requisitos antes de ejecutar los proyectos:

- **Java 17** o superior
- **Maven**
- **Node.js** y **npm**
- **Angular CLI**
- **Base de datos H2**

---


### 1. Ejecutar el Backend (Spring Boot)

1. Clona el repositorio:
   ```bash
   git clone https://github.com/samyhs0520/crud_tarea.git
   ```
2. Configura la base de datos en `application.properties` en el caso de ser requerido
3. Compila y ejecuta el proyecto con Maven:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
4. El backend estará disponible en: `http://localhost:8080`

---

### 2. Ejecutar el Frontend (Angular)
1. Clona el repositorio:
   ```bash
   git clone https://github.com/samyhs0520/front_tareas.git
   ```
2. Instala las dependencias:
   ```bash
   npm install
   ```
3. Ejecuta el servidor de desarrollo:
   ```bash
   ng serve
   ```
4. El frontend estará disponible en: `http://localhost:4200`




