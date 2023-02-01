/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Area;
import entidades.Comunidad;
import entidades.Integrante;
import entidades.Lider;
import java.util.ArrayList;

import vistas.Ventana01;
import vistas.frmVentana01;

/**
 *
 * @author ASUS1
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Test");
        
        //ArrayList<Integrante> integrantes = new ArrayList<>();
        //integrantes.add(new Integrante("Pepito", "20", "724633333"));
        Comunidad conovatec=new Comunidad("Conovatec");
        ArrayList<Area> areas = new ArrayList<>();
        
        Area desarrolloSoftware=new Area("Desarrollo de Software");
        areas.add(desarrolloSoftware);
        Lider lider1=new Lider(desarrolloSoftware, "adrian", "24", "777777");
        lider1.guardarIntegrante(new Integrante("Juan", "20", "2312312"));
        //lider1.getArea().mostrarIntegrantes();
        //desarrolloSoftware.mostrarIntegrantes();
        
        Area analisisDatos=new Area("Análisis de Datos");
        areas.add(analisisDatos);
        Lider lider2=new Lider(analisisDatos, "Segundo", "24", "88888");
        lider2.guardarIntegrante(new Integrante("Pepe", "23", "66666"));
        lider2.getArea().mostrarIntegrantes();
        
        
    }
    
}
