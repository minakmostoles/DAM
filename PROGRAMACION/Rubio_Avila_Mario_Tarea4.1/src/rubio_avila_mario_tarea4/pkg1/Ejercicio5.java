/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea4.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mario-PC
 */
public class Ejercicio5 {
   
    final static private int NUMEROELEMENTOS = 50; //CONSTANTES DE MARGEN SUPERIOR
    final static private int MULTIPLOSDE = 3;      //CONSTANTES DE MULTIPLOS DE EL NUMERO INDICADO
    
    static public void start(){
        //int[] num = new int[NUMEROELEMENTOS];;//Array donde guardare todos los multiplos
        List<Integer> num = new ArrayList<>();
        double sumatorioMultiplos = 0;
        for(int i = MULTIPLOSDE; num.size() < NUMEROELEMENTOS; i++){//Cominzo por el numero del que buscamos multiplos porque siempre el primero es el mismo
           if (i%MULTIPLOSDE == 0){
               num.add(i);
               sumatorioMultiplos = sumatorioMultiplos + i;
           }
        }
        for (int numero : num) {//Imprimimos la lista
            System.out.print(numero + " ");
        }
        System.out.println(".");
        System.out.printf("La suma total de los elementos es : %.0f\n", sumatorioMultiplos);
        
        
    }
}
