/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;
/**
 *
 * @author Mrubio
 */
public class producto {
    private String nombre;
    private double precio;
    private int stock;
    
    public producto(String nombre){
        this.nombre = nombre;
        this.precio = 0;
        this.stock = 0;
    }
    
    public producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;
    }
    
    public producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public producto(producto p1){
        this.nombre = p1.nombre;
        this.precio = p1.precio;
        this.stock = p1.stock;
    }

    public void setNombre(String nombre){this.nombre = nombre;}
    public String getNombre(){return this.nombre;}
    
    public void setPrecio(double precio){this.precio = precio;}
    public double getPrecio(){return this.precio;}
    
    public void setStock(int stock){this.stock = stock;}
    public int getStock(){return this.stock;}
    
    public void incrementarStock(int cantidad){
        this.stock = this.stock + cantidad;
    }
    
    public void disminuirStock(int cantidad){
        this.stock = this.stock - cantidad;
    }
    
    public void mostrarProductos(){
        System.out.println("        Nombre : " + this.nombre);
        System.out.println("        Precio : " + this.precio + " €");
        System.out.println("         Stock : " + this.stock);
        System.out.println("**************** ");
    }
    
}
