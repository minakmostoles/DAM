/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea10.pkg1;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import rubio_avila_mario_tarea10.pkg1.Mascotas.Cuidador;
import rubio_avila_mario_tarea10.pkg1.Mascotas.Mascota;
import static rubio_avila_mario_tarea10.pkg1.jdbc_ConexionMascotas.*;


/**
 *
 * @author Damel_VPC
 */


public class jdbc_ManipulacionMascotas {
    /**
     * Dada una sentencia cualquiera la ejecuta sobre la base de datos. (Usada para la funcion update)
     * @param secuencia 
     */
    static void executeSenteceSQL (String secuencia){
        try {
            PreparedStatement pstmt;
            ResultSet resultado;
            pstmt = conexionRealizada.prepareStatement(secuencia);
            resultado = pstmt.executeQuery();
            
        } catch (SQLException ex) {
            manejadorErroresBD(ex);
        }
    }
    
    
    /**
     * Permite insertar una nueva mascota dentro de la base de datos
     * @param mascotaAInsertar 
     */
    static void setBDMascota (Mascota mascotaAInsertar) {
        try {
            PreparedStatement pstmt;
            ResultSet resultado;
            //La siguente linea sufre una modificacion temporal para solucionar un bug que se optimizarar en futuras versiones
            pstmt = conexionRealizada.prepareStatement(INSERTARMASCOTATEMPORAL + mascotaAInsertar.getStringSQLUpdateVacunas() + INSERTARMASCOTATEMPORALFINSENTENCIA);
            //pstmt = conexionRealizada.prepareStatement(INSERTARMASCOTA);
            pstmt.setString(1,mascotaAInsertar.getIDMascota());//IDMASCOTA
            pstmt.setInt(2,mascotaAInsertar.getEdad());//EDAD MASCOTA
            pstmt.setString(3,mascotaAInsertar.persACargo.getDNI());//DNI PROPIETARIO
            pstmt.setString(4,mascotaAInsertar.persACargo.getNombre());//NOMBRE PROPIETARIO
            pstmt.setString(5,mascotaAInsertar.persACargo.getApellido1());//APELLIDO1 PROPIETARIO
            pstmt.setString(6,mascotaAInsertar.persACargo.getApellido2());//APELLIDO2 PROPIETARIO
            pstmt.setString(7,mascotaAInsertar.persACargo.getDireccion());//DIRECCION
            
            //Lo siguiente queda para analisis en el futuro por falta de tiempo
            //La solucion esta aqui
            //https://stackoverflow.com/questions/17842211/how-to-use-an-arraylist-as-a-prepared-statement-parameter
            //System.out.println(mascotaAInsertar.getStringSQLParametrizadaVacunas()); Esto no va aunque sea un String perfecto
            //pstmt.setString(8,mascotaAInsertar.getStringSQLParametrizadaVacunas());  Esto no va aunque sea un String perfecto
            //pstmt.setArray(8,(Array) mascotaAInsertar.getVacunas());       Esto es lo que deberia ser
            resultado = pstmt.executeQuery();
        } catch (SQLException ex) {
            manejadorErroresBD(ex);
        }
    }
    
