/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owenrodriguez.sessionsbeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.owenrodriguez.entities.Areas;

/**
 *
 * @author ISAAC
 */
@Stateless
public class AreasFacade extends AbstractFacade<Areas> implements AreasFacadeLocal {

    @PersistenceContext(unitName = "WebEventos2018480PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AreasFacade() {
        super(Areas.class);
    }
    
}
