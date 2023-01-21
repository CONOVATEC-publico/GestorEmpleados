/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author USER1
 */
<<<<<<< HEAD
public abstract class Integrante extends Persona{
=======
public class Integrante extends Persona{
    Comunidad comunidad;
    Area[] areas;
    
    @Override
    void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
>>>>>>> cc88134d007d67ac30a9beb64e956e7c171899f0
    
    //no se como hacer un enum de actividad.
    abstract void llenarHorasActividad();
}
