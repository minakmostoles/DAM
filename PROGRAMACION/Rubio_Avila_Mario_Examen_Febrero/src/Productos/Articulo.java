/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author cliente
 */
public class Articulo {
    //Variables
    private String codigo = "A0000";
    private String nombre = "Elemento no declarado";
    private int stock = 0;

    //Constructor
    public Articulo(String codigo, String nombre ,int stock) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.stock=stock;
    }
    
    //Getter y setter para coger y devolver las variables encapsuladas
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    /**
     * Sirve parar disminuir la cantidad de stock
     * @param cantidad
     */
    public void disminuirStock(int cantidad) {
        this.stock = stock-cantidad;
    }
    
    public void mostrarArticulo(){
        System.out.println("---------------------------------------");
        System.out.println("Codigo : "+ this.codigo);
        System.out.println("Nombre : "+ this.nombre);
        System.out.println(" Stock : "+ this.stock);
        System.out.println("---------------------------------------");    
    }
    

}
