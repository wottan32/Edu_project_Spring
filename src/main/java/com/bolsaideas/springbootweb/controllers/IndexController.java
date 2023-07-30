package com.bolsaideas.springbootweb.controllers;

import com.bolsaideas.springbootweb.web.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping(value = {"/index", "/", "/home"})
    public String index(Model model) {
        model.addAttribute("titulo",
                "Mario is the Best!");
    return "index";
    }
    @RequestMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Mario");
        usuario.setApellido("Torres");
        usuario.setEmail("mariotorreslagos@gmail.com");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));

        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de usuarios");
        return "listar";
    }
}