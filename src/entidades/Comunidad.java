/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author USER1
 */
public class Comunidad {
    String nombre;
    ArrayList<Area> areas;

    public Comunidad(String nombre) {
        this.nombre = nombre;
        areas=new ArrayList<>();
    }

    
    
    public Comunidad(String nombre, ArrayList<Area> areas) {
        this.nombre = nombre;
        this.areas = areas;
    }
    
}
