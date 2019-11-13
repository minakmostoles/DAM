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
public class Ejercicio8 {//ATENCION SOBRECARGA DE METODOS EN LA FUNCION START
    
    final static private int MINIMAEDAD = 1;    //CONSTANTES DE EDAD INFERIOR
    final static private int MAXIMAEDAD = 110;  //CONSTANTES DE EDAD MAXIMA
    
    static public void start(){                                                    //Si no delimito el numero de elementos al llamar al metodo
        int totalNum = ToolsAndMenu.getIntFromKB("numero de alumnos");             //Pido el numero a ingresar
        System.out.println("***************************************");             //Imprimimos un separador
        start(totalNum);                                                           //Pasamos al metodo normal
    }
    
    static public void start(int totalNum){                                        //Metodo donde el numero de elementos ya esta delimitado
        int[] num = new int[totalNum];                                             //Un array para guardar los numeros
        for(int i = 0; i < num.length; i++){                                       //Solicito los numeros de edad
            int lastAge = 0;                                                       // usado para evitar meter edades no logicas
            do{                                                                    //Comprobamos que lo que se intenta introduccir es logico
                lastAge = ToolsAndMenu.getIntFromKB("la edad del "+ (i+1) +"º alumno(Entre " + MINIMAEDAD + " y " + MAXIMAEDAD+ ")");
            }while ((lastAge < MINIMAEDAD) || (lastAge > MAXIMAEDAD));             // Si la edad es mayor o menor a los limites no lo acepto
            num[i] = lastAge;
	} 
        System.out.println("\n***************************************");           //Imprimimos un separador
        num = Ejercicio3.ordenaDeMenorMayor(num);                                   //Ordene el array de menor a mayor para facilitar la lectura y tratamiento paso no necesario pero recomendable para mostrar correcto y de paso tener el minimo y maximo
        Ejercicio3.printArrayNum(num, "de edad ordenados");
        //Al estar ordenado la lista es facil identificar el mas pequeño y el mas mayor
        int media = 0;
        for (int numero : num) {//Calulamos la media
            media = media + numero;
        }
        media = media/totalNum;
        System.out.println("***************************************");           //Imprimimos un separador
        //Mostramos la informacion por pantalla
        System.out.printf("La edad minima es : %d\n", num[0]);                      
        System.out.printf("La edad maxima es : %d\n", num[num.length-1]);
        System.out.printf("La edad media es : %d\n", media);
    }
}
