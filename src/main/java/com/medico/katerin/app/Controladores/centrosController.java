package com.medico.katerin.app.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.medico.katerin.app.Repository.centrosRepository;
import com.medico.katerin.app.variables.Centros;
import com.medico.katerin.app.variables.Director;

@Controller
public class centrosController {

    @Autowired
    private centrosRepository centrosRepository;

    // Muestra la página principal de centros
    @GetMapping("/centros")
    public String mostrarPaginaCentros() {
        return "centros"; // Suponiendo que "centros.html" es la vista principal de centros
    }
   
    @GetMapping("/formCentros")
    public String showForm(Model model) {
        Centros centro = new Centros();
        centro.setDirector(new Director()); // Asegúrate de inicializar el director si es necesario
        model.addAttribute("centro", centro);
        return "formCentros";
    }



    // Muestra los detalles de un centro específico
    @GetMapping("/centros/{id}")
    public String verCentro(@PathVariable Long id, Model model) {
        Centros centro = centrosRepository.findById(id).orElseThrow();
        model.addAttribute("centro", centro);
        return "verCentros"; // Asegúrate de que el nombre coincide con tu plantilla Thymeleaf
    }

    // Muestra la vista para visualizar un centro
    @GetMapping("/verCentros")
    public String mostrarVerCentros() {
        return "verCentros"; // Nombre de la vista HTML correspondiente a la visualización de un centro
    }

    // Muestra la vista para eliminar un centro
    @GetMapping("/eliminarCentro")
    public String mostrarEliminarCentro() {
        return "eliminarCentro"; // Nombre de la vista HTML correspondiente a la eliminación de centros
    }

    // Muestra el formulario para asignar un director a un centro
    @GetMapping("/asignarDirector")
    public String mostrarFormAsignarDirector() {
        return "asignarDirector"; // Nombre de la vista HTML correspondiente a la asignación de directores
    }
}
