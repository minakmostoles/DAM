/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea5.pkg1;

import almacen.producto;
import personas.cliente;
//import personas.persona;//Ya no se usa ya que la use para probar la clase en su dia
import tienda.venta;

/**
 *
 * @author Mrubio
 */
public class Rubio_Avila_Mario_Tarea51 {

    public static cliente[] arrayClientes = new cliente[5];   // Array de clientes
    public static producto[] arrayProducto = new producto[5]; // Array de productos
    public static venta[] arrayVenta = new venta[5];          // Array de ventas
    
    /**
     * @param args the command line arguments
     */
    
    //Programa ejemplo
    public static void main(String[] args) {
        ToolsAndMenu.title(new String []{ToolsAndMenu.TITLENAME,ToolsAndMenu.AUTHORNAME});//USAMOS UN DECORADOR PARA EL TITULO
        initArray ();   //Inicio los array con los productos y clientes
        initVentas();   //Inicio las compras y muestro lo que se va realizando
        //initMostrar(arrayProducto);
        //initMostrar(arrayClientes);
    }
    //Creo 5 Clientes / 5 Productos
    static public void initArray(){
        //*Clientes**************************************************************/
        arrayClientes[0] = new cliente("000001A","Bea","C/Araar","Normal");       // DNI - Nombre - Direccion - Tipo Cliente
        arrayClientes[1] = new cliente("000002B","Mario","C/SinNombre","Normal");
        arrayClientes[2] = new cliente("000003C","Carlos","C/La luna","Normal");
        arrayClientes[3] = new cliente("000004D","Laura","C/Oviedo","Normal");
        arrayClientes[4] = new cliente("000005E","Jorge","C/Baladi","Normal");
        //*Productos*************************************************************/
        arrayProducto[0] = new producto("Cable Azul",10,4);                     // Nombre Productos - Precio - Stock
        arrayProducto[1] = new producto("Cable Negro",10,4);
        arrayProducto[2] = new producto("Enchufe Wifi",25,2);
        arrayProducto[3] = new producto("Lampara Inteligente",90,5);
        arrayProducto[4] = new producto("Termostato Inteligente",120,1);
        //***********************************************************************/
    }
    //Creo la ventas y las muestro
    static public void initVentas(){
        /***VENTA CLIENTE NORMAL***/
        arrayVenta[0] = new venta("FA0000",arrayClientes[0],arrayProducto[3],90);// Numero Factura - Cliente - Producto - Precio Venta)
        arrayVenta[0].mostrarVenta();
        /***VENTA CLIENTE NORMAL QUE SE CONVIERTE A VIP***/
        arrayVenta[1] = new venta("FA0001",arrayClientes[0],arrayProducto[4],120);
        arrayVenta[1].mostrarVenta();
        /***VENTA CLIENTE VIP***/
        arrayVenta[1] = new venta("FA0002",arrayClientes[0],arrayProducto[3],100);
        arrayVenta[1].mostrarVenta();        
        /***VENTA PRODUCTO CON STOCK***/
        arrayVenta[2] = new venta("FA0003",arrayClientes[1],arrayProducto[3],90);
        arrayVenta[2].mostrarVenta();
        /***VENTA PRODUCTO SIN STOCK***/
        arrayVenta[3] = new venta("FA0004",arrayClientes[1],arrayProducto[4],120);
        arrayVenta[3].mostrarVenta();
        /***VENTA PARA COMPROBACCION DE LA DEVOLUCION***/
        arrayVenta[4] = new venta("FA0005",arrayClientes[2],arrayProducto[3],105);
        arrayVenta[4].mostrarVenta();
        /******/
        System.out.println("Dinero gastado "+ arrayClientes[0].getNombre() + " : " + arrayClientes[0].getDineroGastado() + " €");
        System.out.println("Dinero gastado "+ arrayClientes[1].getNombre() + " : " + arrayClientes[1].getDineroGastado() + " €");
        System.out.println("Precio Total de ventas : " + arrayVenta[1].getTotalVentas() + " €"); // Es el total de ventas de la tienda
        /***TEST DEVOLUCCION CON CAMBIO DE TIPO DE CLIENTE***/
        System.out.println("TEST DEVOLUCCION DE CLIENTE CON CAMBIO DE CONDICION DE TIPO DE CLIENTE");
        System.out.println("El cliente "+ arrayClientes[2].getNombre() + " es " + arrayClientes[2].getTipo());
        arrayVenta[4].devolucionVenta();
        arrayVenta[4].mostrarVenta();
        System.out.println("El cliente "+ arrayClientes[2].getNombre() + " es " + arrayClientes[2].getTipo());

        
    }
    
    //Son funciones para mostras todos los elementos
    static public void initMostrar(venta[] arrayVenta){
        for (venta venta : arrayVenta) {
            if (venta != null){
                System.out.println("ADVERTENCIA : LOS DATOS DE CLIENTE Y PRODUCTOS SON A MOMENTO ACTUAL");
                venta.mostrarVenta();}
        }
    }   
    static public void initMostrar(producto[] arrayProducto){
        for (producto producto : arrayProducto) {
            if (producto != null){
                producto.mostrarProductos();}
        }
    }
    static public void initMostrar(cliente[] arrayClientes){
        for (cliente cliente : arrayClientes) {
            if (cliente != null){
                cliente.mostrarPersona();}
        }
    }  
}
