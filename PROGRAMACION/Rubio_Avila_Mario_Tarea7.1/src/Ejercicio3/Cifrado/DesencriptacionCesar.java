/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3.Cifrado;

import Utilidades.ColorConsole;


/**
 *
 * @author Mario-PC
 * Esta clase desencripta pero no encripta aunque el codigo es el mismo para uno que para otro excetuando 3 lineas de codigo
 * Esta decision es elegida asi porque entiento que te puede interesar un cliente que encripte algo pero que no sea capaz el de desencriptar y sea el servidor quien desencripte
 * Aun asi esta encriptacion es muy poco robusta ya que por fuerza bruta o indice de repeticiones se podria obtener.
 */
public class DesencriptacionCesar {
    /*Metodo mejorado*/
    //private final String letrasABC = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnÑñOoPpQqRrSsTtUuVvWwXxYyZzÁáÉéÍíÓóÚú¿?¡!";//Toda las letras y el orden que va a tener mÃ¡s los caracteres
    /*Normalmente esta encriptacion ni incluye tildes ni caracteres por mejoralo un poco vamos a usarlo y asi ademas no es el tipico
    Normalmente las mayusculas se podria hacer mediante codigo y no meterlas en la codificacion pero hace que quede mas seguro*/
      
    /*Metodo como manda el enunciado*/
    private final String letrasABC = "abcdefghijklmnñopqrstuvwxy"; //original
    
    private final boolean debugMode = false;//Activa ciertos mensajes desactivados que se usan para la verificaciones SOLO ACTIVABLE DESDE CODIGO
    private boolean enableWarning = false;
    
    private int nDesplazamiento;
    //Estas dos variables siguientes tiene que ser optimizadas
    private String TextToDecodificate;
    private String TextNormal;

    public DesencriptacionCesar (){
        this.nDesplazamiento = 0;            // Inicialmente el valor del desplazamiento es 0
        this.TextToDecodificate = "";// Inicialmente el valor del desplazamiento es 0
        //cesarEncriptacion (TextToCodificate, nDesplazamiento);
    }
    
    public String DesencriptacionCesar (String TextToCodificate, int nDesplazamiento){
        setTextToDecodificate(TextToDecodificate);
        setNDesplazamiento(nDesplazamiento);
        this.TextNormal = CesarDencriptacion();
        return this.TextNormal;
    }

    public boolean isEnableWarning() {
        return enableWarning;
    }

    public void setEnableWarning(boolean enableWarning) {
        this.enableWarning = enableWarning;
    }
    /*Si se desea recuperar los elementos deberan ser obtenido antes de entrar en esta clase
    /*POR SEGURIDAD DE DEENCRIPTACION NO SE DEJARA VER LOS VALORES , DICHO DE OTRO MODO NO HAY GETTER*/
    /*POR SEGURIDAD DE DEENCRIPTACION NO SE DEJARA VER LA CADENA QUE SE USA PARA LA CONVERSION*/
    //El unico getter entrega el la cadena codificada
    public String getTextDecodificate(){
        this.TextNormal = CesarDencriptacion();
        return this.TextNormal;
    }
    //Sirven para introducir los valores de la codificacion
    public void setTextToDecodificate(String TextToDecodificate){
        if (this.enableWarning) System.out.println(ColorConsole.RED + "IMPORTANTE POR MEDIDAS DE SEGURIDAD NO SE PUEDE RECUPERAR LA CADENA INSERTADA" + ColorConsole.RESET);
        if (testedStringToDecodificate(TextToDecodificate)) this.TextToDecodificate = TextToDecodificate;
        else {System.out.println(ColorConsole.RED + "Error " + TextToDecodificate + " no es un valor valido." + ColorConsole.RESET);}
    }    
    
    public void setNDesplazamiento(int nDesplazamiento){
        if (this.enableWarning) System.out.println(ColorConsole.RED + "IMPORTANTE POR MEDIDAS DE SEGURIDAD HAS DE RECORDAR EL NUMERO DE DESPLAZAMIENTO" + ColorConsole.RESET);
        if (testedNDesplazamiento(nDesplazamiento)) this.nDesplazamiento = nDesplazamiento;
        else {System.out.println(ColorConsole.RED + "Error " + nDesplazamiento + " no es un valor valido." + ColorConsole.RESET);}
    }
    
    //Esta funcion comprueba el numero max de desplazamiento al se indicado
    private boolean testedNDesplazamiento(int nDesplazamiento){
        return nDesplazamiento >=0 && nDesplazamiento <= (letrasABC.length()-1);
    }
    
    private boolean testedStringToDecodificate(String TextToDecodificate){
        return TextToDecodificate.length() >0;
    }

    
    private String CesarDencriptacion(){
        String TextNormal = "";
        try{
            if (this.debugMode) System.out.println(this.TextToDecodificate + " con longitud " + this.TextToDecodificate.length());
            for(int x=0;x < this.TextToDecodificate.length();x++){
                if (this.letrasABC.indexOf(this.TextToDecodificate.charAt(x)) >= 0){ //La letra es una letra a ser sustituible
                    int punteroLetraNueva = this.letrasABC.indexOf(this.TextToDecodificate.charAt(x)) - this.nDesplazamiento;
                    if (punteroLetraNueva < (0)){ //Significa que el numero el puntero vuelve al final
                        punteroLetraNueva = (letrasABC.length())+ punteroLetraNueva;// Se lo sumo ya que puntero de por si es negativo 
                    }
                    TextNormal = TextNormal + this.letrasABC.charAt(punteroLetraNueva);
                    if (this.debugMode) System.out.println("* Puntero "+ punteroLetraNueva +" Caracter reconocido" + x + ": " + TextNormal.charAt(x));
                }else {//Es una letra no sustituible 
                    TextNormal = TextNormal + this.TextToDecodificate.charAt(x);
                    if (this.debugMode) System.out.println("* Caracter no reconocido " + x + ": " + TextNormal.charAt(x));
                }
            }
            System.out.println(ColorConsole.GREEN + "El texto a sido desencriptado correctamente" + ColorConsole.RESET);
            if (this.debugMode) System.out.println(TextNormal);
            return TextNormal;
        }catch(Exception e){
            System.out.println(ColorConsole.RED + "Ufff,que mal.Haber como te digo esto pero algo no salio bien y el resultado es erroneo");
            System.out.println("Error : " + e + ColorConsole.RESET);
            return TextNormal= "ERROR";
        }
    }
}
