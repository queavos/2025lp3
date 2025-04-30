/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package unae.lpe.cenadeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import unae.lpe.cenadeapp.models.Sala;
import unae.lpe.cenadeapp.repositories.SalaRepository;

/**
 *
 * @author ossva
 */
@Controller
@RequestMapping("/salas")
public class SalaController {

    @Autowired
    private SalaRepository salaRepository;

    @RequestMapping("/")
    public String lista(Model model) {
        model.addAttribute("salas",
                salaRepository.findAll());
        return "sala/lista";
    }

    @RequestMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("sala",
                new Sala());
        return "sala/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Sala sala) {
        salaRepository.save(sala);
        return "redirect:/salas/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id,
            Model model) {
        //salaRepository.deleteById(id);
        Sala sala = salaRepository.findById(id).
                get();
        model.addAttribute("sala",
                sala);
        return "sala/form";
    }

    @GetMapping("/borrar/{id}")
    public String borrar(@PathVariable Long id) {
        salaRepository.deleteById(id);
        return "redirect:/salas/";
    }

}
