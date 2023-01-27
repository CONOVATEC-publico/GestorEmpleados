/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author USER1
 */
public class Integrante extends Persona{

    enum actividad {ACTIVO, OCASIONAL, INACTIVO};
    //Area area;//Area area;//Area area;//Area area;//Area area;//Area area;//Area area;//Area area;
    
    
    
    public Integrante(String nombre, String edad, String dni) {
        super(nombre, edad, dni);
        
    }

    @Override
    void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Integrante{" +super.nombre +','+super.edad+','+super.dni +'}';
    }
            
    
    
}
