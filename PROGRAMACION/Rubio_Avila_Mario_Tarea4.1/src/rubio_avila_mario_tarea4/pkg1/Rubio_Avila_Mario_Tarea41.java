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
public class Rubio_Avila_Mario_Tarea41 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //ToolsAndMenu.title(ToolsAndMenu.TITLENAME);
        ToolsAndMenu.title(new String []{ToolsAndMenu.TITLENAME,ToolsAndMenu.AUTHORNAME});//USAMOS UN DECORADOR PARA EL TITULO
        selectEjercicio();
        // TODO code application logic here
    }
    
    static private void selectEjercicio(){
        while(true){//Bucle infinito hasta marcar opcion 0
            int op = ToolsAndMenu.menu();
            //Actuamos sobre lo solicitado
            switch (op){
                case 0://SALIDA APP
                    System.out.println("Esperamos volver a verle pronto");
                    ToolsAndMenu.pausa();
                    System.exit(0);//Provocamos la salida del programa
                    break;
                case 1:
                    ToolsAndMenu.title(ToolsAndMenu.DESCRIPCIONOPCIONS[0]);//TITULO EJERCICIO 1
                    Ejercicio1.start(); //Arrancamos el ejercicio 1
                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    ToolsAndMenu.title(ToolsAndMenu.DESCRIPCIONOPCIONS[1]);//TITULO EJERCICIO 2
                    Ejercicio2.start(); //Arrancamos el ejercicio 2
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    ToolsAndMenu.title(ToolsAndMenu.DESCRIPCIONOPCIONS[2]);//TITULO EJERCICIO 3
                    Ejercicio3.start(3); //Arrancamos el ejercicio 3 con el numero de elemento delimitados si no le pasamos nada nos pedira el numero de elementos
                    ToolsAndMenu.pausa();
                    break;
                case 4:
                    ToolsAndMenu.title(ToolsAndMenu.DESCRIPCIONOPCIONS[3]);//TITULO EJERCICIO 4
                    Ejercicio4.start();
                    ToolsAndMenu.pausa();
                    break;
                case 5:
                    ToolsAndMenu.title(ToolsAndMenu.DESCRIPCIONOPCIONS[4]);//TITULO EJERCICIO 5
                    Ejercicio5.start();
                    ToolsAndMenu.pausa();
                    break;
                case 6:
                    ToolsAndMenu.title(ToolsAndMenu.DESCRIPCIONOPCIONS[5]);//TITULO EJERCICIO 6 
                    Ejercicio6.start();
                    ToolsAndMenu.pausa();
                    break; 
                case 7:
                    ToolsAndMenu.title(ToolsAndMenu.DESCRIPCIONOPCIONS[6]);//TITULO EJERCICIO 7
                    Ejercicio7.start();
                    ToolsAndMenu.pausa();
                    break;  
                case 8:
                    ToolsAndMenu.title(ToolsAndMenu.DESCRIPCIONOPCIONS[7]);//TITULO EJERCICIO 8
                    Ejercicio8.start(10);//Arrancamos el ejercicio 8 con el numero de elemento delimitados si no le pasamos nada nos pedira el numero de elementos como marca el ejercicio
                    ToolsAndMenu.pausa();
                    break;  
                default://Nunca se debe dar se encarga la funcion menu de esto
                    System.out.println("Elemento seleccionado no reconocido.\n");
                    ToolsAndMenu.pausa();
                    break;
                }
        }
    }
}
