/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaerejbdemo;

import javax.ejb.Stateless;

/**
 *
 * @author Aunchalee.k
 */
@Stateless
public class SquareSEssionBean implements SquareSEssionBeanRemote, SquareSEssionBeanLocal {

    @Override
    public int getSquare(int var) {
        return (var*var);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
