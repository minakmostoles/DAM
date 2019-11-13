/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3.Cine;

import Utilidades.ToolsAndMenu;
import static Utilidades.ToolsAndMenu.getIntFromKB;
import static Utilidades.ToolsAndMenu.getStringFromKB;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Mario-PC
 */
public class MainCine {
    
    public static final boolean DEBUGMODE = true;     //Habilita el modo debuger rellena de datos
    
    private static ArrayList <pelicula> peliculas = new ArrayList<pelicula>();
    
    public static void MainCine() {
        selectOpcion(); //Vamos al programa
    }
    
    static private void selectOpcion(){
        if (DEBUGMODE) autoGeneradorPeliculasDebug();// Si estamos en modo debug relleno  la lista con elementos
        
        //MENU
        while(true){//Bucle infinito hasta marcar opcion 0
            ToolsAndMenu.title(Textos_CineMenu.TITLEMENU);
            int op = ToolsAndMenu.menu(Textos_CineMenu.MENUOPCIONS);
            //Actuamos sobre lo solicitado
            switch (op){
                case 0://SALIDA APP
                    System.out.println("Esperamos volver a verle pronto");
                    ToolsAndMenu.sleepThread(1);//Pausa por tiempo
                    //System.exit(0);//Provocamos la salida del programa
                    return;
                case 1://Añadir película
                    try{
                        pelicula auxPeli = new pelicula(añadirPelicula());
                        peliculas.add(auxPeli);
                        System.out.println("Añadido con en la posicion : "+ peliculas.size());
                    }catch(NullPointerException e){
                        System.out.println("No se añadio nada nuevo.");
                    }catch(Exception e){System.out.println("No se pudo añadir nada "+ e);}
                    ToolsAndMenu.pausa();
                    break;
                case 2://Borrar película
                    eliminarPelicula();
                    //ToolsAndMenu.pausa();
                    break;
                case 3://Mostrar películas
                    System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*");
                    for(pelicula i : peliculas) {
                        i.mostrarPelicula();
                        System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*");
                    }
                    ToolsAndMenu.pausa();
                    break;
                case 4://Buscar por genero 
                    buscarPorGenero(getStringFromKB(3,"el genero a buscar"));
                    ToolsAndMenu.pausa();
                    break;
                case 5://Buscar por letra
                    buscadorPorLetra(getStringFromKB(3,"las letras por las comienza"));
                    ToolsAndMenu.pausa();
                    break;
                case 6://Existe pero no la muestro en el menu por que no se pide se habilita si se descomenta su titulo
                    
                    ToolsAndMenu.pausa();
                    break;
                case 7://Existe pero no la muestro en el menu por que no se pide se habilita si se descomenta su titulo
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }
    
    
    /**
     * Se encarga de mostrar un menu y hacer la eliminacion de una pelicula
     */
    public static void eliminarPelicula(){
        while(true){//Bucle infinito hasta marcar opcion 0
            ToolsAndMenu.title("ELIMINAR PELICULA");
            int op = ToolsAndMenu.menu(listaMenuPelicula());
            op = op -1; //Le resto uno porque la primera posicion de peliculas es la 0 por eso realmente el salir es el -1 y no el 0
            if (op<0)return;
            else{
                peliculas.remove(op);
            }
        }         
    }
    
    /**
     * Genera un String con los nombre de las peliculas con el fin de mostrarlo en un menu como borrar
     * @return Un array de String con las opciones de menu con las pelis disponibles.
     */
    public static String[] listaMenuPelicula(){
        ArrayList <String> titulosPeliculas = new ArrayList<String>();//Guardo el menu de con los titulos de los elementos
        //System.out.println("0.-Salir");
        titulosPeliculas.add("0.-Salir");
        for(pelicula i : peliculas) {
           //System.out.println((peliculas.indexOf(i) + 1) + ".-" + i.getNombre());
            titulosPeliculas.add((peliculas.indexOf(i) + 1) + ".-" + i.getNombre());
        }
        return titulosPeliculas.toArray(new String[titulosPeliculas.size()]);
    } 
    
    /**
     * Esta funcion añade un elemento del tipo pelicula siempre y cuando sea valido el titulo que es el unico parametro obligatorio
     * @return 
     */
    public static pelicula añadirPelicula(){
        //Captura del nombre
        String auxName = getStringFromKB(3,"el nombre de la pelicula");//Capturo el titulo de la peli

        if (!auxName.equals("")){//Si hay nombre comenzamos añadir la pelicula
            //Captura y validacion del agno No permite inserta un año superior al actual
            int agno;
            do{
                agno = getIntFromKB("el año de la pelicula");        //Un solo intento para insertar el año
                if (validateAgno(agno)) System.out.println("Por favor inserte un año menor al actual");
            }while(!validateAgno(agno));            

            //Creacion de la instancia pelicula
                pelicula newPelicula = new pelicula(              //int agno, String director, String genero, //int agnoString nombre
                    agno,                                         //Un solo intento para insertar el año
                    getStringFromKB("el director de la pelicula"),//Un solo intento para insertar el director 
                    getStringFromKB("el genero de la pelicula"),  //Un solo intento para insertar el genero
                    auxName                                       //Inserto en titulo
                );
                return newPelicula;//Devolvemos la nueva pelicula
        }//Fin de creacion de una instancia de pelicula
        
        return null;//Si no se captura un titulo valido ese devuelve null
    }

 /**
  * Si la fecha es menor a a la fecha del años o igual al actual devuelve positivo si no devuelve falso
  * Sirve para saber si la fecha instertada es menor a la actual
  * @param agno
  * @return 
  */
 public static boolean validateAgno(int agno){    
    Calendar cal= Calendar.getInstance();
    int year= cal.get(Calendar.YEAR);
    if (agno<= year) return true;//Devuelve verdadero
    return false;
 }
    
    /**
     * Se encarga de buscar y mostrar la pelis que cuenciden con ese genero. Ignora las mayusculas y minusculas.
     * @param genero 
     */
    public static void buscarPorGenero(String genero){
        System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*");
        int contadorDeEncuentros =0;                            //Este contador indica el numero de veces encontramos un genero
        for(pelicula i : peliculas) {                           //Recorro todas las pelis
            if (genero.equalsIgnoreCase(i.getGenero())) {       //Vamos a buscar el genero ignorando las mayusculas y minusculas
                i.mostrarPelicula();
                System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*");
                contadorDeEncuentros++;
            }
        }
        if (contadorDeEncuentros == 0){System.out.println("El genero "+ genero + " no fue encontrado.");}
        else System.out.println("El genero "+ genero + " fue encontrado en "+ contadorDeEncuentros + " veces.");
        System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*");
    }
    
    /**
     * Esta funcion dado un String lo buscara en el inicio del titulo de la pelicula lo hice con String porque permite buscar de una
     * manera mas flexible. Ignora las mayusculas y minusculas.
     * @param letras 
     */
    public static void buscadorPorLetra(String letras){//Tenia la posibilidad de hacerlo por Chart o String preferi por String porque asi es mas verstil puede buscar por varias letras
        System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*");
        int contadorDeEncuentros =0;                            //Este contador indica el numero de veces encontramos un genero
        for(pelicula i : peliculas) {                           //Recorro todas las pelis
            if ((i.getNombre().toLowerCase()).startsWith(letras.toLowerCase())) {             //Vamos a buscar el genero ignorando las mayusculas y minusculas
                i.mostrarPelicula();
                System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*");
                contadorDeEncuentros++;
            }
        }
        if (contadorDeEncuentros == 0){System.out.println("No ha peliculas que comiencen por "+ letras + ".");}
        else System.out.println("Por "+ letras + " comienzan "+ contadorDeEncuentros + " peliculas.");
        System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*");
    }
    
    /**
     * Funcion que rellena de datos la tabla para su comprobacion
     */
    public static void autoGeneradorPeliculasDebug(){
        peliculas.add(new pelicula(1999,"Hermanas Wachowski","Accion","Matrix"));//int agno, String director, String genero, //int agnoString nombre
        peliculas.add(new pelicula(2003,"Hermanas Wachowski","Accion","Matrix Reloaded"));//int agno, String director, String genero, //int agnoString nombre
        peliculas.add(new pelicula(2003,"Hermanas Wachowski","Accion","Matrix Revolutions"));//int agno, String director, String genero, //int agnoString nombre
        peliculas.add(new pelicula(1977,"George Lucas","Ciencia Ficcion","Star Wars: Episode IV - A New Hope"));
        peliculas.add (new pelicula(1980,"Irvin Kershner","Ciencia Ficcion","Star Wars: Episode V - The Empire Strikes Back"));
        peliculas.add (new pelicula(1983,"Richard Marquand","Ciencia Ficcion","Star Wars: Episode VI - Return of the Jedi"));
    }
    
}
