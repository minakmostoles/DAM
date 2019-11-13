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
 * Esta clase encripta pero no encripta aunque el codigo es el mismo para uno que para otro excetuando 3 lineas de codigo
 * Mas informacion en el codigo desencriptador. Este modulo esta dotado de mas seguridades que el main de Ejercicio1 ya que este no permite la recuperacion
 * de informacion sensible
 */
public class EncriptacionCesar {
    /*Metodo mejorado*/
    //private final String letrasABC = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnÑñOoPpQqRrSsTtUuVvWwXxYyZzÁáÉéÍíÓóÚú¿?¡!";//Toda las letras y el orden que va a tener mÃ¡s los caracteres
    /*Normalmente esta encriptacion ni incluye tildes ni caracteres por mejoralo un poco vamos a usarlo y asi ademas no es el tipico
    Normalmente las mayusculas se podria hacer mediante codigo y no meterlas en la codificacion pero hace que quede más seguro*/
      
    /*Metodo como manda el enunciado*/
    private final String letrasABC = "abcdefghijklmnñopqrstuvwxy"; //original
    
    private final boolean debugMode = false;      //Activa ciertos mensajes desactivados que se usan para la verificaciones SOLO ACTIVABLE DESDE CODIGO
    private boolean enableWarning = false;         //Desabilita lo mensajes de advertencia
    
    private int nDesplazamiento;
    //Estas dos variables siguientes tiene que ser optimizadas
    private String TextToCodificate;
    private String TextCodificate;

    public EncriptacionCesar (){
        this.nDesplazamiento = 0;            // Inicialmente el valor del desplazamiento es 0
        this.TextToCodificate = "";// Inicialmente el valor del desplazamiento es 0
    }
    
    public String EncriptacionCesar (String TextToCodificate, int nDesplazamiento){
        setTextToCodificate(TextToCodificate);
        setNDesplazamiento(nDesplazamiento);
        this.TextCodificate = CesarEncriptacion();
        return this.TextCodificate;
    }

    public boolean isEnableWarning() {
        return enableWarning;
    }

    public void setEnableWarning(boolean enableWarning) {
        this.enableWarning = enableWarning;
    }
    /*Si se desea recuperar los elementos deberan ser obtenido antes de entrar en esta clase
    /*POR SEGURIDAD DE ENCRIPTACION NO SE DEJARA VER LOS VALORES , DICHO DE OTRO MODO NO HAY GETTER*/
    /*POR SEGURIDAD DE ENCRIPTACION NO SE DEJARA VER LA CADENA QUE SE USA PARA LA CONVERSION NO HAY GETTER*/
    //El unico getter entrega el la cadena codificada
    public String getTextCodificate(){
        this.TextCodificate = CesarEncriptacion();
        return this.TextCodificate;
    }
    //Sirven para introducir los valores de la codificacion
    public void setTextToCodificate(String TextToCodificate){
        if (this.enableWarning) System.out.println(ColorConsole.RED +"IMPORTANTE POR MEDIDAS DE SEGURIDAD NO SE PUEDE RECUPERAR LA CADENA INSERTADA" + ColorConsole.RESET);
        if (testedStringToCodificate(TextToCodificate)) this.TextToCodificate = TextToCodificate;
        else {System.out.println("Error " + TextToCodificate + " no es un valor valido.");}
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
    
    private boolean testedStringToCodificate(String TextToCodificate){
        return TextToCodificate.length() >0;
    }

    
    private String CesarEncriptacion(){
        String TextCodificate = "";
        try{
            if (this.debugMode) System.out.println(this.TextToCodificate + " con longitud " + this.TextToCodificate.length());
            for(int x=0;x < this.TextToCodificate.length();x++){
                if (this.letrasABC.indexOf(this.TextToCodificate.charAt(x)) >= 0){ //La letra es una letra a ser sustituible
                    int punteroLetraNueva = this.letrasABC.indexOf(this.TextToCodificate.charAt(x)) + this.nDesplazamiento;
                    if (punteroLetraNueva >= (letrasABC.length())) //Significa que el numero el puntero vuelve al principio
                            punteroLetraNueva = punteroLetraNueva-(letrasABC.length());
                    TextCodificate = TextCodificate + this.letrasABC.charAt(punteroLetraNueva);
                    if (this.debugMode) System.out.println("* Puntero "+ punteroLetraNueva +" Caracter reconocido" + x + ": " + TextCodificate.charAt(x));
                }else {//Es una letra no sustituible 
                    TextCodificate = TextCodificate + this.TextToCodificate.charAt(x);
                    if (this.debugMode) System.out.println("* Caracter no reconocido " + x + ": " + TextCodificate.charAt(x));
                }
            }
            System.out.println(ColorConsole.GREEN + "El texto a sido codificado correctamente" + ColorConsole.RESET);
            if (this.debugMode) System.out.println(TextCodificate);
            return TextCodificate;
        }catch(Exception e){
            System.out.println("Ufff,que mal.Haber como te digo esto pero algo no salio bien y el resultado es erroneo");
            System.out.println("Error : " + e);
            return TextCodificate = "ERROR";
        }

    }
}
