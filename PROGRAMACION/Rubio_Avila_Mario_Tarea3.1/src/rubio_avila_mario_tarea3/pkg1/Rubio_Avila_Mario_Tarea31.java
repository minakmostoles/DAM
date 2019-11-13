/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea3.pkg1;

import java.util.Scanner;

/**
 * @author Mario-PC
 */

//Esta clase es el main solo usado para comprobar que el ejercicio funciona
public class Rubio_Avila_Mario_Tarea31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.print("   Tarea 3.1\n");
        System.out.print("Rubio Avila Mario\n");
        System.out.println("-------------------");
        while(true){//Bucle infinito
            menu();//Llamamos al menu el toma el control del programa
        }
    }//Main global
    //Una funcion por ejercicio
    static void ejercicio1(){
        System.out.print("Ejercicio N 1\n------------\n");
        operaciones matesFaciles = new operaciones();       //Instancio la clase
        System.out.println("El valor inicial de x e y son : " + matesFaciles.getValorX()+ " y " + matesFaciles.getValorY()); //   
        matesFaciles.setValorX(getIntFromKB("numero x"));   //Hago un set a x
        matesFaciles.setValorY(getIntFromKB("numero y"));   //Hago un set a y
        System.out.println("El numero x es " + matesFaciles.getValorX());
        System.out.println("El numero y es " + matesFaciles.getValorY());
        System.out.println("El numero x + y es " + matesFaciles.sumar());
        System.out.println("El numero x - y es " + matesFaciles.restar());
        System.out.printf("El numero x * y es %.0f\n", matesFaciles.multiplicar());//Es imposible que de decimales si los dos numeros introducidos son enteros
        System.out.printf("El numero x / y es %.2f\n", matesFaciles.dividir());    //Una division puede dar decimales preparo para mostrar 2 decimales
        System.out.println("El numero x % y es " + matesFaciles.resto());
    }  //Funcion del ejercicio 1
    static void ejercicio2(){
        System.out.print("Ejercicio N 2\n------------\n");
        notas notasClass = new notas();       //Instancio la clase
        notasClass.setNombre(getStringFromKB("nombre del alumno"));
        notasClass.setExamen1(getFloatFromKB("notas del primer examen"));
        notasClass.setExamen2(getFloatFromKB("notas del segundo examen"));
        notasClass.setExamen3(getFloatFromKB("notas del tercer examen"));
        notasClass.mostrarNotas();
    }   //Funcion del ejercicio 2
    static void ejercicio3(){
        System.out.print("Ejercicio N 3\n------------\n");
        menu menuRestaurant = new menu();       //Instanciacion de la clase
        menuRestaurant.setNombreCliente(getStringFromKB("nombre del cliente"));
        menuRestaurant.setPrimerPlato(getStringFromKB("nombre del primer plato"));
        menuRestaurant.setPrecioPrimer(getFloatFromKB("precio del primer plato"));
        menuRestaurant.setSegundoPlato(getStringFromKB("nombre del segundo plato"));
        menuRestaurant.setPrecioSegundo(getFloatFromKB("precio del segundo plato"));
        menuRestaurant.setPostre(getStringFromKB("nombre del postre"));
        menuRestaurant.setPrecioPostre(getFloatFromKB("precio del postre plato"));
        menuRestaurant.mostrarMenu();
    }  //Funcion del ejercicio 3
    static void ejercicio4(){
        System.out.print("Ejercicio N 4\n------------\n");
        int op = 1;
        cuenta cuentaBank = new cuenta();       //Instanciacion de la clase
        cuentaBank.setTitular(getStringFromKB(" el nombre del titular"));
        while(op!=0){                           //Bucle hasta que pulsemos Salir en el menu
            //Mostramos el menu
            System.out.println("****Banca Online****");
            System.out.println("Bienvenido "+ cuentaBank.getTitular());
            System.out.println("1.- Ingresar en cuenta");
            System.out.println("2.- Transferir a la tarjeta");
            System.out.println("3.- Sacar de la cuenta");
            System.out.println("4.- Sacar de la tarjeta");
            System.out.println("5.- Mostrar informacion cuenta");        
            System.out.println("0.- Salir"); //o otro numero no incluido
            //Solicitamos una opcion
            op = getIntFromKB("la opcion deseada");
            //Actuamos sobre lo solicitado
            switch (op){
                case 0:
                    op = 0;
                    System.out.println("Esperamos volver a verle pronto");
                    //pausa();
                    break;
                case 1:
                    cuentaBank.ingresarSaldoCuenta(getDoubleFromKB(" el saldo a ingresar en la cuenta"));
                    break;
                case 2:
                    cuentaBank.transferirSaldoATarjeta(getDoubleFromKB(" el saldo a ingresar a transferir a la tarjeta"));
                    break;
                case 3:
                    cuentaBank.sacarSaldoCuenta(getDoubleFromKB(" el saldo a saca de la cuenta"));
                    break;
                case 4:
                    cuentaBank.sacarSaldoTarjeta(getDoubleFromKB(" el saldo a sacar de la tarjeta"));
                    break;
                case 5:
                    cuentaBank.mostrardatosCuenta();
                    pausa();//Realizo una pausa por teclado para permitir leer el funcionamiento del menu
                    break;   
                default:
                    System.out.println("Elemento seleccionado no reconocido.\n");
                    pausa();
                    break;
            }
        }
    }  //Funcion del ejercicio 4
    
    //Funcion para elegir el ejercicio que se desea ejecutar
    static void menu(){
        //Mostramos el menu
        System.out.println("******MENU*****");
        System.out.println("1.- Ejercicio 1");
        System.out.println("2.- Ejercicio 2");
        System.out.println("3.- Ejercicio 3");
        System.out.println("4.- Ejercicio 4");    
        System.out.println("0.- Salir"); //o otro numero no incluido
        //Solicitamos una opcion
        Scanner scanner=new Scanner(System.in);
        int op1 = getIntFromKB("la opcion deseada");
        //Actuamos sobre lo solicitado
        switch (op1){
            case 0:
                System.exit(0);//Provocamos la salida del programa
                System.out.print("Muchas gracias hasta pronto :");
                break;
            case 1:
                ejercicio1();//Llama a la funcion del ejercicio 1
                pausa();     //Realizo una pausa por teclado para permitir leer el funcionamiento del menu
                break;
            case 2:
                ejercicio2();//Llama a la funcion del ejercicio 2
                pausa();     //Realizo una pausa por teclado para permitir leer el funcionamiento del menu
                break;
            case 3:
                ejercicio3();//Llama a la funcion del ejercicio 3
                pausa();     //Realizo una pausa por teclado para permitir leer el funcionamiento del menu
                break;
            case 4:
                ejercicio4();//Llama a la funcion del ejercicio 4
                pausa();     //Realizo una pausa por teclado para permitir leer el funcionamiento del menu
                break;
            default:
                System.out.print("Elemento seleccionado no reconocido.\n");
                System.exit(0);//Provocamos la salida del programa
                pausa();       //Realizo una pausa por teclado para permitir leer el funcionamiento del menu
                break;
            }
    }
    
    //Funciones para obtener valores desde el teclado controlando la excepcion (Son funciones generica para reutilizacion de codigo)
    static int getIntFromKB(String datoAInsertar){// Funcion para introduccir int
        System.out.println("Introduce "+ datoAInsertar +": ");
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
        System.out.println("Introduce "+ datoAInsertar +": ");
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
        System.out.println("Introduce "+ datoAInsertar +": ");
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
        System.out.println("Introduce "+ datoAInsertar + ": ");
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
}
