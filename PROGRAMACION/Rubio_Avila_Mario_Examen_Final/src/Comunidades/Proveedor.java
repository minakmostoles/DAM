/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comunidades;

import Facturacion.FacturaCuotaPiso;
import Facturacion.FacturaProveedor;
import java.util.ArrayList;

/**
 *
 * @author examen
 */
public class Proveedor {
    
    //Variables
    private String cif;
    private String nombre;
    private String direccion;
    private ArrayList<FacturaProveedor> facturaprovedor;

    //Getter and setter
    /**
     * @return the cif
     */
    public String getCif() {
        return cif;
    }

    /**
     * @param cif the cif to set
     */
    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the facturaprovedor
     */
    public ArrayList<FacturaProveedor> getFacturaprovedor() {
        return facturaprovedor;
    }
    
    
    /**
     * @param facturaprovedor the facturaprovedor to set
     */
    public void setFacturaprovedor(ArrayList<FacturaProveedor> facturaprovedor) {
        this.facturaprovedor = facturaprovedor;
    }

    public boolean setFacturaprovedor(FacturaProveedor facturaProvedorInsertar) {
        for(FacturaProveedor x : this.facturaprovedor){                     //Vamos a ver si no esta 
            if (x.getIdFactura().equals(facturaProvedorInsertar.getIdFactura())){
                return false;        //Si me lo encuentro devuelvo true
            }
        }
        this.facturaprovedor.add(facturaProvedorInsertar);
        return true;
    }    
    
    //Constructor
    public Proveedor(String cif, String nombre, String direccion) {
        this.cif = cif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.facturaprovedor = new ArrayList<FacturaProveedor>();
    }
        
      
    //Metodos publicos
    @Override
    public String toString(){
        return ("Datos del proveedor : CIF = "+ this.cif + " Nombre = " + this.nombre + " Direccion = " + this.direccion);
    }
    
    public void mostrarFacturaPiso(){
        System.out.println("CUOTAS PAGAGADA EN EL PISO CON ID "+ this.cif);
        for(FacturaProveedor x : this.facturaprovedor){                     //Vamos a ver si no esta 
            //System.out.println("/t/t Id. Factura : " + x.getIdFactura() + " año : " + x.getAgno() + " mes : " + x.getMes() + " importe : " + x.getDinero() ) ;
            System.out.print("/t/t");
            x.mostrarFactura();
        }
        
    }    
        
}
