/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturas;

import Personas.Cliente;

/**
 *
 * @author cliente
 */
public class Factura {
    //Variables
    private String idFactura;
    private Cliente obCliente;
    private LineaFactura linea1;
    private LineaFactura linea2;
    private LineaFactura linea3;
    private LineaFactura linea4;

    //Constantes para los porcentajes Deberian estar en una clase estatica y aqui guardar una copia de esta (Por ahora se queda aqui)
    final double IVA = 21;// Constante del IVA
    final double VIP = 10;// Constante del Descuento Vip
    
    //Variables internas
    private double valorSinIva;
    private double valorIva;
    private double valorDescuentoVip;
    private double valorFinal;    
    
    //Constructores
    public Factura(String idFactura, Cliente obCliente, LineaFactura linea1, LineaFactura linea2, LineaFactura linea3, LineaFactura linea4) {
        this.idFactura = idFactura;
        this.obCliente = obCliente;
        this.linea1 = linea1;
        this.linea2 = linea2;
        this.linea3 = linea3;
        this.linea4 = linea4;
    }

    //Setter y getter
    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public Cliente getObCliente() {
        return obCliente;
    }

    public void setObCliente(Cliente obCliente) {
        this.obCliente = obCliente;
    }

    public LineaFactura getLinea1() {
        return linea1;
    }

    public void setLinea1(LineaFactura linea1) {
        this.linea1 = linea1;
    }

    public LineaFactura getLinea2() {
        return linea2;
    }

    public void setLinea2(LineaFactura linea2) {
        this.linea2 = linea2;
    }

    public LineaFactura getLinea3() {
        return linea3;
    }

    public void setLinea3(LineaFactura linea3) {
        this.linea3 = linea3;
    }

    public LineaFactura getLinea4() {
        return linea4;
    }

    public void setLinea4(LineaFactura linea4) {
        this.linea4 = linea4;
    }
    //Metodos
    /**
     * Calcula la factura sin iva y la devuelve
     * @return 
     */
    public double totalFacturaSinIVA(){
        //double totalFacSinIVA = linea1.getTotalLinea()+ linea2.getTotalLinea()+ linea3.getTotalLinea() + linea4.getTotalLinea();
        return linea1.getTotalLinea()+ linea2.getTotalLinea()+ linea3.getTotalLinea() + linea4.getTotalLinea();
    }
    /**
     * Devuelve el iva
     * @return 
     */
    private double calulaPorcentaje(double descuento, double cifra){
        double porcentaje = cifra*((descuento)/100);
        return porcentaje;
    }

    /**
     * Actualiza los valores de la factura
     */
    private void updateCifras(){
        this.valorSinIva = totalFacturaSinIVA();
        this.valorIva = calulaPorcentaje(this.IVA, this.valorSinIva);
        if(this.obCliente.getTipo().equals("Vip"))
            this.valorDescuentoVip = calulaPorcentaje(this.VIP, (this.valorSinIva + this.valorIva));
        else this.valorDescuentoVip = 0;
        this.valorFinal = this.valorSinIva + this.valorIva - valorDescuentoVip;          
    }    
    
    /**
     * Se encarga de mostrar la factura en terminal
     */
    public void mostrarFactura(){
        updateCifras();//Llamo a una funcion que va actualizar todos los valores de la factura
        System.out.println("FACTURA : " + this.idFactura);
        this.obCliente.mostrarClienteFactura();//Mostamos lo datos del cliente
        System.out.println("CODIGO   NOMBRE \t\t NºUND  PRECIO  IMPORTE");
        this.linea1.mostrarLinea();
        this.linea2.mostrarLinea();
        this.linea3.mostrarLinea();
        this.linea4.mostrarLinea();
        System.out.println("\n\t\t\t\t  TOTAL SIN IVA : "+ this.valorSinIva);
        System.out.println("\t\t\t\t      IVA " + this.IVA +"% : "+ this.valorIva);
        if(this.obCliente.getTipo().equals("Vip")){
            System.out.println("  Por ser cliente VIP te descontamos " + this.VIP +"%       -"+ this.valorDescuentoVip);
        }
        System.out.println("\t\t\t\t******************");
        System.out.println("\t\t\t\t\t\t  TOTAL  ");
        System.out.println("\t\t\t\t\t\t  "+ this.valorFinal);
        System.out.println("\t\t\t\t******************");
    }
    
}
