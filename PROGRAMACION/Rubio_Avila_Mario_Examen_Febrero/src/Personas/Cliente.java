/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

/**
 *
 * @author cliente
 */
public class Cliente {
    //Variables
    private String dni;
    private String nombre;  
    private int edad;
    private String direccion;  
    private String tipo; //Tipo "Normal o Vip"
    
//Constructores
    public Cliente(String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.direccion="";
        this.edad=0;
        this.tipo="Normal";
    }
    
    public Cliente(String dni, String nombre, String direccion){
        this.dni=dni;
        this.nombre=nombre;
        this.direccion=direccion;
        this.edad=0;
        this.tipo="Normal";
    }
    
    public Cliente(String dni, String nombre, String direccion, int edad, String tipo){
        this.dni=dni;
        this.nombre=nombre;
        this.direccion=direccion;
        this.edad=edad;
        this.tipo=tipo;
    }

    public Cliente(Cliente c1){
        this.dni=c1.dni;
        this.nombre=c1.nombre;
        this.direccion=c1.direccion;
        this.edad=c1.edad;
        this.tipo=c1.tipo;
    }

    //Funciones Getter y Setter
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Metodos
    /**
     * Realiza la muestra del cliente con el modelo de la factura
     */
    public void mostrarClienteFactura(){
        System.out.println("\t\t***************************************");
        System.out.println("\t\t*Nombre Cliente : "+ this.dni);
        System.out.println("\t\t*           Dni : "+ this.nombre);
        System.out.println("\t\t*     Direccion : "+ this.direccion);
        System.out.println("\t\t***************************************");
    }
 
    /**
     * Realiza la muestra todos los datos del cliente
     */
    public void mostrarCliente(){
        System.out.println("---------------------------------------");
        System.out.println("Nombre Cliente : "+ this.dni);
        System.out.println("           Dni : "+ this.nombre);
        System.out.println("     Direccion : "+ this.direccion);
        System.out.println("          Edad : "+ this.edad);
        System.out.println("          Tipo : "+ this.dni);
        System.out.println("---------------------------------------");
    }
            
    
}
