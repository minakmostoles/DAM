/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4.Matriculas;

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
public class Textos_MatriculaMenu {

    final static public String[] TITLEMENU = new String[] {"MATRICULA ALUMNOS"};
    static final String[] MENUOPCIONS = new String[] {
                                            "1.- Crear alumno.",
                                            "2.- Buscar alumno sin matricular por DNI.",  
                                            "3.- Lista alumnos sin matricular.",
                                            "4.- Borrar alumnos sin matricular con DNI.\n"
                                            +"*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*",        
                                            "5.- Matricular alumno.",
                                            "6.- Borrar alumno matriculado con DNI.",
                                            "7.- Mostrar ultimo alumno matriculado.",
                                            "8.- Mostrar alumnos matriculados.",
                                            "9.- Buscar alumno matriculado por DNI.\n"            
                                            +"*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*",
                                            "0.- Salir"};

}
