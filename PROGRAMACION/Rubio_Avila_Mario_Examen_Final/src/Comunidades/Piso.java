/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comunidades;

import Facturacion.FacturaCuotaPiso;
import java.util.ArrayList;

/**
 *
 * @author examen
 */
public class Piso {
    
   //Variables
   private String idPiso;
   private String propietario;
   private ArrayList<FacturaCuotaPiso> cuotaPiso;    //Creamos un arrayList con las facturas
   

   //Constructor
    public Piso(String idPiso, String propietario) {
        this.idPiso = idPiso;
        this.propietario = propietario;
        this.cuotaPiso = new ArrayList<FacturaCuotaPiso>();
    }

    //Getter and setter
    public String getIdPiso() {
        return idPiso;
    }

    public void setIdPiso(String idPiso) {
        this.idPiso = idPiso;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public ArrayList getCuotaPiso() {
        return cuotaPiso;
    }

    public void setCuotaPiso(ArrayList cuotaPiso) {
        this.cuotaPiso = cuotaPiso;
    }
    
    public boolean setCuotaPiso(FacturaCuotaPiso cuotaPisoNueva) {
        for(FacturaCuotaPiso x : this.cuotaPiso){                     //Vamos a ver si no esta 
            if (x.getIdFactura().equals(cuotaPisoNueva.getIdFactura())){
                return false;        //Si me lo encuentro devuelvo true y lo añado
            }
        }
        this.cuotaPiso.add(cuotaPisoNueva);
        return true;
    }    
    
    //Metodos publicos
   @Override
    public String toString(){
        return ("Datos del piso : Id. piso = "+ this.idPiso + " propietario = " + this.propietario);
    }
    
    public void mostrarFacturaPiso(){
        System.out.println("CUOTAS PAGAGADA EN EL PISO CON ID "+ this.idPiso);
        for(FacturaCuotaPiso x : this.cuotaPiso){                     //Vamos a ver si no esta 
            //System.out.println("/t/t Id. Factura : " + x.getIdFactura() + " año : " + x.getAgno() + " mes : " + x.getMes() + " importe : " + x.getDinero() ) ;
            System.out.print("\t\t");
            x.mostrarFactura();
        }
        
    }
   
}
