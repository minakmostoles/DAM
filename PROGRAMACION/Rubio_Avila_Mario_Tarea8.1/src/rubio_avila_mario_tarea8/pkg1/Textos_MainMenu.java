/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea8.pkg1;

import static Utilidades.ToolsAndMenu.getIntFromKB;
import java.util.Scanner;

/**
 *
 * Dispone de los array de IMPORTANCIA para la confeccion del menu principal
 * Anterior mente se disponia en la clase ToolsAndMenu pero es mejor separado 
 * ya que esto cambia en cada proyecto y ToolsAndMenu tiene menos varianza.
 * 
 * @author Mario-PC
 */
public class Textos_MainMenu {
    final static public String TITLENAME = "Tarea 8.1";
    final static public String AUTHORNAME = "Rubio Avila Mario";
    final static public String[] TITLEMENU = new String[] {"MENU PRINCIPAL"};
    static final String[] MENUOPCIONS = new String[] {
                                            "1.- Ejercicio 1 - TEMPERATURAS.",
                                            "2.- Ejercicio 2 - PRIMITIVA.",
                                            "3.- Ejercicio 3 - CINE.",
                                            "4.- Ejercicio 4 - MATRICULAS.",
                                            //"5.- Ejecutar en modo grafico.", //Descomente esta linea para activa la posibilidad de entrar en modo grafico
                                            "0.- Salir"};
    final static public String[] DESCRIPCIONOPCIONS = new String[] {// PEQUEÑO TITULO DEL EJERCICIO
                                            "TEMPERATURAS",     //EJERCIO 1
                                            "LOTERIA PRIMITIVA",//EJERCIO 2
                                            "CINE",             //EJERCIO 3
                                            "MATRICULAS"        //EJERCIO 4
                                            };                  //FIN
    
}
