package com.medico.katerin.app.Controladores;

import com.medico.katerin.app.variables.Medicos;
import com.medico.katerin.app.Repository.medicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/medicos")
public class MedicosController {

    @Autowired
    private medicosRepository medicosRepository;

    @GetMapping
    public String getAllMedicos(Model model) {
        model.addAttribute("medicos", medicosRepository.findAll());
        return "verMedicos"; // Vista para listar médicos
    }

    @GetMapping("/nuevo")
    public String nuevoMedicoForm(Model model) {
        model.addAttribute("medico", new Medicos());
        return "formMedicos"; // Vista del formulario de médicos
    }

    @PostMapping
    public String guardarMedico(@ModelAttribute Medicos medico) {
        medicosRepository.save(medico);
        return "redirect:/medicos";
    }

    @GetMapping("/editar/{id}")
    public String editarMedico(@PathVariable Long id, Model model) {
        model.addAttribute("medico", medicosRepository.findById(id).orElse(null));
        return "formMedicos"; // Formulario de edición
    }

    @PostMapping("/editar/{id}")
    public String actualizarMedico(@PathVariable Long id, @ModelAttribute Medicos medico, RedirectAttributes redirectAttributes) {
        medico.setId(id); // Asegúrate de establecer el ID para la actualización
        medicosRepository.save(medico);

        // Añadir un mensaje de éxito
        redirectAttributes.addFlashAttribute("mensaje", "Los datos del médico se han actualizado correctamente.");
        
        // Redirigir a la lista de médicos
        return "redirect:/medicos";
    }

    @GetMapping("/ver/{id}")
    public String verMedico(@PathVariable Long id, Model model) {
        model.addAttribute("medico", medicosRepository.findById(id).orElse(null));
        return "verMedicos"; // Vista para ver un médico
    }
}
