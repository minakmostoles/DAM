/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import almacen.producto;
import personas.cliente;

/**
 *
 * @author Mrubio
 */
public class venta {
    final int limiteVip = 100;
    
    static private double totalVentas;
    private cliente clienteComprador;
    private producto productoVendido;
    private String numFactura;
    private double precioVenta;
    
    public venta (String numFactura, cliente clienteComprador, producto productoVendido , double precioVenta){
        this.clienteComprador = clienteComprador;
        this.productoVendido = productoVendido;
        this.numFactura = numFactura;
        this.precioVenta = precioVenta;
        if (productoVendido.getStock() <= 0){//No tiene stock no se puede hacer la venta
            System.out.printf("ERROR : El producto %s tiene un stock de %d\n", productoVendido.getNombre(),productoVendido.getStock());
            this.precioVenta = 0;
        }else{//El producto tiene stock por lo que si puede hacerse la venta
            switch (clienteComprador.getTipo()) {
                case "VIP":
                    this.precioVenta = this.precioVenta - (this.precioVenta * clienteComprador.descuentoVIP / 100);
                    break;
                case "Normal":
                    //this.precioVenta = productoVendido.getPrecio();
                    if ((this.precioVenta >= limiteVip) || (this.precioVenta + clienteComprador.getDineroGastado()) >= limiteVip){
                        clienteComprador.setTipo("VIP");
                        //this.precioVenta = this.precioVenta - (this.precioVenta * clienteComprador.descuentoVIP / 100);
                    }
                    break;
                default:
                    break;
            }
            this.totalVentas = this.totalVentas + this.precioVenta;
            productoVendido.disminuirStock(1);
            clienteComprador.aumentarGasto(this.precioVenta);
        }//Final de else (Productocon stock
    }//Final del constructor

    public double getTotalVentas() {
        return totalVentas;
    }
    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

    public cliente getClienteComprador() {
        return clienteComprador;
    }
    public void setClienteComprador(cliente clienteComprador) {
        this.clienteComprador = clienteComprador;
    }

    public producto getProductoVendido() {
        return productoVendido;
    }
    public void setProductoVendido(producto productoVendido) {
        this.productoVendido = productoVendido;
    }

    public String getNumFactura() {
        return numFactura;
    }
    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }
    
    public double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
            
    public void devolucionVenta(){
        if (this.precioVenta > 0){//Si la venta existe permite su devolicion
            clienteComprador.disminuirGasto(this.precioVenta);
            this.precioVenta = 0;
            productoVendido.incrementarStock(1);
            this.totalVentas = this.totalVentas - precioVenta;
            
            //Si el cliente tras la devolucion gasto menos de 100 EUROS y era cliente VIP pasa a ser cliente normal
            if ((this.clienteComprador.getDineroGastado() <= limiteVip) && this.clienteComprador.getTipo().equals(this.clienteComprador.tipoOpcion[1])){
                this.clienteComprador.setTipo(this.clienteComprador.tipoOpcion[0]);//Establezco que pasa a ser cliente normal
            }
        }else{
            System.out.println("Error no se puede gestionar una devolucion de la venta.");
        }
    }
    public void diminuirPrecioVenta(int precio){//Disminuye el precio *ATENCION SE LE INDICA EL DINERO A DESCONTAR DE LA FACTURA NO EL NUEVO PRECION
        if (this.precioVenta-precio >= 0){//Si la venta lo permite
            this.totalVentas = totalVentas - precio;
            clienteComprador.disminuirGasto(precio);
            this.precioVenta = precio;
        }else{
            System.out.println("Error al cambiar el precio de venta");
        }
    }
    public void mostrarVenta(){
        System.out.println("*****Venta****** ");
        System.out.println("Numero Factura : " + this.numFactura);
        System.out.println("**Datos Cliente**");
        this.clienteComprador.mostrarPersona();
        System.out.println("**Datos Productos**");
        this.productoVendido.mostrarProductos();
        //System.out.println("       Cliente : " + this.clienteComprador.getNombre());
        //System.out.println("  Cliente Tipo : " + this.clienteComprador.getTipo());        
        //System.out.println("      Producto : " + this.productoVendido.getNombre());
        //System.out.println("**************** ");
        System.out.println("  Precio Venta : " + this.precioVenta + " €");
        System.out.println("-----------------");
    }
}
