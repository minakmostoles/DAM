/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea4.pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mario-PC
 */
public class Ejercicio6 {
    
    static public void start(){   
        List<Integer> num = new ArrayList<>();//Declaro una lista ya que no conozco el numero de elementos
        int lastNumber;                  
        int index = 1;//
        do{//Capturamos los numeros
           lastNumber = ToolsAndMenu.getIntFromKB("el "+ (index) +"º numero (Introduce 0 o caracter invalido para terminar)");
           if (lastNumber !=0) {num.add(lastNumber);}//El 0 no se cuenta en la lista comentar la siguiente6
           //num.add(lastNumber;//El 0 se cuenta en la lista comentar la anterior y descomentar esta
           index++;//Usado para marcar el indice de la solicitud de fichero
        }while(lastNumber != 0);// Mientras no metamos cero no termina. El 0 entendi que no lo tenia que guardar pero 
        Collections.sort(num);                                                     //ordenamos la lista de menor a mayor asi queda todo mas bonito
        System.out.println("***************************************");             //Imprimimos un separador
        System.out.println("Los elementos insertados son :");
        for (int numero : num) {//Imprimimos la lista
            System.out.print(numero + " ");
        }
        System.out.println("\n***************************************");           //Imprimimos un separador
        System.out.println("Los elementos pares son :");
        for (int numero : num) {//Imprimimos la lista
            if (numero%2 == 0)System.out.print(numero + " ");
        }
        System.out.println("\n***************************************");           //Imprimimos un separador
        System.out.println("Los elementos positivos son :");
        for (int numero : num) {//Imprimimos la lista
            if (numero > 0)System.out.print(numero + " ");
        }
        System.out.println("\n***************************************");           //Imprimimos un separador
    }
}
