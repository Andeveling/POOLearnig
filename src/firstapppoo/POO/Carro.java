/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstapppoo.POO;

/**
 *
 * @author Andres
 */
public class Carro 
{
    //---Variables---//
    int ruedas, largo, ancho, motor, peso;
    
    //---Constructores---//
    public Carro()
    {
        ruedas = 4;
        largo = 2000;
        ancho = 1000;
        motor = 1600;
        peso = 500;
    }
    //--Metodos---//
    public void arrancar()
    {
        System.out.println("Yo puedo arrancar");
    }
    public void pitar()
    {
        System.out.println("Yo puedo Pitar");
    }
}
