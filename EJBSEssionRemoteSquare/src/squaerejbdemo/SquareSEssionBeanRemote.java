/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaerejbdemo;

import javax.ejb.Remote;

/**
 *
 * @author Aunchalee.k
 */
@Remote
public interface SquareSEssionBeanRemote {

    int getSquare(int var);
    
}
