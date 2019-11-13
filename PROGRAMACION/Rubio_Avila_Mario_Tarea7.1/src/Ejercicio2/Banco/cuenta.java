/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.Banco;

/**
 *
 * @author Mario-PC
 */
public class cuenta {
    //Variables
    private String titular ="";
    private double saldoCuenta=0.0;
    private double saldoTarjeta = 0.0;

    public cuenta() {
    }

    public cuenta(String titular, double saldoCuenta, double saldoTarjeta) {
        this.titular = titular;
        this.saldoCuenta = saldoCuenta;
        this.saldoTarjeta = saldoTarjeta;
    }
    
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
    
    //Manipulaciones con Saldo Cuenta
    public void ingresarSaldoCuenta(double cantidad){
        this.saldoCuenta = this.saldoCuenta+cantidad;
    }     //Suma al saldo de la cuenta, la cantidad dada.
    
    public void sacarSaldoCuenta(double cantidad){
        if (this.saldoCuenta-cantidad >= 0) this.saldoCuenta = this.saldoCuenta-cantidad;   //Si hay saldo saca
        else throw new ExceptionSaldoNegativo("cuenta");                                    //Si es negativo salta excepcion propia                             
    }        //Resta del saldo de la cuenta, la cantidad dada. 
    
    //Manipulaciones con Saldo Tarjeta
    public void ingresarSaldoTarjeta(double cantidad){
        this.saldoTarjeta = this.saldoTarjeta+cantidad;
    }     //Suma al saldo de la cuenta, la cantidad dada.
    
    public void sacarSaldoTarjeta(double cantidad){
        if (this.saldoTarjeta-cantidad >= 0) this.saldoTarjeta = this.saldoTarjeta-cantidad;
        else throw new ExceptionSaldoNegativo("tarjeta");       
    }       //resta del saldo de la tarjeta, la cantidad dada
    
    
    public void transferirSaldoATarjeta(double cantidad){
        sacarSaldoCuenta(cantidad);
        ingresarSaldoTarjeta (cantidad);
    } //transfiere dinero desde la cuenta a la tarjeta

        
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
