/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3.Cine;

/**
 *
 * @author Mario-PC
 */
public class pelicula {
    private int agno;
    private String director;
    private String genero;
    private String nombre;
    
    //SETTERS AND GETTERS
    
    public int getAgno() {
        return agno;
    }

    public void setAgno(int agno) {
        this.agno = agno;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
    
    //FUNCIONES PUBLICAS
    
    public void mostrarPelicula(){
    System.out.println("  Nombre : " + this.nombre);
    System.out.println("  Genero : " + this.genero);
    System.out.println("    Agno : " + this.agno);
    System.out.println("Director : " + this.director);
    }

    //CONSTRUCTORES 
    //Minimo pasa el nombre de la pelicula
    
    public pelicula(String nombre) {
        this.director = "";
        this.genero = "";
        this.agno = 0;
        this.nombre = nombre;
        
    }

    public pelicula(int agno, String nombre) {
        this.director = "";
        this.genero = "";
        this.agno = agno;
        this.nombre = nombre;
    }

    public pelicula(int agno, String genero, String nombre) {
        this.director = "";
        this.agno = agno;
        this.genero = genero;
        this.nombre = nombre;
    }

    public pelicula(int agno, String director, String genero, String nombre) {
        this.agno = agno;
        this.director = director;
        this.genero = genero;
        this.nombre = nombre;
    }

    public pelicula(pelicula pel1) {
        this.agno = pel1.agno;
        this.director = pel1.director;
        this.genero = pel1.genero;
        this.nombre = pel1.nombre;
    }


}
