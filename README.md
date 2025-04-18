# 🏥 Sistema Médico - Spring Boot + JPA

Este proyecto consiste en el desarrollo de un sistema médico que permite gestionar centros médicos, departamentos, médicos, pacientes, servicios y directores. Está desarrollado con **Spring Boot**, utilizando **JPA (Java Persistence API)** para la persistencia de datos.

---

## 📌 Características principales

- Gestión de **Centros Médicos** (crear, listar, editar, eliminar).
- Gestión de **Departamentos** asociados a cada centro.
- Gestión de **Médicos** y su asignación a centros y departamentos.
- Registro y administración de **Pacientes**.
- Control de **Servicios Médicos** disponibles.
- Asignación de **Directores** a centros médicos.
- Interfaz web desarrollada con **Thymeleaf** y **Bootstrap**.

---

## 🧰 Tecnologías utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA (Hibernate)  
- Thymeleaf  
- Bootstrap  
- Maven  
- H2 

---
## 🏗️ Estructura del proyecto

```text
src
└── main
    ├── java
    │   └── com.proyecto.sistemamedico
    │       ├── controllers              # Controladores del sistema
    │       ├── models                  # Entidades del modelo de datos
    │       ├── repositories            # Interfaces de acceso a datos (JPA)
    │       └── SistemaMedicoApplication.java  # Clase principal
    └── resources
        ├── templates                  # Vistas Thymeleaf (HTML)
        ├── static                     # Archivos estáticos (CSS, JS, imágenes)
        └── application.properties     # Configuración del proyecto

```
---
## ⚙️ Configuración de la base de datos

Por defecto, se usa H2 en memoria. En `application.properties` puedes modificar la configuración para otra base de datos si lo deseas:

```properties
spring.datasource.url=jdbc:h2:mem:medicoDB
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.h2.console.enabled=true

```
---

## 🚀 ¿Cómo ejecutar el proyecto?
Pasos claros para ejecutar el proyecto localmente:

1. Clonar el repositorio.

2. Abrirlo en un IDE.

3. Ejecutar la clase principal.

4. Acceder a http://localhost:PORT.

5. Accede a la consola: http://localhost:PORT/h2-console

---

📋 Funcionalidades por módulo

| Módulo | Funcionalidades |
|--------|-----------------|
| Centros | CRUD de centros médicos |
| Departamentos | Crear y asignar a centros |
| Médicos | Registro y asignación a departamentos |
| Pacientes | Registro, edición y gestión de historial |
| Servicios | Registro de servicios médicos disponibles |
| Directores | Asignación única por centro |

---

✅ Estado del proyecto

 ☑️CRUD básico con JPA

 ☑️ Relaciones entre entidades

 ☑️ Interfaz con Thymeleaf

 ☑️ Estilos con Bootstrap

 ☑️ Autenticación de usuarios

 ☑️ Roles y permisos

 ☑️ Despliegue
