/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.Scanner;

/**
 *
 * @author Mario-PC
 * Esta libreria se conformo para ayudar a la creacion de tareas.
 * @version V6.1 -> Pausa del hilo sin pulsar ningun boton sleepThread()  
 *                  Funcion para preguntas de si o no getYESorNOTFromKB()
 *                  Ahora la pausa por teclado se colorea de color cyan
 *                  Se hace el javadoc a todos los metodos
 *     
 */


public class ToolsAndMenu {
    
    /**
     *
     */
    final static public String TITLENAME = "Tarea 6.1";

    /**
     *
     */
    final static public String AUTHORNAME = "Rubio Avila Mario";
    
    final static public String[] TITLEMENU = new String[] {
                        "MENU PRINCIPAL"};
    
    final static private String[] MENUOPCIONS = new String[] {
                                            "1.- Ejercicio 1",
                                            "2.- Ejercicio 2",
                                            "3.- Ejercicio 3",
                                            "0.- Salir"};
    
    /**
     *
     */
    final static public String[] DESCRIPCIONOPCIONS = new String[] {// PEQUEÑO TITULO DEL EJERCICIO
                                            "ENCRIPTADOR DE FICHEROS",//EJERCIO 1
                                            "DATOS EN BINARIO",//EJERCIO 2
                                            "DATOS SERIALIZACION",//EJERCIO 3
                                            };
    
    //Se encarga de conforma el titulo del programa (*ATENCION Sobrecarga de metodos)

    /**
     * Conforma un titulo de una sola linea
     * @param title  (Se le envia un String con el texto a insertar en el titulo)
     */
    static public void title(String title){
        String marco ="";
        for (int x=0 ; x < (title.length()+2); x++){marco= marco + "-";}
        //System.out.println(" ");
        System.out.println("#" + marco + "#");
        System.out.println("# " + title + " #");
        System.out.println("#" + marco + "#");
        //System.out.println(" "); 
    }           //Se le pasa solo un titulo lo centro y lo enmarca

    /**
     * Conforma un titulo de varias lineas
     * @param Titles   (Se le envia un array de String con los titulos a enviar)
     */
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
        while(op1 < 0 || op1 >= MENUOPCIONS.length){//Comprueba que es una opcion correcta
            op1 = getIntFromKB("la opcion deseada");
        }
        return op1;
    }
    
    //Funciones para obtener valores desde el teclado controlando la excepcion (Son funciones generica para reutilizacion de codigo)
    /**
     * Coje del teclado un numero entero 
     * @param datoAInsertar (Introduce "+ datoAInsertar +": )
     * @return devuelve un entero
     */
    static public int getIntFromKB(String datoAInsertar){// Funcion para introduccir int
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

    /**
     * Coje del teclado un numero double
     * @param datoAInsertar (Introduce "+ datoAInsertar +": )
     * @return
     */
    static public float getFloatFromKB(String datoAInsertar){// Funcion para introduccir int
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

    /**
     * Sirve para solicitar la intr
     * @param datoAInsertar (Introduce "+ datoAInsertar +": )
     * @return  devuelve un doble
     */
    static public double getDoubleFromKB(String datoAInsertar){// Funcion para introduccir int
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

    /**
     * Coje del teclado un String 
     * @param datoAInsertar (Introduce "+ datoAInsertar + ": ")
     * @return 
     */
    static public String getStringFromKB(String datoAInsertar){// Funcion para introduccir String
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

    /**
     * Coje del teclado una respuesta de si o no
     * @param datoAInsertar (String del texto a insertar ¿Estas seguro que deseas "+ datoAInsertar + "? Y/n )"
     * @return Devuelve true o false true es afirmativo y false no
     */
    static public boolean getYESorNOTFromKB(String datoAInsertar){// Funcion para introduccir String
        Scanner scanner = new Scanner(System.in); //Instanciamos la clase para capturar la teclas pulsadas
        try{
            String respuesta;
            while(true){
                System.out.print(ColorConsole.YELLOW + "¿Estas seguro que deseas "+ datoAInsertar + "? Y/n " + ColorConsole.RESET);
                respuesta = scanner.nextLine(); //declaracion y inicializacion de la variable del numero a operar capturado del teclado
                if (respuesta.equals("Y")) return respuesta.equals("Y");
                else if (respuesta.equals("n")) return false;
                else System.out.println(ColorConsole.RED + "Por favor introduzca Y / n (Respete mayuscula y minuscula es por su seguridad)"+ ColorConsole.RESET);
            }
        }catch (Exception e){// Nunca se va ha dar pero aqui se quedar
            System.out.print("Uch, algo no fue bien.(Se inserta valor Error): "+ e);
        }
        return false;
    }//Sirve para preguntar si o no implementado por primera vez en la tarea 6 
    
    
    

    /**
     *Crea una pausa por teclado
     */
    static public void pausa(){
        Scanner scanner=new Scanner(System.in);
        System.out.print(ColorConsole.PURPLE + "Presione cualquier tecla para continuar." + ColorConsole.RESET);
        scanner.nextLine();
    }
    
     /**
     *Crea una pausa por tiempo
     * @param seg (Numero entero de segundo de la cual queremos la pausa
     */
    static void sleepThread(int seg){
        try {
            
            Thread.sleep(seg*1000);//Ponemos a "Dormir" el programa durante los segundos que queremos
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }//Sirve para para el hilo implementado por primera vez en la tarea 6 pero no usado
}
