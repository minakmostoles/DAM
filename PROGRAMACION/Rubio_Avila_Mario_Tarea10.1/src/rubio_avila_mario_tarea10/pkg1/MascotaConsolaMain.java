/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea10.pkg1;

import Utilidades.ColorConsole;
import Utilidades.ToolsAndMenu;
import java.util.ArrayList;
import java.util.Arrays;
import rubio_avila_mario_tarea10.pkg1.Mascotas.Cuidador;
import rubio_avila_mario_tarea10.pkg1.Mascotas.Mascota;
import static rubio_avila_mario_tarea10.pkg1.jdbc_ConexionMascotas.SQLSELECTORIDMASCOTAID;
import static rubio_avila_mario_tarea10.pkg1.jdbc_ConexionMascotas.SQLSENTENCE_UPDATE;
import static rubio_avila_mario_tarea10.pkg1.jdbc_ConexionMascotas.TABLAMASCOTAS;
import static rubio_avila_mario_tarea10.pkg1.jdbc_ConexionMascotas.conectarBDMascotas;
import static rubio_avila_mario_tarea10.pkg1.jdbc_ManipulacionMascotas.borrarBDIDMascota;
import static rubio_avila_mario_tarea10.pkg1.jdbc_ManipulacionMascotas.executeSenteceSQL;
import static rubio_avila_mario_tarea10.pkg1.jdbc_ManipulacionMascotas.existeBDIDMascota;
import static rubio_avila_mario_tarea10.pkg1.jdbc_ManipulacionMascotas.getBDMascota;
import static rubio_avila_mario_tarea10.pkg1.jdbc_ManipulacionMascotas.setBDMascota;

/**
 * Esta clase dispone la vista por terminal
 * @author Mario-PC
 */
public class MascotaConsolaMain {
    
    /***********************************************************************************************************/
    //Variables o constantes de opciones
    public static final boolean MODEDEMO = true;          //Rellena las lista con datos que permiten la comprobacion
    public static final boolean MODEDEBUG = false;         //Existen ciertos mensajes que no se muestran ya que son para el control de la app en desarrollo
    public static boolean activateGUI=false;              //Permite entrar en el modo grafico (NO IMPLANTADO)
    
    /***********************************************************************************************************/
    //Variables de funcionamientos

    
    /***********************************************************************************************************/
    //ENTRADA A LA CLASE
    /**
     * Configura el comportamiento y cede el control al menu principal
     */
    static public void mainPrincipal(){
        ToolsAndMenu.title(new String []{Textos_MainMenu.TITLENAME, Textos_MainMenu.AUTHORNAME});//USAMOS UN DECORADOR PARA EL TITULO
        conectarBDMascotas();    //Establece conexion con la base de datos si no conecta cerrara el programa.
        if (MODEDEMO)modoDemo ();//Si esta activo el modo de demo genera 5 mascotas para poder jugar
        selectMainPrincipal();   //Llama al programa principal
    }
    
    /***********************************************************************************************************/
    //MENUS
    /**
     * Menu principal de consola permite realizar las funciones principales
     */
    static private void selectMainPrincipal(){
        while(!activateGUI){//Bucle infinito hasta marcar opcion 0
            ToolsAndMenu.title(Textos_MainMenu.TITLEMENU);
            int op = ToolsAndMenu.menu(Textos_MainMenu.MENUOPCIONS);
            //Actuamos sobre lo solicitado
            switch (op){
                case 0://SALIDA APP
                    System.out.println("Esperamos volver a verle pronto");
                    ToolsAndMenu.sleepThread(1);                    //Pausa por tiempo
                    System.exit(0);                                 //Provocamos la salida del programa
                    break;
                case 1://Agnadir
                    Mascota mascotaAInsertar = getKBMascota();      //Inserto mascota por teclado
                    if(mascotaAInsertar != null){                   //Si hay mascota
                        mascotaAInsertar.muestraMascotaConsola();   //Muestro la mascota a insertar
                        setBDMascota(mascotaAInsertar);             //Inserto la mascota en la base de datos
                    ToolsAndMenu.pausa();                           //Pausa cualquier tebla para continuar
                    }
                    break;
                case 2://Eliminar
                    String IDMascotaABorrar = ToolsAndMenu.getStringFromKB(3, "id mascota a borrar");                 //Solito id a eliminar
                    if (IDMascotaABorrar != "" && existeBDIDMascota(IDMascotaABorrar)){                               //Verifico que no sea "" y si es asi veifico si existe
                        getBDMascota(IDMascotaABorrar);                                                               //Lo muestro en pantalla
                        if (ToolsAndMenu.getYESorNOTFromKB("estas seguro")) borrarBDIDMascota(IDMascotaABorrar);      //Pregunto si estas seguro y si es si lo borro
                    }else System.out.println(ColorConsole.RED + "ID No valido o no encontrado" + ColorConsole.RESET); //Si no es valido el ID muestro este mensaje
                    ToolsAndMenu.pausa();
                    break;
                case 3://Mostrar todo los registros
                    getBDMascota();                     //Cojo todos los registros y los muestro. 
                    ToolsAndMenu.pausa();               //Hago una pausa por teclado.
                    break;
                case 4://Buscar y mostrar por ID
                    String IDMascotas = ToolsAndMenu.getStringFromKB(3, "id mascota a buscar");  //Solito id a buscar
                    if (IDMascotas != "" && existeBDIDMascota(IDMascotas)){                      //Verifico que no sea "" y si es asi veifico si existe
                        getBDMascota(IDMascotas);                                                //Cojo y muestro el registro
                    }else System.out.println(ColorConsole.RED + "ID No valido o no encontrado" + ColorConsole.RESET);
                    ToolsAndMenu.pausa();
                    break;
                case 5://Actualizar mascota
                    String IDMascotasUpdate = ToolsAndMenu.getStringFromKB(3, "id mascota a actualizar");
                    if (IDMascotasUpdate != "" && existeBDIDMascota(IDMascotasUpdate)){
                        System.out.println(ColorConsole.PURPLE + "Deje en blanco aquellos datos que no desees modificar." + ColorConsole.RESET);
                        getUpdateKBMascota(IDMascotasUpdate);
                    }else System.out.println(ColorConsole.RED + "ID No valido o no encontrado" + ColorConsole.RESET);
                    ToolsAndMenu.pausa();                    
                    break;
            }
        }
    }

