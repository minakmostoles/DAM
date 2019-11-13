/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author Mrubio
 */
public class persona {
    private String nombre;
    private String dni;
    private String direccion;
    
    public persona(String dni){
        this.nombre = "";
        this.dni = dni;
        this.direccion = "";
    } 
    public persona(String dni , String nombre){
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = "";
    }
    public persona(String dni , String nombre, String direccion){
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }
    public persona(persona persona){
        this.nombre = persona.nombre;
        this.dni = persona.dni;
        this.direccion = persona.direccion;
    }

    public void setNombre(String nombre){this.nombre = nombre;}
    public String getNombre(){return this.nombre;}
    
    public void setDNI(String dni){this.dni = dni;}
    public String getDNI(){return this.dni;}

    public void setDireccion(String direccion){this.direccion = direccion;}
    public String getDireccion(){return this.direccion;}
    
    public void mostrarPersona(){
        System.out.println("        Nombre : " + this.nombre);
        System.out.println("           DNI : " + this.dni);
        System.out.println("     Direccion : " + this.direccion);
    }   
}
