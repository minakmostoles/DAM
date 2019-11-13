/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.Scanner;

/**
 *
 * @author Mario Rubio Avila - 2019
 * Esta libreria se conformo para ayudar a la creacion de tareas.
 * @version V8.1 -> Se elimina de aqui todo lo referente a textos del menu (NO RETROCOMPATIBLE CON PROYECTOS ANTERIORES QUE USEN MENUS DE CONSOLA)
 *                  Se modifica la funcion menu y ahora se le tiene que pasar por parametros las funciones a mostrar
 *                  Soluccionado errores de accesos a la funciones menu() y sleepThread()
 *                  getDoubleFromKB(intentos, String);          Ahora acepta numero de intentos
 *                  getFloatFromKB(intentos, String);           Ahora acepta numero de intentos
 *                  getIntFromKB(intentos, String);             Ahora acepta numero de intentos
 *                  randInt(limite inferior, limite superior);  Funcion que permite generar numero aleatorios entre dos numeros
 *  version V6.1 -> Pausa del hilo sin pulsar ningun boton sleepThread()  
 *                  Funcion para preguntas de si o no getYESorNOTFromKB()
 *                  Ahora la pausa por teclado se colorea de color cyan
 *                  Se hace el javadoc a todos los metodos
 *     
 */


public class ToolsAndMenu {
    
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
 
    /**
     * Conforma el texto del menu y captura la opcion que elejimos devuelve el numero de accion elegida
     * @param MENUOPCIONS   //Se le entrega un Array de String con las opciones a mostrar
     * @return 
     */
    static public int menu(String[] MENUOPCIONS){
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
     * Coje del teclado un numero entero y si insertas algo que no es un entero retorna 0
     * @param datoAInsertar (Introduce "+ datoAInsertar +": )
     * @return devuelve un entero
     */
    static public int getIntFromKB(String datoAInsertar){// Funcion para introduccir int
        return getIntFromKB(0,datoAInsertar);
    }
    /**
     * Sirve para solicitar la introduccir un entero pero si despues de un numero de intentos devuelve 0 por defecto
     * @param intentos
     * @param datoAInsertar
     * @return 
     */
    static public int getIntFromKB(int intentos, String datoAInsertar){// Funcion para introduccir int
        do{
            System.out.print("Introduce "+ datoAInsertar +": ");
            Scanner scanner = new Scanner(System.in); //Instanciamos la clase para capturar la teclas pulsadas
            try{
                int numero = scanner.nextInt(); //declaracion y inicializacion de la variable del numero a operar capturado del teclado
                return numero;
            }catch (Exception InputMismatchException){// Capturo el error de caracter incorrecto
                System.out.println(ColorConsole.RED + "Error no teclees un simbolo diferente a un numero." + ColorConsole.RESET);
            }
            intentos = intentos -1;
        }while (intentos>=1);
        System.out.print(ColorConsole.RED + "Se insertara Valor 0 por defecto\n" + ColorConsole.RESET);
        return 0;//Si se proboca un error devolveremos 0
    }

    static public float getFloatFromKB(String datoAInsertar){// Funcion para introduccir double
        return getFloatFromKB (0,datoAInsertar);
    }    
    
    /**
     * Coje del teclado un numero double
     * @param datoAInsertar (Introduce "+ datoAInsertar +": )
     * @return
     */
    static public float getFloatFromKB(int intentos, String datoAInsertar){// Funcion para introduccir int
        do{
            System.out.print("Introduce "+ datoAInsertar +": ");
            Scanner scanner = new Scanner(System.in); //Instanciamos la clase para capturar la teclas pulsadas
            try{
                float numero = scanner.nextFloat(); //declaracion y inicializacion de la variable del numero a operar capturado del teclado
                return numero;
            }catch (Exception InputMismatchException){// Capturo el error de caracter incorrecto
                System.out.print("Error no teclees un simbolo diferente a un numero.\n");
            }
            intentos = intentos -1;
        }while (intentos>=1);
        System.out.print(ColorConsole.RED + "Se insertara Valor 0 por defecto\n" + ColorConsole.RESET);
        return 0;//Si se proboca un error devolveremos 0
    }  //Son copias de la tarea 2.1 adaptadas para la reutilizacion de codigo

    /**
     * Sirve para solicitar la introduccir un double pero si ocurre un error devuelve 0 por defecto
     * @param datoAInsertar (Introduce "+ datoAInsertar +": )
     * @return  devuelve un doble
     */
    static public double getDoubleFromKB(String datoAInsertar){// Funcion para introduccir double
        return getDoubleFromKB (0,datoAInsertar);
    }
   
    /**
     * Sirve para solicitar la introduccir un double pero si despues de un numero de intentos devuelve 0 por defecto
     * @param intentos      Indica el numero de intentos para dar un valor valido antes de devolver 0
     * @param datoAInsertar
     * @return 
     */
    static public double getDoubleFromKB(int intentos, String datoAInsertar){// Funcion para introduccir double
        do{
            System.out.print("Introduce "+ datoAInsertar +": ");
            Scanner scanner = new Scanner(System.in); //Instanciamos la clase para capturar la teclas pulsadas
            try{
                Double numero = scanner.nextDouble(); //declaracion y inicializacion de la variable del numero a operar capturado del teclado
                return numero;
            }catch (Exception InputMismatchException){// Capturo el error de caracter incorrecto
                System.out.println(ColorConsole.RED + "Error no teclees un simbolo diferente a un numero." + ColorConsole.RESET);
            }
            intentos = intentos -1;
        }while (intentos>=1);
        System.out.print(ColorConsole.RED + "Se insertara Valor 0 por defecto\n" + ColorConsole.RESET);
        return 0;//Si se proboca un error devolveremos 0
    }
    
    /**
     * Coje del teclado un String con 0 intententos
     * @param datoAInsertar
     * @return 
     */
    static public String getStringFromKB(String datoAInsertar){
        return getStringFromKB(0,datoAInsertar);
    }
    
    /**
     * Coje del teclado un String con n de intentos
     * @param datoAInsertar (Introduce "+ datoAInsertar + ": ")
     * @return 
     */
    static public String getStringFromKB(int intentos,String datoAInsertar){// Funcion para introduccir String
        do{
            System.out.print("Introduce "+ datoAInsertar + ": ");
            Scanner scanner = new Scanner(System.in); //Instanciamos la clase para capturar la teclas pulsadas
            try{
                String cadenaString = scanner.nextLine(); //declaracion y inicializacion de la variable del numero a operar capturado del teclado
                return cadenaString;
            }catch (Exception InputMismatchException){// Capturo el error de caracter incorrecto
                System.out.print("Uch, algo no fue bien.\n");
            }
            intentos = intentos -1;
        }while (intentos>=1);
        System.out.print(ColorConsole.RED + "Se devolvera cadena vacia por defecto\n" + ColorConsole.RESET);
        return "";//Si se proboca un error devolveremos 0
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
            System.out.print(ColorConsole.RED + "Uch, algo no fue bien.(Se inserta valor Error): "+ e + ColorConsole.RESET);
        }
        return false;
    }//Sirve para preguntar si o no implementado por primera vez en la tarea 6 
    