    /**
     * Se le pasa un idMascota que se mostrara los datos actuales y pedira lo nuevo. Aquello que sea "" no se modificara
     * o en caso de la edad igual o menor a 0. La sentencia a ejecutar se conforma aqui intentando ser eficaz y solo tocar lo necesario.
     * Para esto nos ayudamos del objeto mascota que guarda una copia de la lectura de lo que se encuentra en la bd.
     * @param IdMascota Es el ID del registro a cambiar
     */
    static private void getUpdateKBMascota(String IdMascota){
        System.out.println(ColorConsole.BLUE + "Los datos actuales del registro son :" + ColorConsole.RESET);
        Mascota c1 = getBDMascota(IdMascota);//Cojemos el registo de la bd de datos y lo volcamos a nuestro objeto
        if (c1 != null){
            String secuenciaSQL = SQLSENTENCE_UPDATE;//Se comienza a confeccionar la sentencia de actualizacion.
             int numeroModificaciones = 0; //Identifica el numero de modificadaciones que se desean realizar.
             
            //MODIFICAR EDAD
            int edad = ToolsAndMenu.getIntFromKB("la edad del animal(0 o menor a 0 para no modificar)"); 
            if (edad > 0 ){//secuenciaSQL = secuenciaSQL + " edad = " + edad;//Edad valida la ajustamos
                c1.setEdad(edad);
                secuenciaSQL = secuenciaSQL + "edad = " + edad; //agnadimos la sentencia de cambio de edad
                numeroModificaciones++;//Agnadimos una modificacion mas
            }
            
            //MODIFICAR CUIDADOR
            boolean flagModificacionCuidador = false; //Flag que indica que algun dato del cuidador se modifico
            
            String DNI = ToolsAndMenu.getStringFromKB(3, "el DNI del cuidador");
            if (!DNI.equals("")){
                flagModificacionCuidador = true;//Activamos flag de cambios en cuidador
                c1.persACargo.setDNI(DNI);
            }
            String Nombre = ToolsAndMenu.getStringFromKB("el nombre cuidador");
            if (!Nombre.equals("")){
                flagModificacionCuidador = true;//Activamos flag de cambios en cuidador
                c1.persACargo.setNombre(Nombre);
            }
            String Apellido1 = ToolsAndMenu.getStringFromKB("el primer apellido del cuidador");
            if (!Apellido1.equals("")){
                flagModificacionCuidador = true;//Activamos flag de cambios en cuidador
                c1.persACargo.setApellido1(Apellido1);
            }
            String Apellido2 = ToolsAndMenu.getStringFromKB("el segundo apellido del cuidador");
            if (!Apellido2.equals("")){
                flagModificacionCuidador = true;//Activamos flag de cambios en cuidador
                c1.persACargo.setApellido2(Apellido2);
            }
            String Direccion = ToolsAndMenu.getStringFromKB(3, "la direccion del cuidador");
            if (!Direccion.equals("")){
                flagModificacionCuidador = true;//Activamos flag de cambios en cuidador
                c1.persACargo.setDireccion(Direccion);
            }
            if (flagModificacionCuidador){//Si hay algun cambio en cuidador activamos el flag para agnadir la sentencia para actualizarlo
                if (numeroModificaciones > 0) secuenciaSQL = secuenciaSQL + ","; //Hay que agnadir una coma
                secuenciaSQL = secuenciaSQL + "CUIDADOR = TIPO_CUIDADOR('"
                        + DNI + "','"
                        + Nombre + "','"
                        + Apellido1 + "','"
                        + Apellido2 + "','"
                        + Direccion + "')";
                numeroModificaciones++;//Agnadimos una modificacion mas
            }
            
            //MODIFICACION VACUNAS
            //ArrayList<String> listaVacunas = getArrayListStringFromKB(10 ,"nombre de la vacuna");//Vamos a capturar en un array las 10 vacunas
            boolean flagModificacionVacunas = false; //Flag que indica que algun dato del cuidador se modifico
            int op = 0;
            do{
            System.out.println("Las vacunas actuales son: "+ c1.getStringVacunas());
            ToolsAndMenu.title(Textos_MainMenu.TITLEMENUACTUALIZARVACUNAS);
            op = ToolsAndMenu.menu(Textos_MainMenu.MENUOPCIONSACTUALIZARVACUNAS);
            //Actuamos sobre lo solicitado
            switch (op){                
                case 0://SALIDA APP
                    System.out.println("Volviendo");
                    break;
                case 1://Agnadir uno 
                    int opcC1 = ToolsAndMenu.menu(c1.listaMenuVacunas());
                    opcC1 = opcC1 -1; //Le resto uno porque la primera posicion de vacuna es la 0 por eso realmente el salir es el -1 y no el 0
                    if (opcC1<0) break;
                    else{//Procedemos a modificar una vacuna
                        String NewVacuna = ToolsAndMenu.getStringFromKB("la nueva vacuna");
                        if (!NewVacuna.equals("")){
                            c1.setVacunas(NewVacuna,opcC1);
                            flagModificacionVacunas = true;
                        } 
                    }             
                    break;
                case 2://Agnadir uno nuevo
                    if(c1.getVacunas().size()<10){
                        String NewVacuna = ToolsAndMenu.getStringFromKB("la nueva vacuna");
                        if (!NewVacuna.equals("")){
                            c1.setVacunas(NewVacuna);
                            flagModificacionVacunas = true;
                        } 
                    }else System.out.println(ColorConsole.RED + "Maximo registros alcandados. No puede haber mas de 10 elementos" + ColorConsole.RESET);
                    break;
            }
            }while( op !=0);
            if (flagModificacionVacunas){
                if (numeroModificaciones > 0) secuenciaSQL = secuenciaSQL + ","; //Hay que agnadir una coma
                secuenciaSQL = secuenciaSQL + "VACUNAS = TIPO_VACUNAS(";
                secuenciaSQL = secuenciaSQL + c1.getStringSQLUpdateVacunas();
                secuenciaSQL = secuenciaSQL + (")");
                System.out.println(secuenciaSQL);
                numeroModificaciones++;//Agnadimos una modificacion mas
            }
            
            //Veredicto final
            if (numeroModificaciones > 0){//Si hay modificaciones realizamos la actualizacion si no.
                secuenciaSQL = secuenciaSQL + SQLSELECTORIDMASCOTAID + "'" + IdMascota + "'";  
                System.out.println(ColorConsole.PURPLE + "Se procede a modificar el registro." + ColorConsole.RESET);
                if (MODEDEBUG) System.out.println(secuenciaSQL); //Muestro la sentencia solo si el modo debug esta Activo
                executeSenteceSQL(secuenciaSQL);  //Ejecuto la sentencia anterior
                System.out.println(ColorConsole.BLUE + "Los datos actuales del registro son :" + ColorConsole.RESET);
                getBDMascota(IdMascota);     //Vuelvo a volcar de la bd el registro para comprobarlo
            }else System.out.println("No hay modificaciones que realizar.");
            
        }else System.out.println("Error al obtener la mascota a operar.");
  }
    
