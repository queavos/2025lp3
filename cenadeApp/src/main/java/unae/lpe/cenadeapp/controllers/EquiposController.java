/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package unae.lpe.cenadeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import unae.lpe.cenadeapp.models.Equipo;
import unae.lpe.cenadeapp.models.TipoEquipos;
import unae.lpe.cenadeapp.repositories.EquiposRepository;
import unae.lpe.cenadeapp.repositories.SalaRepository;
import unae.lpe.cenadeapp.repositories.TipoEquipoRepository;

/**
 *
 * @author ossva
 */
@Controller
@RequestMapping("/equipos")
public class EquiposController {

    @Autowired
    private EquiposRepository equiRepo;
    @Autowired
    private TipoEquipoRepository tequiposRepository;
    @Autowired
    private SalaRepository salaRepository;

    @RequestMapping("/")
    public String lista(Model model) {
        model.addAttribute("datos",
                equiRepo.findAll());
        return "equipos/lista";
    }

    @RequestMapping("/nuevo")
    public String nuevo(Model model) {

        model.addAttribute("dato",
                new Equipo());
        model.addAttribute("tequipos",
                tequiposRepository.findAll());
        model.addAttribute("salas",
                salaRepository.findAll());
        return "equipos/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Equipo dato) {
        equiRepo.save(dato);
        return "redirect:/tequipos/";
    }
}
