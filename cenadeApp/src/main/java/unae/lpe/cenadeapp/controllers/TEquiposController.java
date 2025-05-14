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
import unae.lpe.cenadeapp.models.TipoEquipos;
import unae.lpe.cenadeapp.repositories.TipoEquipoRepository;

/**
 *
 * @author ossva
 */
@Controller
@RequestMapping("/tequipos")
public class TEquiposController {

    @Autowired
    private TipoEquipoRepository tequiposRepository;

    @RequestMapping("/")
    public String lista(Model model) {

        model.addAttribute("datos",
                tequiposRepository.findAll());
        return "tequipos/lista";
    }

    @RequestMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("dato",
                new TipoEquipos());
        return "tequipos/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute TipoEquipos dato) {
        tequiposRepository.save(dato);
        return "redirect:/tequipos/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id,
            Model model) {
        //tequiposRepository.deleteById(id);
        //TipoEquipos tequipos = tequiposRepository.findById(id).get();
        TipoEquipos tequipos = tequiposRepository.findById(id).
                get();
        model.addAttribute("dato",
                tequipos);
        return "tequipos/form";
    }

    @GetMapping("/borrar/{id}")
    public String borrar(@PathVariable Integer id) {
        //tequiposRepository.deleteById(id);
        tequiposRepository.deleteById(id);
        return "redirect:/tequipos/";
    }

}
