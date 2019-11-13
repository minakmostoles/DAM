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
public class Ejercicio7 {
    
    final static private String[] TEXTOPCIONS = new String[] {
                                            "BIENVENIDO",
                                            "CONTRASEÑA INCORRECTA",
                                            "DISPOSITIVO BLOQUEADO"};
    
    final static public String PASSWORD = "Mario";
    final static private int INTENTOSMAXIMOS = 10; //CONSTANTES DE MARGEN SUPERIOR
    
    static public Boolean start(){//Devuelve verdadero si se logeo correctamente y falso si se acaban las oportunidades
        String lastPass;
        int index = 1;
        
        do{//Capturamos los numeros
           lastPass = ToolsAndMenu.getStringFromKB("el password correcto. Es el intento "+ (index) +"/" + INTENTOSMAXIMOS);
           if (lastPass.equals(PASSWORD)) {
               ToolsAndMenu.title(TEXTOPCIONS[0]);//Password correcto
               return true;}
           else {System.out.println(TEXTOPCIONS[1]);}//Error de password
           index++;//Usado para marcar el indice y 
        }while(index <= 10);
        ToolsAndMenu.title(TEXTOPCIONS[2]);//Se acabaron las posibilidades
        return false;
    }
}
