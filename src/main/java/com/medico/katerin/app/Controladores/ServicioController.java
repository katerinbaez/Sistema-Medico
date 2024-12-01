package com.medico.katerin.app.Controladores;

import com.medico.katerin.app.variables.Servicio;
import com.medico.katerin.app.Repository.servicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/servicios")
public class ServicioController {

    @Autowired
    private servicioRepository servicioRepository;

    @GetMapping
    public String getAllServicios(Model model) {
        model.addAttribute("servicios", servicioRepository.findAll());
        return "servicios/list"; // Vista para listar servicios
    }

    @GetMapping("/nuevo")
    public String nuevoServicioForm(Model model) {
        model.addAttribute("servicio", new Servicio());
        return "servicios/form"; // Vista del formulario de servicios
    }

    @PostMapping
    public String guardarServicio(@ModelAttribute Servicio servicio) {
        servicioRepository.save(servicio);
        return "redirect:/servicios";
    }

    @GetMapping("/editar/{id}")
    public String editarServicio(@PathVariable Long id, Model model) {
        model.addAttribute("servicio", servicioRepository.findById(id).orElse(null));
        return "servicios/form";
    }

    @PostMapping("/editar/{id}")
    public String actualizarServicio(@ModelAttribute Servicio servicio) {
        servicioRepository.save(servicio);
        return "redirect:/servicios";
    }

    @GetMapping("/ver/{id}")
    public String verServicio(@PathVariable Long id, Model model) {
        model.addAttribute("servicio", servicioRepository.findById(id).orElse(null));
        return "servicios/ver"; // Vista para ver un servicio
    }
}