    /**
     * Obtiene todas las mascotas y las muestra en consola
     */
    static void getBDMascota () {
        try {
            PreparedStatement pstmt;
            ResultSet resultado;
            pstmt = conexionRealizada.prepareStatement(MOSTRARTODASMASCOTAS + ORDERBYASC);
            pstmt.setString(1,"IDMASCOTA");
            resultado = pstmt.executeQuery();
            //*********************/
           while(resultado.next()){
               String idMascota = resultado.getString(1);
               int edad         = resultado.getInt   (2);
                Cuidador cu1 = getBDCuidador((oracle.sql.STRUCT)resultado.getObject(3));
                ArrayList<String> vacunas = getDBVacunas(resultado.getArray(4));
                //Lo convierto en un objeto (Para futuras Versiones)
                Mascota mascotaNew = new Mascota(idMascota,edad,cu1,vacunas);
                mascotaNew.muestraMascotaConsola();
           }
           
        } catch (SQLException ex) {
            manejadorErroresBD(ex);
            //Logger.getLogger(jdbc_ManipulacionMascotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Obtiene una mascota segun su id y la muesta en pantalla. Ademas de esto la vuelca en una clase mascota para poder interactuar con ella si 
     * hacer consultas continuas a la base de datos.
     * @param IDMASCOTA
     * @return 
     */
    static Mascota getBDMascota (String IDMASCOTA){
        try {
            PreparedStatement pstmt;
            ResultSet resultado;
            pstmt = conexionRealizada.prepareStatement(MOSTRARMASCOTAID);
            pstmt.setString(1,IDMASCOTA);
            resultado = pstmt.executeQuery();   
            
           //*********************/
           while(resultado.next()){
               String idMascota = resultado.getString(1);
               int edad         = resultado.getInt   (2);
                Cuidador cu1 = getBDCuidador((oracle.sql.STRUCT)resultado.getObject(3));
                ArrayList<String> vacunas = getDBVacunas(resultado.getArray(4));
                //Lo convierto en un objeto java
                Mascota mascotaNew = new Mascota(idMascota,edad,cu1,vacunas);
                mascotaNew.muestraMascotaConsola();
                return mascotaNew;
           }
        } catch (SQLException ex) {
            manejadorErroresBD(ex);
            //Logger.getLogger(jdbc_ManipulacionMascotas.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
    }    
    
    /**
     * Busca si exite un id concreto y devuelve true o false
     * @param IDMASCOTA
     * @return 
     */
    static boolean existeBDIDMascota (String IDMASCOTA){
        try {
            PreparedStatement pstmt;
            ResultSet resultado;
            pstmt = conexionRealizada.prepareStatement(BUSCAMASCOTAID);
            pstmt.setString(1,IDMASCOTA);
            resultado = pstmt.executeQuery();
            while(resultado.next()){
                if (resultado.getInt(1)>= 1) return true;
            }
           
        } catch (SQLException ex) {
            manejadorErroresBD(ex);
            //Logger.getLogger(jdbc_ManipulacionMascotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }  
    
    /**
     * Dado un id lo borra de la base de datos
     * @param IDMASCOTA
     * @return 
     */
    static void borrarBDIDMascota (String IDMASCOTA){
        try {
            PreparedStatement pstmt;
            ResultSet resultado;
            pstmt = conexionRealizada.prepareStatement(BORRARMASCOTA);
            pstmt.setString(1,IDMASCOTA);
            resultado = pstmt.executeQuery();

        } catch (SQLException ex) {
            manejadorErroresBD(ex);
            //Logger.getLogger(jdbc_ManipulacionMascotas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    /**
     * Funcion auxiliar coge un Array Vacunas y lo convierte en un ArrayList
     * @param vacunas
     * @return
     * @throws SQLException 
     */
    static ArrayList<String> getDBVacunas (Array vacunas) throws SQLException{
       ArrayList<String> vacunasStringArray = new ArrayList<String>();
       if (vacunas !=null){
           ResultSet rsc = vacunas.getResultSet();
           while (rsc.next()){
               vacunasStringArray.add(rsc.getString(2));//La 1 es la posicion y la 2 el contenido
               //System.out.println("   VACUNA : " + rsc.getString(2));
           }
       }
       return vacunasStringArray; 
    }
    
    /**
     * Funcion auxiliar coge un cuidador de la base de datos y lo vuelca en un objeto cuidador
     * @param cuidadorStruct
     * @return
     * @throws SQLException 
     */
    static Cuidador getBDCuidador(oracle.sql.STRUCT cuidadorStruct) throws SQLException{
        Cuidador cu1 = null;
        //oracle.sql.STRUCT cuidadorStruct = (oracle.sql.STRUCT)resultado.getObject(3);
        Object [] attrs = cuidadorStruct.getAttributes();
        String nombre = (String)attrs[0];
        String apellido1 = (String)attrs[1];
        String apellido2 = (String)attrs[2];
        String dni       = (String)attrs[3];
        String direccion = (String)attrs[4];
        cu1 = new Cuidador (nombre,apellido1,apellido2,dni,direccion);
        return cu1;
    }
}