    /**
     * Devuelve el valor double redondeado 
     * @param valor
     * @return 
     */
    static public double redondoDoble(double valor){
        //Redonda los doubles
        //Tenemos dos metodos aparentes de redondeo
        //Usando la clase BigDecimal , usando el método setScale (En este tenemos que instanciar un objero bigdecimal)
        //      BigDecimal bDecimal = new BigDecimal(number);
        //      bDecimal = bDecimal.setScale(2, RoundingMode.HALF_UP);
        //Mediante Math.Round() -> (double)Math.round(number * 100d) / 100d) 
        //valor = ((double)Math.round(valor * 100d) / 100d);
        return ((double)Math.round(valor * 100d) / 100d);
    }
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
    static public void sleepThread(int seg){
        try {
            
            Thread.sleep(seg*1000);//Ponemos a "Dormir" el programa durante los segundos que queremos
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }//Sirve para para el hilo implementado por primera vez en la tarea 6 pero no usado
   
    /**
     * Permite generar un numero aleatorio entre un valor minumo y un valor superior
     * @param lowerLimit //Limite inferior
     * @param upperLimit //Limite superior
     * @return 
     */
    static public int randInt (int lowerLimit, int upperLimit) {
        return (int)Math.floor(Math.random() * (upperLimit - lowerLimit + 1)) + lowerLimit;        
    }  
}