    /**
     * Solicita por teclado todos los datos que necesitas de una mascota para que lo introductas por teclado
     * @return Devuelve el objeto Mascota completo si no es correcto devolvera un objero null
     */
    static private Mascota getKBMascota(){
        Mascota newMascota = null;
        String IDMASCOTA = ToolsAndMenu.getStringFromKB(3, "el ID Matricula del animal");
        //Vamos a comprobar si esta sobre la tabla
        if (!IDMASCOTA.equals("") && !existeBDIDMascota(IDMASCOTA)){
                Cuidador c1 = getKBCuidador();
                if (c1 != null){//Si hay cuidador seguimos
                    int edad = ToolsAndMenu.getIntFromKB("la edad del animal"); 
                    ArrayList<String> listaVacunas = ToolsAndMenu.getArrayListStringFromKB(10 ,"nombre de la vacuna");//Vamos a capturar en un array las 10 vacunas
                    newMascota = new Mascota(IDMASCOTA,edad,c1,listaVacunas);
                }else System.out.println(ColorConsole.RED + "La mascota no fue creada falta cuidador" + ColorConsole.RESET);
        }else System.out.println(ColorConsole.RED + "La mascota no fue creada id no valido" + ColorConsole.RESET);
        return newMascota;
    }
    
    /**
     * Solicita por teclado todos los datos que necesitas de un cuidador para que lo introductas por teclado
     * @return Devuelve el objeto Cuidador completo si no es correcto devolvera un objero null
     */
    static private Cuidador getKBCuidador(){
        Cuidador c1 = null;
        String DNI = ToolsAndMenu.getStringFromKB(3, "el DNI del cuidador (es imprescindible)");
        if (!DNI.equals("")){
        String Nombre = ToolsAndMenu.getStringFromKB("el nombre cuidador");
        String Apellido1 = ToolsAndMenu.getStringFromKB("el primer apellido del cuidador");
        String Apellido2 = ToolsAndMenu.getStringFromKB("el segundo apellido del cuidador");
        String Direccion = ToolsAndMenu.getStringFromKB(3, "la direccion");
        c1 = new Cuidador(Nombre,Apellido1,Apellido2,DNI,Direccion);
        }else{
            System.out.println(ColorConsole.RED + "El cuidador no fue creado" + ColorConsole.RESET);
        }
        return c1;
    }
    
