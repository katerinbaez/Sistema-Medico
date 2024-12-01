package com.medico.katerin.app.Controladores;

import com.medico.katerin.app.variables.Pacientes;
import com.medico.katerin.app.Repository.pacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pacientes")
public class PacientesController {

    @Autowired
    private pacientesRepository pacientesRepository;

    @GetMapping
    public String getAllPacientes(Model model) {
        model.addAttribute("pacientes", pacientesRepository.findAll());
        return "pacientes/list"; // Vista para listar pacientes
    }

    @GetMapping("/nuevo")
    public String nuevoPacienteForm(Model model) {
        model.addAttribute("paciente", new Pacientes());
        return "pacientes/form"; // Vista del formulario de pacientes
    }

    @PostMapping
    public String guardarPaciente(@ModelAttribute Pacientes paciente) {
        pacientesRepository.save(paciente);
        return "redirect:/pacientes";
    }

    @GetMapping("/editar/{id}")
    public String editarPaciente(@PathVariable Long id, Model model) {
        model.addAttribute("paciente", pacientesRepository.findById(id).orElse(null));
        return "pacientes/form";
    }

    @PostMapping("/editar/{id}")
    public String actualizarPaciente(@ModelAttribute Pacientes paciente) {
        pacientesRepository.save(paciente);
        return "redirect:/pacientes";
    }

    @GetMapping("/ver/{id}")
    public String verPaciente(@PathVariable Long id, Model model) {
        model.addAttribute("paciente", pacientesRepository.findById(id).orElse(null));
        return "pacientes/ver"; // Vista para ver un paciente
    }
}