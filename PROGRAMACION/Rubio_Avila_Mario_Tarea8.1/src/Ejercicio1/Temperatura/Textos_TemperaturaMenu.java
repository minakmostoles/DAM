/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.Temperatura;

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
public class Textos_TemperaturaMenu {

    final static public String[] TITLEMENU = new String[] {"TEMPERATURA"};
    static final String[] MENUOPCIONS = new String[] {
                                            "1.- Temperatura Media.",
                                            "2.- Temperatura Maxima.",
                                            "3.- Temperatura Minima.",
                                            "4.- Dias por encima de la media.",
                                            "5.- Mostrar todo los datos.",        
                                            "6.- Modificar temperatura concreta.",
                                            "7.- Insertar nuevas temperaturas.",  
                                            "0.- Salir"};

}
