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
public class notas {
    //Variables del metodo
    private String nombre ="";
    private float examen1=0.0f;
    private float examen2=0.0f;
    private float examen3=0.0f;
    //Constructores
    notas(){}                                                               //Contructor por defecto
    notas(String nombre,float examen1,float examen2,float examen3){
        this.nombre = nombre;
        this.examen1 = examen1;
        this.examen2 = examen2;
        this.examen3 = examen3;
    }//Sobrecarga de Contructores para una inicializacion rapida de la clase
    //Metodos getters y setters
    public String getNombre( ){
        return this.nombre;
    }               //Devuelve el nombre
    public void setNombre(String nombre){
    this.nombre = nombre;
    }     //Asignamos nombre
    public float getExamen1( ){
        return this.examen1;
    }               //Devuelve el examen1
    public void setExamen1(float nota1){
        this.examen1 = nota1;
    }      //Asignamos nota1
    public float getExamen2( ){
        return this.examen2;
    }               //Devuelve el examen2
    public void setExamen2(float nota2){
        this.examen2 = nota2;}      //Asignamos nota2
    public float getExamen3( ){
        return this.examen3;
    }               //Devuelve el examen3
    public void setExamen3(float nota3){
        this.examen3 = nota3;
    }      //Asignamos nota3
    //Metodos de la clase
    private float media(){
        return (this.examen1+this.examen2+this.examen3)/3;//Devuelve la media de los tres examenes
    }                    //devuelve la media de los tres examenes (ENCAPSULADO)
    public void mostrarNotas(){
        System.out.print("-------------------------\n");
        System.out.print(this.nombre + "\n");
        System.out.print("-------------------------\n");
        System.out.printf("Primer Examen : %.2f \n",this.examen1);
        System.out.printf("Segunda Examen : %.2f \n",this.examen2);
        System.out.printf("Tercera Examen : %.2f \n",this.examen3);
        System.out.print("-------------------------\n");
        System.out.printf("Nota media exámenes evaluación: %.2f \n",media());
        System.out.print("-------------------------\n");
    }              //devuelve la nota media de los exámenen
}
