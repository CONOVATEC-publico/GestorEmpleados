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
    private Area area;
    private String usuario;
    private String clave;

    public Lider(Area area, String nombre, String edad, String dni, String usuario, String clave) {
        super(nombre, edad, dni);
        this.area = area;
        this.usuario = usuario;
        this.clave = clave;
    }

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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

}
