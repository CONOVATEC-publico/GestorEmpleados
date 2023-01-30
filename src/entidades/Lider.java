/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author USER1
 */
public class Lider extends Persona {
    Area area;

    public Lider(Area area, String nombre, String edad, String dni) {
        super(nombre, edad, dni);
        this.area = area;
    }
    
    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void evaluarPostulante() {

    }

    public void retirarIntegrante() {
        
    }

    public void guardarIntegrante(Integrante integrante) {
        area.integrantes.add(integrante);
    }

    @Override
    void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

}
