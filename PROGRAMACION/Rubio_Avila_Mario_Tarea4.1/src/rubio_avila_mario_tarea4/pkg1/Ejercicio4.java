/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea4.pkg1;

/**
 *
 * @author Mario-PC
 */
public class Ejercicio4 {
final static private float PRECIOMINIMO = 100; //CONSTANTES DE MARGEN INFERIOR
final static private int DESCUENTOMINIMO = 5;  //CONSTANTES DE DESCUENTO INFERIOR
final static private float PRECIOMAXIMO = 200; //CONSTANTES DE MARGEN SUPERIOR
final static private int DESCUENTOMAXIMO = 10; //CONSTANTES DE DESCUENTO SUPERIOR
    
    static public void start(){
        float price = 0;
        while(price == 0){//Evito que si se inserta un cero o te equivocas con el simbolo de la coma continue el programa
            price = ToolsAndMenu.getFloatFromKB("el precio del articulo");
        }
        int descuentoAAplicar;
        if (price < PRECIOMINIMO){descuentoAAplicar = 0;}                    //No hay descuento
        else if (price >= PRECIOMAXIMO){descuentoAAplicar = DESCUENTOMAXIMO;}//Descuento maximo 10
        else {descuentoAAplicar = DESCUENTOMINIMO;}                          //Descuento minimo 5
        
        float descuentoFinal = (descuentoAAplicar*price)/100;//Calculo n descuento
        float priceTotal = price-descuentoFinal; //Calculo precio final con descuento
        
        System.out.printf("El precio %.2f Eur\nDescuento de %d%% = %.2f Eur\nPrecio Final %.2f Eur\n",price, descuentoAAplicar, descuentoFinal,priceTotal);
    }
}
