/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerVivo;

/**
 *
 * @author Andres
 */
public class Planta extends SerVivo{
    
    //Aca v Le indicamos al programa que estamos sobre escribiendo el codigo.
    @Override
    public void alimentarse(){
        System.out.println("La planta se alimenta por fotoSintesis y me alimento bien");
    }
}
