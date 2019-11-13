/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.Login;

import static Utilidades.ToolsAndMenu.getStringFromKB;
import static Utilidades.ToolsAndMenu.title;

/**
 *
 * @author Mario-PC
 */
public class Login {
    
    final static private String[] TEXTOPCIONS = new String[] {
                                            "BIENVENIDO",
                                            "CONTRASEÑA INCORRECTA",
                                            "DISPOSITIVO BLOQUEADO"};
    
    final static public String USUARIOS = "Mario";//Añadido para la tarea 7
    final static public String PASSWORDS = "1234";
    final static private int INTENTOSMAXIMOS = 10; //CONSTANTES DE MARGEN SUPERIOR
    
//Este era la funcion original
    static public Boolean start(){//Devuelve verdadero si se logeo correctamente y falso si se acaban las oportunidades
        String lastPass;
        int index = 1;
        do{//Capturamos los numeros
           lastPass = getStringFromKB("el password correcto. Es el intento "+ (index) +"/" + INTENTOSMAXIMOS);
           if (lastPass.equals(PASSWORDS)) {
               title(TEXTOPCIONS[0]);//Password correcto
               return true;}
           else {System.out.println(TEXTOPCIONS[1]);}//Error de password
           index++;//Usado para marcar el indice y 
        }while(index <= 10);
        title(TEXTOPCIONS[2]);//Se acabaron las posibilidades
        return false;
    }
    
    //Funcion para la tarea 7
    static public Boolean validate(String User, String Password){
        if (User.equals(USUARIOS) && Password.equals(PASSWORDS) ) {
               return true;}
        else {
           return false;
        }
    }
}
