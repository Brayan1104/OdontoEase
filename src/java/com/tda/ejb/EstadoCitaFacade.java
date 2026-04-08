/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tda.ejb;

import com.tda.entity.EstadoCita;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class EstadoCitaFacade extends AbstractFacade<EstadoCita> {

    @PersistenceContext(unitName = "OdontoEasePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadoCitaFacade() {
        super(EstadoCita.class);
    }
    
}
