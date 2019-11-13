/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea8.pkg1;

import Ejercicio2.LoteriaPrimitiva.MainLoteriaPrimitiva;
import Utilidades.ToolsAndMenu;
import Ejercicio3.Cine.MainCine;
import Ejercicio4.Matriculas.MainMatriculas;
import Ejercicio1.Temperatura.MainTemperature;

/**
 *
 * @author Mario-PC
 */
public class Main {

    public static boolean activateGUI=false;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(activateGUI) GUI();
        else{
            ToolsAndMenu.title(new String []{Textos_MainMenu.TITLENAME, Textos_MainMenu.AUTHORNAME});//USAMOS UN DECORADOR PARA EL TITULO
            selectEjercicio();
        }
    }
    
    static private void selectEjercicio(){
        while(!activateGUI){//Bucle infinito hasta marcar opcion 0
            ToolsAndMenu.title(Textos_MainMenu.TITLEMENU);
            int op = ToolsAndMenu.menu(Textos_MainMenu.MENUOPCIONS);
            //Actuamos sobre lo solicitado
            switch (op){
                case 0://SALIDA APP
                    System.out.println("Esperamos volver a verle pronto");
                    ToolsAndMenu.sleepThread(1);//Pausa por tiempo
                    System.exit(0);//Provocamos la salida del programa
                    break;
                case 1:
                    MainTemperature.MainTemperature(); //Arrancamos el ejercicio 1
                    break;
                case 2:
                    MainLoteriaPrimitiva.MainLoteriaPrimitiva();//Arrancamos el ejercicio 2
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    MainCine.MainCine();//Arrancamos el ejercicio 3
                    break;
                case 4:
                    MainMatriculas.MainMatriculas();//Arrancamos el ejercicio 4
                    break;
                case 5:
                    GUI();//Arrancamos el ejercicio 4
                    activateGUI =true;
                    break;
            }
        }
    }
    
    static private void GUI(){
        MainGUI mainGUI = new MainGUI();
        mainGUI.setAlwaysOnTop(true);                              // Ventana siempre encima
        mainGUI.setVisible(true); 
    }


}