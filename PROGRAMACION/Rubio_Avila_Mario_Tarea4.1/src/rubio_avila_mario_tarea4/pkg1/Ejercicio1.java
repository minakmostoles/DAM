/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea4.pkg1;

/**
 *
 * @author Mario-PC
 * Pide por teclado un número correspondiente al precio de un producto. Muestra
 * por pantalla el mensaje “el precio del producto es caro” (vale más de 10), “tiene
 * un precio normal” (el precio es menor o igual que 10 y mayor que 5) o “el precio
 * es bajo” (vale igual o menos que 5).
 * 
 */


public class Ejercicio1 {
    
final static public String[] PRICEOPCIONS = new String[] {// LISTA PARA CAMBIO RAPIDO DE TEXTOS
                                            "El precio es bajo",//BARATO
                                            "Tiene un precio normal",//NORMAL
                                            "El precio del producto es caro",//CARO
                                            };    

final static private int PRICEEXPENSIVE = 10; //CONSTANTES DE MARGEN SUPERIOR
final static private int PRICECHEAP = 5;      //CONSTANTES DE MARGEN INFERIOR
    
     static public void start(){
        float price = ToolsAndMenu.getFloatFromKB("el precio del articulo");// ATENCION Permite meter decimales pero los limites son enteros 
        if (price > PRICEEXPENSIVE){System.out.println(PRICEOPCIONS[2]);}//Caro
        else if (price <= PRICECHEAP){System.out.println(PRICEOPCIONS[0]);}//Barato
        else {System.out.println(PRICEOPCIONS[1]);}// Normal
    }
    
}
