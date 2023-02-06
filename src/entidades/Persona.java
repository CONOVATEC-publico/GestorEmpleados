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
    private String nombre;
    private String edad;
    private String dni;

    public Persona(String nombre, String edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    
    public Persona() {
        
    }
    
    abstract void mostrar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
