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
public class cuenta {
    //Variables
    private String titular ="";
    private double saldoCuenta=0.0;
    private double saldoTarjeta = 0.0;
    //Metodos getters y setters
    public String getTitular( ){
        return this.titular;
    }                          //Devuelve el nombre
    public void setTitular(String titular){
        this.titular = titular;
    }               //Asignamos nombre
    public double getSaldoCuenta( ){
        return this.saldoCuenta;
    }                      //Devuelve el saldo de la cuenta
    public void setSaldoCuenta(double SaldoCuenta){
        this.saldoCuenta = SaldoCuenta;
    }       //Establece el saldo de la cuenta
    public double getSaldoTarjeta( ){
        return this.saldoTarjeta;
    }                     //Devuelve el saldo de la tarjeta
    public void setSaldoTarjeta(double saldoTarjeta){
        this.saldoTarjeta = saldoTarjeta;}     //Establece el saldo de la tarjeta
    //Metodos de la clase
    public void ingresarSaldoCuenta(double cantidad){
        this.saldoCuenta = this.saldoCuenta+cantidad;
    }     //Suma al saldo de la cuenta, la cantidad dada.
    public void sacarSaldoCuenta(double cantidad){
        this.saldoCuenta = this.saldoCuenta-cantidad;
    }        //Resta del saldo de la cuenta, la cantidad dada.
    public void transferirSaldoATarjeta(double cantidad){
        this.saldoCuenta = this.saldoCuenta-cantidad;
        this.saldoTarjeta = this.saldoTarjeta+cantidad;
    } //transfiere dinero desde la cuenta a la tarjeta
    public void sacarSaldoTarjeta(double cantidad){
        this.saldoTarjeta = this.saldoTarjeta-cantidad;
    }       //resta del saldo de la tarjeta, la cantidad dada
        
    public void mostrardatosCuenta(){
        System.out.print("-------------------------\n");
        System.out.print(this.titular + "\n");
        System.out.print("-------------------------\n");
        System.out.printf("Saldo Cuenta : %.2f \n",this.saldoCuenta);
        System.out.printf("Saldo Tarjeta: %.2f \n",this.saldoTarjeta);
        System.out.print("-------------------------\n");
        System.out.printf("Total        : %.2f \n",this.saldoCuenta + this.saldoTarjeta);
        System.out.print("-------------------------\n");
    } //Muestra todos los datos de la cuenta
}
