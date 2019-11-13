/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_tarea3.pkg1;

/**
 *
 * @author Mario-PC
 */
public class operaciones {
    //Variables
    private int x=0;
    private int y=0;
    //Constructores
    operaciones(){}                               //Constructor principal 
    operaciones(int x, int y){
        this.x = x;//Asignamos lo que le pasamos cuando construimos el elemento
        this.y = y;//Asignamos lo que le pasamos cuando construimos el elemento
    }       //Constructor con variables asignadas en la construccion del objeto (Sobrecarga de constructores)
    //Metodos getters y setters
    public int getValorX(){ //este método devuelve el valor de la variable x
        return this.x;
    }
    public void setValorX(int x1){ // este método asigna al atributo x, el valor x1 introducido
        this.x = x1;
    }
    public int getValorY(){ //este método devuelve el valor de la variable y
        return this.y;
    }
    public void setValorY(int y1 ){ // este método asigna al atributo y, el valor y1 introducido
        this.y = y1;
    }
    //Metodos de operandos
    public int sumar(){ //devuelve la suma de los dos números
        return this.x + this.y;
    }   
    public int restar(){ // devuelve la resta de los dos números
        return this.x - this.y;
    }
    public double multiplicar(){ // devuelve la multiplicación de los dos números
        return this.x * this.y;
    }
    public float dividir(){ 
        return (float)this.x / this.y;
    }          // devuelve la división de los dos números con decimales
    public int resto(){ //devuelve el resto de la división de los dos números
    return this.x % this.y;
}
}
