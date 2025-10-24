package EjercicioPractico1_Carlos_Barboza.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Inicio");
        return "index";
    }

    @GetMapping("/libros")
    public String libros(Model model) {
        model.addAttribute("title", "Lista de Libros");
        return "libros";
    }

    @GetMapping("/queja")
    public String queja(Model model) {
        model.addAttribute("title", "Quejas y Sugerencias");
        return "queja";
    }
}