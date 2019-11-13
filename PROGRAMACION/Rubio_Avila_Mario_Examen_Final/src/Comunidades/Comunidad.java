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
public class Comunidad {
    //Variables
    private String idcomunidad;
    private ArrayList<Piso> pisos;
    private ArrayList<Proveedor> proveedores;

    //Getter and setter
    public String getIdcomunidad() {
        return idcomunidad;
    }

    public void setIdcomunidad(String idcomunidad) {
        this.idcomunidad = idcomunidad;
    }

    public ArrayList<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(ArrayList<Piso> pisos) {
        this.pisos = pisos;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    
    //Constructores
    public Comunidad(String idcomunidad, ArrayList<Piso> pisos, ArrayList<Proveedor> proveedores) {
        this.idcomunidad = idcomunidad;
        this.pisos = pisos;
        this.proveedores = proveedores;
    }
    
    public boolean buscaProveedorCIF(String cif){
        for(Proveedor x : this.proveedores){                     //Vamos a ver si no esta 
            if (x.getCif().equals(cif)) return true;        //Si me lo encuentro devuelvo true
        }
        return false;
    }
    
    public boolean agnadirFacturaProvedor(String cif , FacturaProveedor facturaAIngresar){
        for(Proveedor x : this.proveedores){                     //Vamos a ver si no esta 
            if (x.getCif().equals(cif)){
                boolean status = x.setFacturaprovedor(facturaAIngresar);
                if(!status) break;//Rompe y devuelve falso
                return true;        //Si me lo encuentro devuelvo true
            }
                
        }
        return false;
    }
    
    public boolean agnadirCuotaPiso(String id , FacturaCuotaPiso facturaAIngresar){
        for(Piso x : this.pisos){                     //Vamos a ver si no esta 
            if (x.getIdPiso().equals(id)){
                boolean status = x.setCuotaPiso(facturaAIngresar);
                if(!status) break;//Rompe y devuelve falso
                return true;        //Si me lo encuentro devuelvo true
            }
                
        }
        return false;
    }
    
    
    public boolean buscaPropietarioID(String id){
        for(Piso x : this.pisos){                     //Vamos a ver si no esta 
            if (x.getIdPiso().equals(id)) return true;        //Si me lo encuentro devuelvo true
        }
        return false;
    }
    
    public ArrayList<Piso> pisosMorosos(int agno, int mes){
        ArrayList<Piso> pisosMorosos = new ArrayList<Piso>();           //Declaro un array donde meter a los morosos
        for(Piso x : this.pisos){                                       //Recorro todos los pisos
            ArrayList<FacturaCuotaPiso> ver = x.getCuotaPiso();         //Guardo el array de cuotas
            if (ver == null){                                           //Si no has pagado ninguna cuota eres moroso
                pisosMorosos.add(x);                                    //Si llego aqui eres moroso
            }else{                                                      //Tiene cuotas pagadas
                boolean morosoFlag = true;                              //* Eres moroso hasta que se declare lo contrario
                for(FacturaCuotaPiso y : ver){                          //Recorro las cuotas pagadas
                    if (y.getAgno()== agno && y.getMes()== mes) morosoFlag = false;  //Encuentro la cuota pagada por lo que esto no va contigo
                }
                if (morosoFlag) pisosMorosos.add(x);                    //Si llego aqui eres moroso
            }
        }
        return pisosMorosos;
    }
    
    public void contabilidadMes(int agno, int mes){
        double totalCuotas = 0;                                         //Guardo el total de dinero de los pisos
        double totalFacturas = 0 ;                                      //Guardo el total de dinero de las factura del mes
        for(Piso x : this.pisos){ 
            ArrayList<FacturaCuotaPiso> ver = x.getCuotaPiso();         //Guardo el array de facturas
                for(FacturaCuotaPiso y : ver){                          //Recorro las cuotas pagadas
                    if (y.getAgno()== agno && y.getMes()== mes) totalCuotas = totalCuotas + y.getDinero();           //Encuentro la cuota pagada por lo que lo sumo
                }            
        }
        for(Proveedor x : this.proveedores){ 
            ArrayList<FacturaProveedor> ver = x.getFacturaprovedor();         //Guardo el array de facturas
                for(FacturaProveedor y : ver){                          //Recorro las facturas pagadas
                    if (y.getAgno()== agno && y.getMes()== mes) totalFacturas = totalFacturas + y.getDinero();       //Encuentro la factura pagada por lo que lo sumo
                }            
        }        
        
        //PROCEDO A IMPRIMIRLO
        System.out.println("CONTABILIDAD DEL MES " + mes + "DEL AÑO "+ agno);   
        System.out.println("INGRESOS : " + totalCuotas); 
        System.out.println("GASTOS   : " + totalFacturas);
        System.out.println("------------------------------");
        System.out.println("TOTAL    : " + (totalCuotas - totalFacturas));
        
    }
}
