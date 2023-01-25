/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author USER1
 */

public abstract class Integrante extends Persona{
    enum actividad {ACTIVO, OCASIONAL, INACTIVO};
    Area area;
    
    @Override
    abstract void mostrar();
    
    //no se como hacer un enum de actividad.
    abstract void llenarHorasActividad();
}
