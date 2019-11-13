/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.Temperatura;

import Utilidades.ToolsAndMenu;

/**
 *
 * @author Mario-PC
 */
 public class MainTemperature {

    /**
     * Entrada al modulo del programa 
     */
    public static void MainTemperature() {
        selectOpcion(); //Vamos al programa
    }
    
    /**
     * Funcion que hace el trabajo de temperatura
     * Conforma el menu y solicita la inserccion de las temperaturas
     */
    static private void selectOpcion(){
            
        //INSERTAR DATOS
        temperaturas t1 = new temperaturas(getArrayTemperatureToKB());//Cojo el array y lo mando a la clase temperatura
        
        //MENU
        while(true){//Bucle infinito hasta marcar opcion 0
            ToolsAndMenu.title(Textos_TemperaturaMenu.TITLEMENU);
            int op = ToolsAndMenu.menu(Textos_TemperaturaMenu.MENUOPCIONS);
            //Actuamos sobre lo solicitado
            switch (op){
                case 0://SALIDA APP
                    System.out.println("Esperamos volver a verle pronto");
                    ToolsAndMenu.sleepThread(1);//Pausa por tiempo
                    //System.exit(0);//Provocamos la salida del programa
                    return;
                case 1:
                    System.out.println("La temperatura media es " + t1.getTempMedia());
                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    System.out.println("La temperatura maxima es " + t1.getTempMaxima());
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    System.out.println("La temperatura minima es " + t1.getTempMinima());
                    ToolsAndMenu.pausa();
                    break;
                case 4:
                    t1.mostrarTemperaturasEncimaMedia();
                    ToolsAndMenu.pausa();
                    break;
                case 5://Existe pero no la muestro en el menu por que no se pide se habilita si se descomenta su titulo en textos_TemperaturaMenu.java
                    t1.mostrarDatos();
                    ToolsAndMenu.pausa();
                    break;
                case 6://Existe pero no la muestro en el menu por que no se pide se habilita si se descomenta su titulo en textos_TemperaturaMenu.java
                    t1.setTemperaturas(ToolsAndMenu.getIntFromKB(3,"posicion"), ToolsAndMenu.getFloatFromKB(3,"temperatura") );
                    ToolsAndMenu.pausa();
                    break;
                case 7://Existe pero no la muestro en el menu por que no se pide se habilita si se descomenta su titulo en textos_TemperaturaMenu.java
                    t1.setTemperaturas(getArrayTemperatureToKB());
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }
    
    /**
     * Se encarga de crear un array de diez numeros capturados por el teclado
     * Cuando solicita la temperatura lo hace de 1 -10 pero es solo ficticio
     * toda la logica del programa es de 0 - 9
     * @return 
     */
    private static float[] getArrayTemperatureToKB(){
        float[] kbTemp = new float[10];
        for(int i = 0; i < kbTemp.length; i++){
            kbTemp[i] = ToolsAndMenu.getFloatFromKB (3,"temperatura ("+ (i+1) +")");
        }
        return kbTemp;
    }
    
}
