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
public abstract class Factura {
    protected String idFactura;
    protected int agno;
    protected int mes;
    protected double dinero;

    public Factura(String idFactura, int agno, int mes, double dinero) {
        this.idFactura = idFactura;
        this.agno = agno;
        this.mes = mes;
        this.dinero = dinero;
    }

    /**
     * @return the idFactura
     */
    public String getIdFactura() {
        return idFactura;
    }

    /**
     * @param idFactura the idFactura to set
     */
    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    /**
     * @return the agno
     */
    public int getAgno() {
        return agno;
    }

    /**
     * @param agno the agno to set
     */
    public void setAgno(int agno) {
        this.agno = agno;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the dinero
     */
    public double getDinero() {
        return dinero;
    }

    /**
     * @param dinero the dinero to set
     */
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    

    public abstract void mostrarFactura();//Ya lo implementara la clase en cuestion
}
