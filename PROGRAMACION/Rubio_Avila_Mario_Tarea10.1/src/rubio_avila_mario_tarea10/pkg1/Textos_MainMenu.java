/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea10.pkg1;

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
    final static public String TITLENAME = "Tarea 10.1";
    final static public String AUTHORNAME = "Rubio Avila Mario";
    
    final static public String[] TITLEMENU = new String[] {"MENU PRINCIPAL"};
    static final String[] MENUOPCIONS = new String[] {
                                            "1.- Agnadir mascota",
                                            "2.- Borrar una mascota segun ID",
                                            "3.- Mostrar todas las mascotas ",
                                            "4.- Buscar y muestra una mascota segun ID",
                                            "5.- Actualizar mascota segun ID",
                                            //"6.- Pasar a inteface grafica",   //NO IMPLEMENTADO                                            
                                            "0.- Salir"};
    //No se uso ya que son la 3 y 4 si algun dia cambio Buscar y muestra una mascota segun ID por buscar por cualquier cambio lo habilitare
    final static public String[] TITLEMENUMOSTRAR = new String[] {"MENU MOSTRAR"};
    static final String[] MENUOPCIONSMOSTRAR = new String[] {
                                            "1.- Mostrar todas las mascota",
                                            "2.- Mostrar mascota segun ID mascota",
                                            "0.- Volver"};
    
    final static public String[] TITLEMENUACTUALIZARVACUNAS = new String[] {"MENU ACTUALIZAR VACUNAS"};
    static final String[] MENUOPCIONSACTUALIZARVACUNAS = new String[] {
                                            "1.- Modificar un elemento insertado",
                                            "2.- Agnadir una nueva vacuna",
                                            "0.- Volver"};
    
}
