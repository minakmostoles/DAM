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
public class Ejercicio2 {
    
    final static public String[] CLASIFICATIONSOPCIONS = new String[] {// LISTA PARA CAMBIO RAPIDO DE TEXTOS
                                            "Campeón",   //1
                                            "Subcampeón",//2
                                            "Tercero",   //3
                                            "Lo importante es participar" //Cualquier otra cosa
                                            };    
    
    static public void start(){
        int op = ToolsAndMenu.getIntFromKB("su posicion");
        //Actuamos sobre lo solicitado
        switch (op){
            case 1:
                ToolsAndMenu.title(CLASIFICATIONSOPCIONS[0]);//PRIMERO
                break;
            case 2:
                ToolsAndMenu.title(CLASIFICATIONSOPCIONS[1]);//SEGUNDO
                break;
            case 3:
                ToolsAndMenu.title(CLASIFICATIONSOPCIONS[2]);//TERCERO
                break;                
            default:
                System.out.println(CLASIFICATIONSOPCIONS[3]);//CUALQUIER OTRA COSA
                break;
            }
        System.out.println("\nHASTA LA PROXIMA CARRERA");//Adios del programa
    }
}
