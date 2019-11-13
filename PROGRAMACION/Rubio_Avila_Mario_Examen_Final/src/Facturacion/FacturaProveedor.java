/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

/**
 *
 * @author examen
 */
public class FacturaProveedor extends Factura{

    private int dia;
    private String concepto;
    
    public FacturaProveedor(String idFactura, int agno, int mes, int dia, double dinero, String conceptoFactura) {
        super(idFactura, agno, mes, dinero);
        this.dia = dia;
        this.concepto = conceptoFactura;
    }

    @Override
    public void mostrarFactura() {
        System.out.println("ID. factura : " + this.idFactura + " Concepto : " + this.concepto + " Dia : " + this.dia + "/"+ this.mes + "/"+ this.agno + " importe : " + this.dinero);
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    //Los otros getter y setter ya los tiene de la clase extendida
}
