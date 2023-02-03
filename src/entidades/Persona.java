/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author USER1
 */
public abstract class Persona {
    String nombre;
    String edad;
    String dni;

    public Persona(String nombre, String edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    
    public Persona() {
        
    }
    
    abstract void mostrar();
}
