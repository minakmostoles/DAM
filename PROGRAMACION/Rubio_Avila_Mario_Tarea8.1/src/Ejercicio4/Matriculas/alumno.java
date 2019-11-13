/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4.Matriculas;

import java.util.Objects;

/**
 *
 * @author Mario-PC
 */
public class alumno {
    public static int claveIncremental = 1; //Es un valor que incrementara solo con cada instancia
    
    private int clave;
    private String DNI;
    private String email;
    private String nombre;

    //GETTERS AND SETTERS
    
    public int getClave() {
        return clave;
    }
/*No tiene sentido se genera automaticamente con cada instancia
    public void setClave(int clave) {
        this.clave = clave;
    }
*/
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //FUNCIONES PUBLICAS
    
    @Override
    public boolean equals(Object obj){
        if (obj instanceof alumno){
            alumno auxAlum = (alumno)obj;//Hamos un casting para convertirlo en alumno
            if (this.DNI.equalsIgnoreCase(auxAlum.getDNI())) return true;//Si es el mismo aunque la letra este en minuscula o mayuscula
        }
        //Si no acabaremos aqui y volveremos falso
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.DNI);
        hash = 29 * hash + Objects.hashCode(this.email);
        hash = 29 * hash + Objects.hashCode(this.nombre);
        return hash;//Este hash se lo vamos asignar al codigo
    }
    
    public void mostrarAlumnos(){
        System.out.println("Codigo : " + this.clave);
        System.out.println("   DNI : " + this.DNI);
        System.out.println("Nombre : " + this.nombre);
        System.out.println("E-Mail : " + this.email);
    }
    
    //CONSTRUCTORES
    //ENTIENDO QUE LOS CONSTRUCTORES CON MENOS ARGUMENTOS NO TIENE SENTIDO
    
    public alumno(String DNI, String nombre) {
        this.clave = alumno.claveIncremental++;
        this.DNI = DNI;
        this.email = "";
        this.nombre = nombre;
    }

    public alumno(int clave, String DNI, String email, String nombre) {
        this.clave = alumno.claveIncremental++;
        this.DNI = DNI;
        this.email = email;
        this.nombre = nombre;
    }
    
    public alumno(alumno alum1) {
        this.clave = alum1.clave;
        this.DNI = alum1.DNI;
        this.email = alum1.email;
        this.nombre = alum1.nombre;
    }    


    
}
