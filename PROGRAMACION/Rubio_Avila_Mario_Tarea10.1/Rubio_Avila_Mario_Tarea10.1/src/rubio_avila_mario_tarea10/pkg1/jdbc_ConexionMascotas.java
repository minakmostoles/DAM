/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea10.pkg1;

import Utilidades.ColorConsole;
import Utilidades.ToolsAndMenu;
import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Damel_VPC
 */
public class jdbc_ConexionMascotas {

    //VARIABLES
    //Guarda la conexion una vez establecida
    static Connection conexionRealizada;   
    static final boolean  MODEDEBUG = true; //Habilita mensajes para mas control de errores

    //CONSTANTES
    //Datos Connexion
    static final String IP="127.0.0.1";
    static final int PORT=1521;
    static final String ID="XE";
    static final String USER="SYSTEM";
    static final String PASS="damel";

    //Ordenes SQL prefabricadas
    static final String TABLAMASCOTAS="TABLA_MASCOTAS";
    static final String MOSTRARTODASMASCOTAS="SELECT * FROM TABLA_MASCOTAS";
    static final String MOSTRARMASCOTAID="SELECT * FROM TABLA_MASCOTAS WHERE IDMASCOTA = ?";
    static final String BUSCAMASCOTAID="SELECT COUNT(*) FROM TABLA_MASCOTAS WHERE IDMASCOTA = ?";
    static final String INSERTARMASCOTA="INSERT INTO TABLA_MASCOTAS VALUES(TIPO_MASCOTA(?,?,TIPO_CUIDADOR(?,?,?,?,?),TIPO_VACUNAS (?)))";
    //Lo siguiente es una solucion temporal a un bug que se resolvera en siguientes versiones
    static final String INSERTARMASCOTATEMPORAL="INSERT INTO TABLA_MASCOTAS VALUES(TIPO_MASCOTA(?,?,TIPO_CUIDADOR(?,?,?,?,?),TIPO_VACUNAS (";
    static final String INSERTARMASCOTATEMPORALFINSENTENCIA = ")))";
    //
    static final String BORRARMASCOTA="DELETE FROM TABLA_MASCOTAS WHERE IDMASCOTA = ?";
    static final String ORDERBYASC=" ORDER BY ? ASC";
    static final String ORDERBYDEC=" ORDER BY ? DES";
    static final String SQLSENTENCE_UPDATE = "UPDATE " + TABLAMASCOTAS + " SET "; 
    static final String SQLSELECTORIDMASCOTAID = " WHERE IDMASCOTA = ";
    static final String FINALSENTENCIA=";";//No se usa porque no se necesita
    
    
/**
 * Configura la conexion con la base de datos y conecta.
 * @param ip
 * @param port
 * @param id
 * @param user
 * @param pass
 * @return
 * @throws SQLException 
 */
    static Connection conectarDB(String ip, int port, String id, String user, String pass) throws SQLException{
        OracleDataSource bd = new OracleDataSource();
        final String URL="jdbc:Oracle:thin:@//"+ip+":"+port+"/"+id;
        bd.setURL(URL);
        bd.setUser(user);
        bd.setPassword(pass);
        Connection conn = bd.getConnection();
        return conn;
    }
    
    /**
     * Se encarga de realizar la conexion si no es posible acaba aqui el programa
     */
    static void conectarBDMascotas(){
        try{
            System.out.println("Intentando conectar");
            conexionRealizada = conectarDB(IP,PORT,ID,USER,PASS);
            System.out.println(ColorConsole.GREEN + "Conexion correcta" + ColorConsole.RESET);
        }catch(Exception e){
            manejadorErroresBD((SQLException)e);
            //System.out.println("Algo no fue bien : " + e);
            System.out.println("Esperamos volver a verle pronto");
            ToolsAndMenu.sleepThread(1);//Pausa por tiempo
            System.exit(0);//Provocamos la salida del programa
        }
    }

    /**
     * Maneja el codigo de error para informar del problema
     * Va arrojar luz sobre el posible error que ocurran, los agrupo aqui para poder informar del tipo de error segun los indentifique
     * @param ex 
     */
    static void manejadorErroresBD(SQLException ex){
        int CodigoError = ex.getErrorCode();
        switch (CodigoError){
            case 1:
                System.out.println(ColorConsole.RED + "ORA-00001: Error se esta intentado insertar un registro duplicado. Revise el campo que se encuentra en la PK. El codigo de error es : " + CodigoError + ColorConsole.RESET);
                break;
            case 904:
                System.out.println(ColorConsole.RED + "ORA-00904: Identificador invalido. El codigo de error es : " + CodigoError + ColorConsole.RESET);
                break;                
            case 1017:
                System.out.println(ColorConsole.RED + "ORA-01017: Invalido el username/password; Acceso denegado. El codigo de error es : " + CodigoError + ColorConsole.RESET);
                break;
            case 1747:
                System.out.println(ColorConsole.RED + "ORA-01747: Especificacion de la columna invalida. El codigo de error es : " + CodigoError + ColorConsole.RESET);
                break;
            case 22814:
                System.out.println(ColorConsole.RED + "ORA-22814: El valor de atributo o elemento es mas largo del permitido. El codigo de error es : " + CodigoError + ColorConsole.RESET);
                break;                
            default:
                System.out.println(ColorConsole.RED + "ORA-" + CodigoError + " Error no identificado comuniquelo al soporte tecnico : " + CodigoError + ColorConsole.RESET );
                break;
        }
        if (MODEDEBUG) System.out.println("Error Debug : " + ex); //Usado para que el programador sepa mas del error
    }

}
