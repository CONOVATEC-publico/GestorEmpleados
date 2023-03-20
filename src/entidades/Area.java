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

    public Integrante getIntegrante(String DNI){
        for (Integrante integrante : integrantes) {
            if (integrante.getDni().equals(DNI)) {
                return integrante;
            }
        }
        return null;
    }

    public ArrayList<Integrante> getIntegrantes(String nombreFiltrar) {
        if (nombreFiltrar.trim().equals("")) {
            return integrantes;
        }

        ArrayList<Integrante> integrantesFiltrados = new ArrayList<>();
        for (Integrante i : integrantes) {
            if (i.getNombre().toUpperCase().contains(nombreFiltrar.toUpperCase())) {
                integrantesFiltrados.add(i);
            }
        }
        return integrantesFiltrados;
    }

    public void setIntegrantes(ArrayList<Integrante> integrantes) {
        this.integrantes = integrantes;
    }
 
    public void guardarIntegrante(Integrante integrante) {
        integrantes.add(integrante);
    }

    public void modificarIntegrante(String dNI, Integrante integranteModificado) {
        int i = -1;
        for (Integrante integrante : integrantes) {
            if (integrante.getDni().equals(dNI)) {
                i = integrantes.indexOf(integrante);
                break;
            }
        }

        if (i >= 0) {
            integrantes.set(i, integranteModificado);
        }
    }

    public void eliminarIntegrante(String dNI) {
        int i = -1;
        for (Integrante integrante : integrantes) {
            if (integrante.getDni().equals(dNI)) {
                i = integrantes.indexOf(integrante);
                integrantes.remove(i);
                break;
            }
        }
    }
}