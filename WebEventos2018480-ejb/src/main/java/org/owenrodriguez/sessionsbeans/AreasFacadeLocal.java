/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owenrodriguez.sessionsbeans;

import java.util.List;
import javax.ejb.Local;
import org.owenrodriguez.entities.Areas;

/**
 *
 * @author ISAAC
 */
@Local
public interface AreasFacadeLocal {

    void create(Areas areas);

    void edit(Areas areas);

    void remove(Areas areas);

    Areas find(Object id);

    List<Areas> findAll();

    List<Areas> findRange(int[] range);

    int count();
    
}
