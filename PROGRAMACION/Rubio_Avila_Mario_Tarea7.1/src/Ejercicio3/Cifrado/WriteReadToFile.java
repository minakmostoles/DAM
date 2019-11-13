/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3.Cifrado;

import static Utilidades.ToolsAndMenu.getYESorNOTFromKB;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 * @author Mario-PC
 * METODO PARA GUARDAR Y ABRIR FICHEROS DE TEXTO
 */
public class WriteReadToFile {
    
    final static boolean debugMode = true;
    final static boolean confirmationMode = false;
    
    public static ArrayList<String>  ReadToFile(String Ruta){//"C:\\codificacion.txt"
        ArrayList<String> documento= new ArrayList<String>(); ;
        //String documento
            try {
                File archivo = new File (Ruta);
                FileReader FileRead = new FileReader (archivo);             // Apertura del fichero y creacion de BufferedReader para poder
                BufferedReader BufferRead = new BufferedReader(FileRead);   // Apertura del buffer  para hacer una lectura comoda y disponer del metodo readLine()).
                // Lectura del fichero
                String linea;
                while((linea=BufferRead.readLine())!=null){
                    if (debugMode) System.out.println("Read file : " + linea);
                    //documento = documento + linea;
                    documento.add(linea);               //Optimizando codigo nos vamos a llevar linea por linea para luego restaura linea a linea
                }
                //Vamos cerrando que aqui ya no hay nada que ver
                FileRead.close();
                BufferRead.close();
            }catch(IOException e){
                System.out.println("Uchs,que mal algo no fue bien : " + e);
                if (debugMode) e.printStackTrace();
            }
        return documento;
    }
    
    public static void WriteToFile(String Ruta, ArrayList<String> args){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            //Vamos a comprobar si existe nuestro fichero
            File archivo = new File (Ruta);
            if (confirmationMode) if (!sustituirFile(archivo)) return; //Si esta activada la opcion comprobamos si queremos sustituir y si no queremos nos vamos
                
            //Comenzamos la tarea de grabar
            fichero = new FileWriter(Ruta);
            BufferedWriter  bw = new BufferedWriter(fichero);
            PrintWriter wr = new PrintWriter(bw);
            for (int x=0; x<args.size();x++){//Vamos recorriendo y copiando
                if (debugMode) System.out.println("Write file : " + args.get(x));
                bw.write(args.get(x));
                bw.newLine();
            }//Esto lo va a hacer por cada linea
            //Vamos cerrando que es gerundio
            wr.close(); //Cerramos para que guarde el resultado
            bw.close(); //Cerramos el buffer
            fichero.close();   
        } catch (Exception e) {
            System.out.println("Uch, haber como te cuento esto pero algo no fue bien : " + e);
            if (debugMode) e.printStackTrace();
        } 
        
    }
    
    //Queremos sustituir el fichero si existe
    public static boolean sustituirFile(File fichero){//Le pasamos si queremos solo consultarlo o queremos confirmacion de sustitucion
        if (fichero.exists()){
            System.out.println("El fichero " + fichero + " existe");
            return (getYESorNOTFromKB("sustituir")); //Devuelve que podemos pisotear el fichero o false si no queremos sustituir
            }
        else
            System.out.println("El fichero " + fichero + " no existe");
        return true; //Devuelve que podemos pisotear el fichero porque no exise
    }
}