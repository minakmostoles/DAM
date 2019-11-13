/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea4.pkg1;

import java.util.Scanner;

/**
 *
 * @author Mario-PC
 */


public class ToolsAndMenu {
    
    final static public String TITLENAME = "Tarea 4.1";
    final static public String AUTHORNAME = "Rubio Avila Mario";
    final static private String[] MENUOPCIONS = new String[] {
                                            "******MENU*****",
                                            "1.- Ejercicio 1",
                                            "2.- Ejercicio 2",
                                            "3.- Ejercicio 3",
                                            "4.- Ejercicio 4",
                                            "4.- Ejercicio 5",
                                            "4.- Ejercicio 6",
                                            "7.- Ejercicio 7",
                                            "8.- Ejercicio 8",
                                            "0.- Salir"};
    
    final static public String[] DESCRIPCIONOPCIONS = new String[] {// PEQUEÑO TITULO DEL EJERCICIO
                                            "PRECIO PRODUCTO",//EJERCIO 1
                                            "POSICION EN CARRERA",//EJERCIO 2
                                            "ORDENA 3 NUMEROS",//EJERCIO 3
                                            "DESCUENTO COMERCIO",//EJERCIO 4
                                            "50 NUMEROS MULTIPLOS DE 3",//EJERCIO 5
                                            "NUMEROS PARES Y POSITIVOS",//EJERCIO 6
                                            "PASSWORD",//EJERCIO 7
                                            "MIN,MAX Y MEDIA DE EDADES ALUMNOS"//EJERCIO 8
                                            };
    
    //Se encarga de conforma el titulo del programa (*ATENCION Sobrecarga de metodos)
    static public void title(String title){
        String marco ="";
        for (int x=0 ; x < (title.length()+2); x++){marco= marco + "-";}
        //System.out.println(" ");
        System.out.println("#" + marco + "#");
        System.out.println("# " + title + " #");
        System.out.println("#" + marco + "#");
        //System.out.println(" "); 
    }           //Se le pasa solo un titulo lo centro y lo enmarca
    static public void title(String[] Titles){
        String marco ="";
        int maxLength = 0;
        for (String element : Titles) {//Vamos a determinar el titulo más grande
            if (maxLength < element.length()){maxLength = element.length();}// Si es mas grande que el anterior
        }        
        for (int x=0 ; x < (maxLength+2); x++){marco= marco + "-";}
        System.out.println("#" + marco + "#");
        for (String element : Titles) {//Mostramos el menu
            //Centramos el texto
            String spacesToTextFront = "";
            String spacesToTextBack = "";
            int centerText = (maxLength - element.length());
            if (centerText%2 == 0){
                centerText = centerText/2;
                for (int x=0 ; x < (centerText); x++){spacesToTextFront = spacesToTextFront + " ";}
                spacesToTextBack = spacesToTextFront;
            }else {
                centerText = (centerText/2)+1;
                for (int x=0 ; x < (centerText); x++){spacesToTextBack = spacesToTextBack + " ";}
                spacesToTextFront = spacesToTextBack + " ";
            }
            System.out.println("# "+ spacesToTextFront + element + spacesToTextBack +  " #");
        }
        System.out.println("#" + marco + "#");
    }       //Se le pasa una lista de titulos lo centro y lo enmarca
 
    //Conforma el texto del menu y captura la opcion que elejimos devuelve el numero de accion elegida
    static int menu(){
        for (String element : MENUOPCIONS) {//Mostramos el menu
            System.out.println(element);
        }
        //Solicitamos una opcion
        Scanner scanner=new Scanner(System.in);
        int op1 = -1;
        while(op1 < 0 || op1 > MENUOPCIONS.length){//Comprueba que es una opcion correcta
            op1 = getIntFromKB("la opcion deseada");
        }
        return op1;
    }
    
    //Funciones para obtener valores desde el teclado controlando la excepcion (Son funciones generica para reutilizacion de codigo)
    static int getIntFromKB(String datoAInsertar){// Funcion para introduccir int
        System.out.print("Introduce "+ datoAInsertar +": ");
        Scanner scanner = new Scanner(System.in); //Instanciamos la clase para capturar la teclas pulsadas
        try{
            int numero = scanner.nextInt(); //declaracion y inicializacion de la variable del numero a operar capturado del teclado
            return numero;
        }catch (Exception InputMismatchException){// Capturo el error de caracter incorrecto
            System.out.print("Error no teclees un simbolo diferente a un numero.(Se insertara Valor 0 por defecto\n");
            return 0;//Si se proboca un error devolveremos 0
        }
    }      //Son copias de la tarea 2.1 adaptadas para la reutilizacion de codigo
    static float getFloatFromKB(String datoAInsertar){// Funcion para introduccir int
        System.out.print("Introduce "+ datoAInsertar +": ");
        Scanner scanner = new Scanner(System.in); //Instanciamos la clase para capturar la teclas pulsadas
        try{
            float numero = scanner.nextFloat(); //declaracion y inicializacion de la variable del numero a operar capturado del teclado
            return numero;
        }catch (Exception InputMismatchException){// Capturo el error de caracter incorrecto
            System.out.print("Error no teclees un simbolo diferente a un numero.(Se insertara Valor 0 por defecto)\n");
            return 0;//Si se proboca un error devolveremos 0
        }
    }  //Son copias de la tarea 2.1 adaptadas para la reutilizacion de codigo
    static double getDoubleFromKB(String datoAInsertar){// Funcion para introduccir int
        System.out.print("Introduce "+ datoAInsertar +": ");
        Scanner scanner = new Scanner(System.in); //Instanciamos la clase para capturar la teclas pulsadas
        try{
            Double numero = scanner.nextDouble(); //declaracion y inicializacion de la variable del numero a operar capturado del teclado
            return numero;
        }catch (Exception InputMismatchException){// Capturo el error de caracter incorrecto
            System.out.print("Error no teclees un simbolo diferente a un numero.(Se insertara Valor 0 por defecto)\n");
            return 0;//Si se proboca un error devolveremos 0
        }
    }//Son copias de la tarea 2.1 adaptadas para la reutilizacion de codigo
    static String getStringFromKB(String datoAInsertar){// Funcion para introduccir String
        System.out.print("Introduce "+ datoAInsertar + ": ");
        Scanner scanner = new Scanner(System.in); //Instanciamos la clase para capturar la teclas pulsadas
        try{
            String cadenaString = scanner.nextLine(); //declaracion y inicializacion de la variable del numero a operar capturado del teclado
            return cadenaString;
        }catch (Exception InputMismatchException){// Capturo el error de caracter incorrecto
            System.out.print("Uch, algo no fue bien.(Se inserta valor Error)\n");
            return "Error";//Si se proboca un error devolveremos 0
        }
    }//Son copias de la tarea 2.1 adaptadas para la reutilizacion de codigo
    
    //Crea una pausa por teclado
    static void pausa(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Presione cualquier tecla para continuar.");
        scanner.nextLine();
    }
    
    static void sleepThead(int seg){
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(seg*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
