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
    public Lider(Area area) {
        this.area = area;
    }

    Area area;

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void evaluarPostulante() {

    }

    void retirarIntegrante() {

    }

    void guardarIntegrante(Integrante integrante) {
        area.integrantes.add(integrante);
    }

    @Override
    void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

}
