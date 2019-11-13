/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea10.pkg1.Mascotas;

/**
 *
 * @author Damel_VPC
 */
public class Cuidador {

    //Getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Constructores
    public Cuidador(String nombre, String apellido1, String apellido2, String DNI, String direccion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.DNI = DNI;
        this.direccion = direccion;
    }

    public Cuidador(String DNI, String direccion) {
        this.nombre = "";
        this.apellido1 = "";
        this.apellido2 = "";
        this.DNI = DNI;
        this.direccion = direccion;
    }
    
   //Funciones
    public void mostrarCuidadorConsola(){
        System.out.println("  CUIDADOR : " + nombre + " " + apellido1 + " " + apellido2 + " " + DNI + " " + direccion);
    }
    
   //Variables
   private String nombre;       //Lo hereda en base de datos de persona (Aqui directamente lo tiene cuidador)
   private String apellido1;    //Lo hereda en base de datos de persona (Aqui directamente lo tiene cuidador)
   private String apellido2;    //Lo hereda en base de datos de persona (Aqui directamente lo tiene cuidador)
   private String DNI;          //Lo obligado por el ejercicio
   private String direccion;    //Lo obligado por el ejercicio
   
}
