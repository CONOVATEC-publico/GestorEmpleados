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
public class Area {
    String nombre;
    ArrayList<Integrante> integrantes;
    //Comunidad comunidad;

    public Area(String nombre) {
        this.nombre = nombre;
        integrantes=new ArrayList<Integrante>();
    }
    
    public Area(String nombre, ArrayList<Integrante> integrantes) {
        this.nombre = nombre;
        this.integrantes = integrantes;
        //this.comunidad = comunidad;
    }
    
    public void mostrarIntegrantes(){
        System.out.println("Integrantes:"+integrantes.toString());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Integrante> integrantes) {
        this.integrantes = integrantes;
    }
    
    
}