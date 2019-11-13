/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea10.pkg1.Mascotas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Damel_VPC
 */
public class Mascota {

    //Getter and Setter
    public String getIDMascota() {
        return IDMascota;
    }

    public void setIDMascota(String IDMascota) {
        this.IDMascota = IDMascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Cuidador getPersACargo() {
        return persACargo;
    }

    /**
     * Permite cambiar el objeto cuidador de la clase
     * @param persACargo 
     */
    public void setPersACargo(Cuidador persACargo) {
        this.persACargo = persACargo;
    }
    
    /**
     * Genera un menu de vacunas usado para el modo actualizar en modo consola
     * @return 
     */
    public String[] listaMenuVacunas(){
        ArrayList <String> tituloVacunas = new ArrayList<String>();//Guardo el menu de con los titulos de los elementos
        tituloVacunas.add("0.-Salir");
        String[] arrayVacunas = this.getStringArrayVacunas();
        int nIndice = 1;
        for (String e : arrayVacunas){
            tituloVacunas.add(nIndice + ".-" + e);
            nIndice++;
        }
        return tituloVacunas.toArray(new String[tituloVacunas.size()]);
    } 

    /**
     * Devuelve el arraylist de las vacunas
     * @return 
     */
    public ArrayList<String> getVacunas() {
        return Vacunas;
    }
    
    /**
     * Devuelve un string con toda las vacunas
     * @return 
     */
    public String getStringVacunas(){
        String stringVacunas = "";
        for (String e : this.Vacunas) stringVacunas = stringVacunas + e + ", ";
        stringVacunas = stringVacunas.substring(0, stringVacunas.length()-2);
        return stringVacunas;
    }
    
     /**
     * Genera la instrucion usada para un en el insert/update cuando  no es parametrizada es decir cuando en la consulta sentencia de consulta
     * @return 
     */  
    public String getStringSQLUpdateVacunas(){
        String stringVacunas = "'";
        for (String e : this.Vacunas) stringVacunas = stringVacunas + e + "','";
        stringVacunas = stringVacunas.substring(0, stringVacunas.length()-2);
        return stringVacunas;        
    }    
   
    /**
     * Genera la instrucion a insertar en el insert cuando es parametrizada es decir cuando en la consulta tenemos ? (Esta para ser revisado)
     * @return 
     */
    public String getStringSQLParametrizadaVacunas(){
        String stringVacunas = "";
        for (String e : this.Vacunas) stringVacunas = stringVacunas + e + "','";
        stringVacunas = stringVacunas.substring(0, stringVacunas.length()-3);
        return stringVacunas;
    }
    
    /**
     * Devuelve un String[] de la vacunas
     * @return 
     */
    public String[] getStringArrayVacunas(){
        // Convert ArrayList to object array 
        Object[] objArr = this.Vacunas.toArray(); 
        // convert Object array to String array 
        String[] stringVacunas = Arrays.copyOf(objArr, objArr.length, String[].class); 
        return stringVacunas;
    }

    /**
     * Dada una arrayList de vacuna esta se la asigna
     * @param Vacunas 
     */
    public void setVacunas(ArrayList<String> Vacunas) {
        this.Vacunas = Vacunas;
    }

    /**
     * Sirve para añadir una nueva vacuna
     * @param newVacunas 
     */
    public void setVacunas(String newVacunas){
        this.Vacunas.add(newVacunas);
    }
    
    /**
     * Sirve para modificar una vacuna en una posicion concreta
     * @param newVacunas
     * @param opt 
     */
    public void setVacunas(String newVacunas, int opt){
        this.Vacunas.set(opt,newVacunas);
    }

    //Constructores
    public Mascota(String IDMascota, int edad, Cuidador persACargo, ArrayList<String> Vacunas) {
        this.IDMascota = IDMascota;
        this.edad = edad;
        this.persACargo = persACargo;
        this.Vacunas = Vacunas;
    }    
    
    //Funciones
    public void muestraMascotaConsola(){
                //Mostrar
                System.out.println("ID MASCOTA : " + this.IDMascota);
                System.out.println("      EDAD : " + this.edad);
                //System.out.println("   Cuidador : " + nombre + " " + apellido1 + " " + apellido2 + " " + dni + " " + direccion);
                this.persACargo.mostrarCuidadorConsola(); //Muestra el cuidador
                String stringVacunas = "";
                for (String e : Vacunas) stringVacunas = stringVacunas + e + ", ";
                stringVacunas = stringVacunas.substring(0, stringVacunas.length()-2);  //Elimino la ultima coma
                System.out.println("   VACUNAS : "+ stringVacunas);
                System.out.println(" ****************");
    }
    
    //Variables
    private String IDMascota;
    private int edad;
    public Cuidador persACargo; //Cuidador
    private ArrayList<String> Vacunas;
    

}
