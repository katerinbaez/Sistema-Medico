package com.medico.katerin.app.Controladores;


import com.medico.katerin.app.variables.Director;
import com.medico.katerin.app.Repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/directores")
public class DirectorController {

    @Autowired
    private DirectorRepository directorRepository;

    @GetMapping
    public String getAllDirectores(Model model) {
        model.addAttribute("directores", directorRepository.findAll());
        return "verDirector"; // Vista para listar directores
    }

    @GetMapping("/nuevo")
    public String nuevoDirectorForm(Model model) {
        model.addAttribute("director", new Director());
        return "formDirector"; // Vista del formulario de directores
    }

    @PostMapping
    public String guardarDirector(@ModelAttribute Director director) {
        directorRepository.save(director);
        return "redirect:/directores";
    }

    @GetMapping("/editar/{id}")
    public String editarDirector(@PathVariable Long id, Model model) {
        model.addAttribute("director", directorRepository.findById(id).orElse(null));
        return "formDirector";
    }

    @PostMapping("/editar/{id}")
    public String actualizarDirector(@ModelAttribute Director director) {
        directorRepository.save(director);
        return "redirect:/directores";
    }

    @GetMapping("/ver/{id}")
    public String verDirector(@PathVariable Long id, Model model) {
        model.addAttribute("director", directorRepository.findById(id).orElse(null));
        return "verDirector"; // Vista para ver un director
    }
}