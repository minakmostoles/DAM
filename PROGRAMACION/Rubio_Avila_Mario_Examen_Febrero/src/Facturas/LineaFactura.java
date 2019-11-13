/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturas;

import Productos.Articulo;

/**
 *
 * @author cliente
 */
public class LineaFactura {
    //Variables
    private int idLinea = 0;
    private Articulo producto;
    private int cantidad = 0;
    private double precioUnitario= 0.0;
    private double totalLinea = precioUnitario*cantidad;

    //Constructor
    public LineaFactura(int idLinea , Articulo articuloLinea, double precioUnitario, int cantidad) {
        this.idLinea = idLinea;
        this.producto = articuloLinea;

        this.cantidad = comprobateStock(cantidad);// Cantidad de la venta segun stock

        this.precioUnitario = precioUnitario;
        updatePrecioTotal();// Realiza la actualizacion del precio total con la cantidad
    }

    //Getter and setter 
    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public Articulo getProducto() {
        return producto;
    }

    public void setProducto(Articulo producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        updatePrecioTotal();
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        updatePrecioTotal();
        this.precioUnitario = precioUnitario;
    }

    public double getTotalLinea() {
        updatePrecioTotal();
        return totalLinea;
    }

    public void setTotalLinea(double totalLinea) {
        this.totalLinea = totalLinea;
    }
    
    /**
     * Esta funcion se usa para actualizar el precio total cuando hay cualquier modificacion
     */
    private void updatePrecioTotal(){
        this.totalLinea = this.precioUnitario*this.cantidad;
    }
    
    /**
     * Comprueba que hay stock suficiente si no ajusta las cantidades
     */
    private int comprobateStock(int cantidad){
        if (this.producto.getStock() >=  cantidad){//Si hay cantida suficiente
            this.producto.disminuirStock(cantidad);// Retiro la cantidad de stock
            return cantidad;// Cantidad de la venta  se ajusta
        }else{
            cantidad = cantidad + (this.producto.getStock() - cantidad);
            //System.out.println(cantidad); //Es para el debug de si falta stock pone la cantidad menor
            return cantidad; 
        }
    }
    
    //Metodos
    /**
     * Muestra la linea que sera usada al imprimir la factura
     */
    public void mostrarLinea(){
        System.out.println(this.producto.getCodigo() + "\t " + this.producto.getNombre() + "\t" + this.cantidad + "\t" + this.precioUnitario+ "\t" + this.totalLinea);
    }
    
}