    /**
     * Inserta en la base de datos unos registro prefijados para facilitar el jugar con el sistema
     */
    static private void modoDemo(){
    //genera unos elementos demo
        System.out.println("Se esta ejecutando un modo demo, si ocurren errores de registros duplicados es normal.\nYa que ocurre por la ejecucion del modo demo repetidamente y se usa para comprobar el control de errores.");
        //Propietarios
        ArrayList<Cuidador> arrayCuidador = new ArrayList<Cuidador>();               //Lista de viajeros
        ArrayList<String> Vacunas;
        ArrayList<Mascota> arrayMascotas = new ArrayList<Mascota>();   //Lista de propietarios
        arrayCuidador.add(new Cuidador("Marco",  "Herraz","Rodriguez","00000000A","Cuatro Caminos Madrid"));
        arrayCuidador.add(new Cuidador("Mario",  "Rubio", "Avila",    "00000001B","Av.Estrecho Madrid"));
        arrayCuidador.add(new Cuidador("Jorge",  "Campos","Mendoza",  "00000002C","Av.Atocha Madrid"));
        arrayCuidador.add(new Cuidador("Rocio",  "Fuente","Diaz",     "00000003D","C/Constitucion Fuenlabra"));
        arrayCuidador.add(new Cuidador("Beatriz","Mendez","Blas",     "00000004E","C/Larga Alcorcon"));

        ArrayList<String> Va1 = new ArrayList<String>(Arrays.asList("Parvovirus","Moquillo canino","Coronavirus"));
        ArrayList<String> Va2 = new ArrayList<String>(Arrays.asList("Parvovirus","Moquillo canino","Coronavirus","Hepatitis","Parainfluenza","Leptospirosis","Rabia"));
        ArrayList<String> Va3 = new ArrayList<String>(Arrays.asList("Parvovirus","Moquillo canino","Coronavirus","Hepatitis","Rabia"));
        ArrayList<String> Va4 = new ArrayList<String>(Arrays.asList("Parvovirus","Moquillo canino","Coronavirus","Rabia"));
        ArrayList<String> Va5 = new ArrayList<String>(Arrays.asList("Parvovirus"));
        
        arrayMascotas.add(new Mascota("D01",1,arrayCuidador.get(0),Va1));//Propietario Marco
        arrayMascotas.add(new Mascota("D02",3,arrayCuidador.get(1),Va2));//Propietario Mario
        arrayMascotas.add(new Mascota("D03",4,arrayCuidador.get(2),Va3));//Propietario Jorge      
        arrayMascotas.add(new Mascota("D04",8,arrayCuidador.get(3),Va4));//Propietario Rocio 
        arrayMascotas.add(new Mascota("D05",2,arrayCuidador.get(4),Va5));//Propietario Beatriz 
        
        //mascotaAInsertar.muestraMascotaConsola();
        for (Mascota e : arrayMascotas) setBDMascota(e);
    }
        

}
