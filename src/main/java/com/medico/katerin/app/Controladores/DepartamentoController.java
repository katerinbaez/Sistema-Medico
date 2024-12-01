package com.medico.katerin.app.Controladores;

import com.medico.katerin.app.variables.Departamento;
import com.medico.katerin.app.Repository.departamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private departamentoRepository departamentoRepository;

    @GetMapping
    public String getAllDepartamentos(Model model) {
        model.addAttribute("departamentos", departamentoRepository.findAll());
        return "verDepartamentos"; // Cambié a verDepartamentos para la lista
    }

    @GetMapping("/nuevo")
    public String nuevoDepartamentoForm(Model model) {
        model.addAttribute("departamento", new Departamento());
        return "formDepartamento"; // Vista del formulario de departamentos
    }

    @PostMapping
    public String guardarDepartamento(@ModelAttribute Departamento departamento) {
        departamentoRepository.save(departamento);
        return "redirect:/departamentos";
    }

    @GetMapping("/editar/{id}")
    public String editarDepartamento(@PathVariable Long id, Model model) {
        model.addAttribute("departamento", departamentoRepository.findById(id).orElse(null));
        return "formDepartamento"; // Formulario para editar
    }

    @PostMapping("/editar/{id}")
    public String actualizarDepartamento(@ModelAttribute Departamento departamento) {
        departamentoRepository.save(departamento);
        return "redirect:/departamentos";
    }

    @GetMapping("/ver/{id}")
    public String verDepartamento(@PathVariable Long id, Model model) {
        model.addAttribute("departamento", departamentoRepository.findById(id).orElse(null));
        return "verDepartamento"; // Vista para ver un departamento
    }
}
