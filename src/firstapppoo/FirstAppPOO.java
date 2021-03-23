/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapppoo;

import SerVivo.*;

/**
 *
 * @author Andres
 */
public class FirstAppPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        AnimalHervivoro Conejo = new AnimalHervivoro();
        Conejo.alimentarse();
        
        Planta Girasol = new Planta();
        Girasol.alimentarse();
        
        AnimalCarnivoro Leon = new AnimalCarnivoro();
        Leon.alimentarse();
    }
    
}
