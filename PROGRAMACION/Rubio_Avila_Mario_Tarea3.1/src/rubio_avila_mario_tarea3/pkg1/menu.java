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
public class menu {
    //Variables
    private String nombreCliente ="";
    private String primerPlato ="";
    private float precioPrimer = 0.0f;
    private String segundoPlato ="";
    private float precioSegundo = 0.0f;
    private String postre ="";
    private float precioPostre = 0.0f;
    final private int IVA = 21;         //Constante de IVA
    //Metodos getters y setters
    public int getIVA(){
        return this.IVA;
    }                               //Devuelve el IVA
    public String getNombreCliente(){
        return this.nombreCliente;
    }                  //Devuelve el nombre cliente
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }//Asignamos nombre cliente
    public String getPrimerPlato(){
        return this.primerPlato;
    }                    //Devuelve el nombre del primer plato
    public void setPrimerPlato(String primerPlato){
        this.primerPlato = primerPlato;
    }    //Asignamos nombre segundo plato
    public float getPrecioPrimer( ){
        return this.precioPrimer;
    }                   //Devuelve el precio del primer plato
    public void setPrecioPrimer(float precioPrimer){
        this.precioPrimer = precioPrimer;
    }   //Devuelve el precio del primer plato
    public String getSegundoPlato(){
        return this.segundoPlato;
    }                   //Devuelve el nombre del segundo plato
    public void setSegundoPlato(String segundoPlato){
        this.segundoPlato = segundoPlato;
    }  //Asignamos nombre segundo plato
    public float getPrecioSegundo( ){
        return this.precioSegundo;
    }                  //Devuelve el precio del segundo plato
    public void setPrecioSegundo(float precioSegundo){
        this.precioSegundo = precioSegundo;
    } //Devuelve el precio del segundo plato
    public String getPostre(){
        return this.postre;
    }                         //Devuelve el nombre del postre
    public void setPostre(String postre){
        this.postre = postre;
    }              //Asignamos nombre al postre
    public float getPrecioPostre( ){
        return this.precioPostre;
    }                   //Devuelve el precio del postre
    public void setPrecioPostre(float precioPostre){
        this.precioPostre = precioPostre;
    }   //Devuelve el precio del postre
    //Metodos
    private float iva(){
        return (this.precioPrimer+this.precioSegundo+this.precioPostre) * ((float)this.IVA/100);
    } //devuelve el iva del menú
    private float total() {
        return (this.precioPrimer+this.precioSegundo+this.precioPostre) + this.iva();
    }//devuelve el precio totaldel menú (incluyendo el iva) del menú (incluyendo el iva)
    void mostrarMenu(){
        //Imprimimos segun modelo la factura
        System.out.println("-------------------------");
        System.out.print("Nombre  : " + this.nombreCliente + "\n");
        System.out.println("-------------------------");
        System.out.print("Primer plato : \n");
        System.out.printf("%s-> %.2f Euros\n",this.primerPlato ,this.precioPrimer);
        System.out.print("Segunda plato : \n");
        System.out.printf("%s-> %.2f Euros\n",this.segundoPlato ,this.precioSegundo);
        System.out.print("Postre : \n");
        System.out.printf("%s-> %.2f Euros\n",this.postre ,this.precioPostre);
        System.out.println("-------------------------");
        System.out.printf("Precio Comida : %.2f Euros\n",this.precioPrimer+this.precioSegundo+this.precioPostre);
        System.out.printf("IVA(%d %%) : %.2f Euros\n",IVA, this.iva());      //Para escribir el % se usa doble %%
        System.out.println("-------------------------");
        System.out.printf("Total : %.2f Euros\n", this.total());
        System.out.println("-------------------------");
    } //devuelve la factura del menú, por ejemplo:
    
}
