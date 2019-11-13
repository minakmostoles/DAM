/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4.Matriculas;

import Utilidades.ToolsAndMenu;
import static Utilidades.ToolsAndMenu.getStringFromKB;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author Mario-PC
 */
public class MainMatriculas {
    
    public static final boolean DEBUGMODE = true;     //Habilita el modo debuger rellena de datos las colecciones
    
    //public static Set <alumno> alumnosCentro;
    //public static Set <alumno> alumnosCiclo;
    
    public static LinkedList <alumno> alumnosCentro;
    public static LinkedList <alumno> alumnosCiclo;
    
    public static void MainMatriculas() {
        selectOpcion(); //Vamos al programa    
    }
    
    static private void selectOpcion(){
        //LinkedList<String> object = new LinkedList<String>(); 
        //alumnosCentro = new HashSet<>();
        //alumnosCiclo = new HashSet<>(); 
        
        alumnosCentro = new LinkedList<>();
        alumnosCiclo = new LinkedList<>(); 
        
        if (DEBUGMODE) autoGeneradorAlumnosDebug();// Si estamos en modo debug relleno  la lista con elementos
        
        //MENU
        while(true){//Bucle infinito hasta marcar opcion 0
            ToolsAndMenu.title(Textos_MatriculaMenu.TITLEMENU);
            int op = ToolsAndMenu.menu(Textos_MatriculaMenu.MENUOPCIONS);
            //Actuamos sobre lo solicitado
            switch (op){
                case 0://SALIDA APP
                    System.out.println("Esperamos volver a verle pronto");
                    ToolsAndMenu.sleepThread(1);//Pausa por tiempo
                    //System.exit(0);//Provocamos la salida del programa
                    return;             
/*OPCIONES PARA NO MATRICULADOS*/
                case 1://Crear alumno. 
                    try{
                        boolean isNewElement = true;
                        alumno auxAlumno = new alumno(añadirAlumno());          //Llamamos al encargado de crear el objeto alumno
                        //Miramos si es nuevo
                        for(alumno alum : alumnosCentro){                       //Vamos a ver si no esta 
                            if (auxAlumno.equals(alum)) isNewElement=false;     //Si me lo encuentro cambio el flag
                        }
                       
                        if(isNewElement) alumnosCentro.add(auxAlumno);          //Si es un nuevo elemento lo agnado
                        //Si ya se encuentra añadido a la basura
                        else System.out.println("No se añadio nada nuevo. El DNI "+auxAlumno.getDNI() + " se encuentra ya registrado.");
                      //Añadimos a la coleccion
                        //System.out.println("Añadido con en la posicion : "+ peliculas.size());
                    }catch(NullPointerException e){
                        System.out.println("No se añadio nada nuevo.");
                    }catch(Exception e){System.out.println("No se pudo añadir nada "+ e);}
                    ToolsAndMenu.pausa();                    
                    break;

                case 2://Permite realizar una busqueda por DNI en la lista de alumnos centro
                    buscarAlumno(alumnosCentro);
                    ToolsAndMenu.pausa(); 
                    break;
                case 3://Listar alumnos sin matricular alumno. 
                    listarColeccionAlumno(alumnosCentro);
                    ToolsAndMenu.pausa(); 
                    break;
                case 4://Borrar alumno matriculado con dni.
                    if (alumnosCentro.remove(buscarAlumno(alumnosCentro)))System.out.println("El alumnos se borro correctamente.");
                    else System.out.println("El elemento no pudo ser eliminado.");
                    ToolsAndMenu.pausa();
                    break;                    
                    
/*OPCIONES PARA MATRICULADOS*/
                case 5://Matricular alumno.
                    matricularAlumno();
                    ToolsAndMenu.pausa(); 
                    break;
                case 6://Borrar alumno matriculado con dni.
                    listaMenuAlumnos(alumnosCiclo,true);   //Mando imprimir una lista de los DNI y nombres de la lista 
                    if (alumnosCiclo.remove(buscarAlumno(alumnosCiclo)))System.out.println("El alumnos se borro correctamente.");
                    else System.out.println("El elemento no pudo ser eliminado.");
                    ToolsAndMenu.pausa();
                    break;
                case 7://Mostrar ultimo alumno matriculado.
                    alumnosCiclo.getLast().mostrarAlumnos();
                    ToolsAndMenu.pausa();
                    break;
                case 8://Mostrar alumnos matriculados.
                    listarColeccionAlumno(alumnosCiclo);
                    ToolsAndMenu.pausa();
                    break;
                case 9://Permite realizar una busqueda por DNI de alumnos DNI
                    buscarAlumno(alumnosCiclo);
                    ToolsAndMenu.pausa();
                    break;
            }//FIN
        }
    }
    
/**
 * Sirve para crear un nuevo alumno
 * @return 
 */
    public static alumno añadirAlumno(){
        /*El constructor que utilizamos es el siguiente alumno(String clave, String DNI, String email, String nombre)
         *Principalemente vamos a identificar al alumnos con su DNI
        */
        //Captura el DNI, este elemento es el principal porque todo alumno tiene un DNI unico
        String auxDNI = getStringFromKB(3,"el DNI del alumno");//Capturo el DNI

        if (!auxDNI.equals("")){//Si hay nombre comenzamos añadir el alumno
            //Captura el nombre
            //String auxName = getStringFromKB(3,"el nombre del alumno");//Capturo el titulo de la peli
            
            //Creacion de la instancia pelicula
                alumno newAlumno = new alumno(                    //(String clave, String DNI, String email, String nombre)
                    0,                                            // Clave numero entero
                    auxDNI,                                       // Obligatorio el DNI
                    getStringFromKB("el email del alumnos"),      // Un solo intento para insertar el email
                    getStringFromKB("el nombre del alumno")       // Un solo intento para Inserto el nombre
                );
                return newAlumno;//Devolvemos la nueva pelicula
        }//Fin de creacion de una instancia de pelicula
        
        return null;//Si no se captura un titulo valido ese devuelve null
    }
    
