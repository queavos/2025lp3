/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package unae.lpe.cenadeapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unae.lpe.cenadeapp.models.TipoEquipos;

/**
 *
 * @author ossva
 */
public interface TipoEquipoRepository
        extends JpaRepository<TipoEquipos, Integer> {
}
