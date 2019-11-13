/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3.Cine;

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
public class Textos_CineMenu {

    final static public String[] TITLEMENU = new String[] {"CATALOGO PELICULAS"};
    static final String[] MENUOPCIONS = new String[] {
                                            "1.- Añadir pelicula.",
                                            "2.- Borra películas.",
                                            "3.- Mostrar películas.",
                                            "4.- Buscar por genero.",
                                            "5.- Buscar por letra.",        //Desabilitado
                                            "0.- Salir"};

}
