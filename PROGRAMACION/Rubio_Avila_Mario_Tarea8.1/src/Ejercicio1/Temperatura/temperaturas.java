/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.Temperatura;

/**
 *
 * @author Mario-PC
 * @version 190220.01 
 * En esta clase vamos añadir temperaturas cualquier modificacion en la temperaturas provocara el calculo de la media,minima y maxima.
 */
public class temperaturas {
    private float[] temperaturas = new float[10];
    //Son variables temporateles
    private float tempMedia  = 0;
    private float tempMinima;
    private float tempMaxima;


    /*
    *GETTER AND SETTER
    *Si algun setter o getter no esta es porque es una variables interna de clase y no permito el acceso desde fuera
    */
    public float[] getTemperaturas() {
        return temperaturas;
    }

    public float getTempMedia() {
        return tempMedia;
    }

    public float getTempMinima() {
        return tempMinima;
    }

    public float getTempMaxima() {
        return tempMaxima;
    }

    /**
     * Sirve para modificar un solo elemento en una posicion, este constructor no
     * calcula nada ya que no hay elementos en la lista suficentes
     * @param posicion
     * @param valor 
     */
    public void setTemperaturas(int posicion, float valor) {
        this.temperaturas[posicion] = valor;
        evaluateMinMaxMediaTemp();
    }    
    
    /**
     * Sirve insertar una array completo
     * @param temperaturas 
     */
    public void setTemperaturas(float[] temperaturas) {
        this.temperaturas = temperaturas;//Asigno un array a la clase
        evaluateMinMaxMediaTemp();
    }    
    
    /*
    FUNCIONES PUBLICAS
    */
    /**
     * Sirve para mostrar todos los datos
     */
    public void mostrarDatos(){
        System.out.println("--------DATOS MEDIDOS----------");
        mostrarTemperaturas(); //Muestro Todas la temperaturas

        System.out.println("-------DATOS EVALUADOS---------");
        System.out.println("Temperatura Maxima : " + this.tempMaxima + "ºC");
        System.out.println("Temperatura Minima : " + this.tempMinima + "ºC");
        System.out.println("Temperatura Media  : " + this.tempMedia  + "ºC");
    }
    
    /**
     * Sirve para mostra todas las temperaturas
     */
    public void mostrarTemperaturas(){
            for(int i = 0; i < temperaturas.length; i++){
                //ATENCION : Arreglo la impresion del dia 0-9 le sumo uno cuando indico el indice para que vaya de 1-10 pero es solo fictio el programa funciona de 0-9
                System.out.println("Temperatura ("+ (i+1) + "): " + this.temperaturas[i] + "ºC");   
            }
    }
    
    public void mostrarTemperaturasEncimaMedia(){
            for(int i = 0; i < temperaturas.length; i++){
                //ATENCION : Arreglo la impresion del dia 0-9 le sumo uno cuando indico el indice para que vaya de 1-10 pero es solo fictio el programa funciona de 0-9
                if(this.tempMedia<this.temperaturas[i]) System.out.println("Temperatura del "+ (i+1) + " esta por encima de la media con " + this.temperaturas[i] + "ºC");   
            }
    }    
    
    /*
    * CONTRUCTORES
    */

    /**
     * Es un constructor vacio que inicializa todo a 0
     */
    temperaturas() {
        float[] inicializacion  = new float[]{0,0,0,0,0,0,0,0,0,0};//Cojo un array vacio
        this.temperaturas = inicializacion;                          //Se lo copio al inicial.Asi puedo crear la clase sin asignar nada y evito la caida del programa 
        this.tempMedia=0;
        this.tempMaxima=0;
        this.tempMinima=0;
        
    }    
    
    /**
     * Permite asignar un conjunto de temperaturas en un array
     * @param temperaturas 
     */
    public temperaturas(float[] temperaturas) {
        this.temperaturas = temperaturas;
        evaluateMinMaxMediaTemp();
    }
    

    /*
    FUNCIONES INTERNAS DE LA CLASE
    */
    
    /**
     * Se evalua todo es mas eficaz que hacerlo por separado
     * por que ya que recorres el array lo octientes todo
     */
    private void evaluateMinMaxMediaTemp(){
            this.tempMinima=this.temperaturas[0];//Asigno el valor del primer registro, asi  fuerzo a que se calcule
            this.tempMaxima=this.temperaturas[0];//Asigno el valor del primer registro, asi  fuerzo a que se calcule
            float auxtempMedia=0;               //Declaro una variable auxiliar para el calculo
            
            for(int i = 0; i < this.temperaturas.length; i++){
                if(this.tempMinima>this.temperaturas[i])this.tempMinima=this.temperaturas[i];//Busca la temperatura Minima
                if(this.tempMaxima<this.temperaturas[i])this.tempMaxima=this.temperaturas[i];//Busca la temperatura Maxima
                auxtempMedia = auxtempMedia + this.temperaturas[i];                          //Sumando todas las temperaturas
            }
            this.tempMedia = auxtempMedia / this.temperaturas.length;
    }
    
}
