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
public class FacturaCuotaPiso extends Factura{

    public FacturaCuotaPiso(String idFactura, int agno, int mes, double dinero) {
        super(idFactura, agno, mes, dinero);
    }

    
    @Override
    public void mostrarFactura() {
        System.out.println("ID. factura : " + this.idFactura + " año : " + this.agno + " mes : " + this.mes +" importe : " + this.dinero);
    }
    //Los otros getter y setter ya los tiene de la clase extendida
}
