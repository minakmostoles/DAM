/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author Mario-PC
 * Son las constantes para colorear el texto y ayuda en la visibilidad ya que
 * en la tarea 6.1 se empezo a encontrar problemas para tener una clara visibilidad
 * de los mensajes
 */
public class ColorConsole {
    static public final String BLACK="\033[30m"; 
    static public final String RED="\033[31m"; 
    static public final String GREEN="\033[32m"; 
    static public final String YELLOW="\033[33m"; 
    static public final String BLUE="\033[34m"; 
    static public final String PURPLE="\033[35m"; 
    static public final String CYAN="\033[36m"; 
    static public final String WHITE="\033[37m";
    static public final String RESET="\u001B[0m";
}
