/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_gestion_tienda;

import Facturas.Factura;
import Facturas.LineaFactura;
import Personas.Cliente;
import Productos.Articulo;

/**
 *
 * @author cliente
 */
public class Rubio_Avila_Mario_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Funcion main
        
        //Creando Clientes
        Cliente c1 = new Cliente("000000D","Mario","62 Rue El Araar",31,"Vip");//Creamos un cliente
        Cliente c2 = new Cliente("000001D","Bea","c/oudrid");//Creamos un cliente
        c1.mostrarCliente();//Mostramos el cliente
        
        //Creando productos
        Articulo p1 = new Articulo("A0001","Enchufe Inteligente",15); //Creamos Articulo1
        Articulo p2 = new Articulo("A0002","Lampara Inteligente",20); //Creamos Articulo2
        Articulo p3 = new Articulo("A0003","Interruptor IOT    ",10); //Creamos Articulo3
        Articulo p4 = new Articulo("A0004","Abono servidor MQTT",5);  //Creamos Articulo5
        p1.mostrarArticulo();//Mostramos el articulo
        
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");// Linea de separacion
        
        //Creo las lineas de las facturas
        LineaFactura L1F2345 = new LineaFactura(1,p1,5.0,3); //Creamos Linea1
        LineaFactura L2F2345 = new LineaFactura(1,p2,15.0,1); //Creamos Linea2
        LineaFactura L3F2345 = new LineaFactura(1,p3,150.0,2); //Creamos Linea3
        LineaFactura L4F2345 = new LineaFactura(1,p4,20.0,5); //Creamos Linea4
        
        Factura f1 = new Factura ("F2345",c1,L1F2345,L2F2345,L3F2345,L4F2345); //Creamos Factura
        f1.mostrarFactura(); //Mostramos factura
        
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");// Linea de separacion
        
        //Creo las lineas de la segunda fila
        LineaFactura L1F2346 = new LineaFactura(1,p1,5.0,10); //Creamos Linea1
        LineaFactura L2F2346 = new LineaFactura(1,p2,5.0,10); //Creamos Linea2
        LineaFactura L3F2346 = new LineaFactura(1,p3,5.0,10); //Creamos Linea3
        LineaFactura L4F2346 = new LineaFactura(1,p4,5.0,10); //Creamos Linea4        
        //Creo una segunda factura con las mismas lineas para ver si funcionan
        Factura f2 = new Factura ("F2346",c2,L1F2346,L2F2346,L3F2346,L4F2346); //Creamos Factura
        f2.mostrarFactura(); //Mostramos factura
        
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");// Linea de separacion
    }
    
}
