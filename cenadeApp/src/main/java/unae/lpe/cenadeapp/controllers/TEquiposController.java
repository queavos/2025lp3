/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package unae.lpe.cenadeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import unae.lpe.cenadeapp.models.TipoEquipos;
import unae.lpe.cenadeapp.repositories.TipoEquipoRepository;

/**
 *
 * @author ossva
 */
@Controller
public class TEquiposController {

    @Autowired
    private TipoEquipoRepository tequipoRepo;

    @RequestMapping("/tequipos")
    public String page(Model model) {
        TipoEquipos eq1 = new TipoEquipos();
        eq1.setNombre("laptop");
        eq1.setDescripcion("laptop");
        eq1.setImagen("laptop");
        tequipoRepo.save(eq1);
        model.addAttribute("title",
                "Titulo");

        return "tequipos/lista";
    }

}
