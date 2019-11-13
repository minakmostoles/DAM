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
public class Ejercicio3 {//ATENCION SOBRECARGA DE METODOS EN LA FUNCION START
    
    static public void start(){                                                    //Si no delimito el numero de elementos al llamar al metodo
        int totalNum = ToolsAndMenu.getIntFromKB("numero de elementos a ordenar"); //Pido el numero a ingresar
        System.out.println("***************************************");             //Imprimimos un separador
        start(totalNum);                                                           //Pasamos al metodo normal
    }
    static public void start(int totalNum){                                        //Metodo donde el numero de elementos ya esta delimitado
        int[] num = new int[totalNum];                                             //Un array para guardar los numeros
        for(int i = 0; i < num.length; i++){                                       //Solicito el los numeros
            //System.out.print("Numero " + (i+1) + ": ");
            num[i] = ToolsAndMenu.getIntFromKB("el "+ (i+1) +"º numero");
	}
        System.out.println("***************************************");             //Imprimimos un separador
        printArrayNum (num,"insertados");
        printArrayNum (ordenaDeMayorMenor(num),"ordenados");
        
    }
    
    
    //Sirve para imprimir el array de manera ordenada
    static public void printArrayNum (int[] num , String definicion){
        System.out.print("Los numeros "+ definicion +" son : ");
        for (int numero : num) {
            System.out.print(numero + " ");
            }
        System.out.print(".\n");//Final
        }        
    
    //Ordeno mediantes el metodo burbuja el array y lo devuelvo ordenados de mayor a menor
    static public int[] ordenaDeMayorMenor(int[] num){
        for(int i = 0; i < num.length; i++){
            for(int j=i+1; j < num.length; j++){
                if(num[i] < num[j]){
                        int aux = num[i];
                        num[i] = num[j];
                        num[j] = aux;
                }
            }
        }
        return num;//Devuelvo el array
    }
   //Este ejercicio no lo usa pero lo dejo hecho para el ejercicio 8
   //Ordeno mediantes el metodo burbuja el array y lo devuelvo ordenados de menor a mayor
    static public int[] ordenaDeMenorMayor(int[] num){
        for(int i = 0; i < num.length; i++){
            for(int j=i+1; j < num.length; j++){
                if(num[i] > num[j]){
                        int aux = num[i];
                        num[i] = num[j];
                        num[j] = aux;
                }
            }
        }
        return num;//Devuelvo el array
    }
}