    /**
     * Permite recorrer una lista para mostrar sus datos de
     * @param Alumn 
     */
    public static void listarColeccionAlumno (LinkedList <alumno> Alumn){
        System.out.println("*-*-*-*-*-*-*-*-*-*-*");
        for(alumno i : Alumn) {
            i.mostrarAlumnos();
            System.out.println("*-*-*-*-*-*-*-*-*-*-*");
        }
    }
    
    /**
     * Genera un String con el DNI y nombre de los alumnos con el fin de mostrarlo en un menu
     * @param Alumn la coleccion a recorrer
     * @param imprime valor boolean si se desea imprimir directamente el resultado. Usado si no se va usar para menu
     * @return Un array de String con las opciones de menu con las personas disponibles.
     */
    public static String[] listaMenuAlumnos(LinkedList <alumno> Alumn, boolean imprime){
        ArrayList <String> listaMenu = new ArrayList<String>();//Guardo el menu de con los titulos de los elementos
        //System.out.println("0.-Salir");
        listaMenu.add("0.-Salir");
        for(alumno i : Alumn) {
            listaMenu.add(i.getDNI() + " - " + i.getNombre());
            if (imprime)System.out.println(i.getDNI() + " - " + i.getNombre());
        }
        return listaMenu.toArray(new String[listaMenu.size()]);
    } 
    
    public static void matricularAlumno(){
        ToolsAndMenu.title("Matricular Alumnos");
        listaMenuAlumnos(alumnosCentro,true);   //Mando imprimir una lista de los DNI y nombres de la lista 
        String auxDNI = getStringFromKB(3,"el DNI del alumno que deseas matricular");//Capturo el DNI
        if (!auxDNI.equals("")){//Si hay nombre comenzamos añadir el alumno  
            for(alumno i : alumnosCentro) {
                if (i.getDNI().equalsIgnoreCase(auxDNI)){
                    if (alumnosCiclo.add (new alumno(i))&& alumnosCentro.remove(i)) {//Realiza la copia y la borra de la lista de alumnos del centro
                        System.out.println("El alumnos con "+auxDNI +" se matriculo correctamente.");
                        return; //Nos vamos que hemos termindo
                    }
                    else System.out.println("El alumnos con "+auxDNI +" no se ha matriculado.");
                }
            }
        }
    }
    
    /**
     * Dada una coleccion busca un elemento y lo muestra
     * @param Alumn 
     */
    public static alumno buscarAlumno(LinkedList <alumno> Alumn){
        String auxDNI = getStringFromKB(3,"el DNI del alumno que deseas");//Capturo el DNI
        if (!auxDNI.equals("")){//Si hay nombre comenzamos añadir el alumno        
            for(alumno i : Alumn) {
                if (i.getDNI().equalsIgnoreCase(auxDNI)){
                    i.mostrarAlumnos();
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*");
                    return i;}//Nos vamos pues fue encontrado devuelve el elemento para ser tratado
            }
            System.out.println("El DNI "+ auxDNI +"no pudo ser localizado.");
            return null;//No fue encontrado pero porque no existe en la lista
        }
        
        System.out.println("El DNI "+ auxDNI +"no es un valor valido para buscar."); //No se busca porque no es valido
        return null;// No era valido el DNI
    }    
   
    /**
     * Sirve para rellenar la colleccion y facilitar las pruebas del sistema
     */
    public static void autoGeneradorAlumnosDebug(){
        alumnosCentro.add(new alumno(0,"00A","e-mail@lovemaker.es","Mario"));
        alumnosCentro.add(new alumno(0,"01B","e-mail@lovemaker.es","Bea"));
        alumnosCentro.add(new alumno(0,"02C","e-mail@lovemaker.es","Rocio"));
        alumnosCentro.add(new alumno(0,"03D","e-mail@lovemaker.es","Alberto"));
        alumnosCiclo.add (new alumno(1,"04E","e-mail@lovemaker.es","Barbara"));
        alumnosCiclo.add (new alumno(2,"05F","e-mail@lovemaker.es","Maria"));
    }
}
