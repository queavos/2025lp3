/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package unae.lp3.inventario.controllers;

import unae.lp3.inventario.models.TipoEquipo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ossva
 */
@Controller
public class TipoEquiposController {

    @RequestMapping("/lista")
    public String index(Model model) {
        model.addAttribute("titulo",
                "Tipos de Equipos");
        //System.out.println("hola"); 
        List<TipoEquipo> lista = new ArrayList<>();
        lista.add(new TipoEquipo(1,
                "Router",
                "Router",
                "router.png"));
        TipoEquipo tequi1 = new TipoEquipo();
        tequi1.setId(2);
        tequi1.setNombre("Proyector");
        tequi1.setDescripcion("proyector ");
        tequi1.setImagen("proyector.png");
        lista.add(tequi1);
        model.addAttribute("datos",
                lista);

        return "lista";
    }

}
