/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author Mrubio
 */
public class cliente extends persona{
    final public String[] tipoOpcion = new String[] { 
                                            "Normal",
                                            "VIP"
                                            };
    final public int descuentoVIP = 15; //Porcentaje realiazado al cliente vip
    
    double dineroGastado;
    String tipo;
    
    
    public cliente(String dni) {
        //super(dni);
        super(dni, "Cliente", "");
        this.tipo = tipoOpcion[0];
        this.dineroGastado = 0;
    }    
    public cliente(String dni , String nombre) {
        //super(dni, nombre);
        super(dni, nombre, "");
        this.tipo = tipoOpcion[0];
        this.dineroGastado = 0;
    }    
    public cliente(String dni , String nombre, String direccion) {
        super(dni, nombre, direccion);
        this.tipo = tipoOpcion[0];
        this.dineroGastado = 0;
    }
    public cliente(String dni , String nombre, String direccion, String tipo) {
        super(dni, nombre, direccion);
        this.tipo = tipo;
    }
    public cliente(String dni , String nombre, String direccion, String tipo, double dineroGastado) {
        super(dni, nombre, direccion);
        this.tipo = tipo;
        this.dineroGastado = dineroGastado;
    }
    public cliente(cliente cliente){
        super(cliente.getNombre(), cliente.getDNI(), cliente.getDireccion());
        this.tipo = cliente.tipo;
        this.dineroGastado = cliente.dineroGastado;
    }
    
    public void setTipo(String tipo){this.tipo = tipo;}
    public String getTipo(){return this.tipo;}
    
    public void setDineroGastado(int dineroGastado){this.dineroGastado = dineroGastado;}
    public double getDineroGastado(){return this.dineroGastado;}
    
    public void aumentarGasto(double cantidad){
        this.dineroGastado = this.dineroGastado + cantidad;
    }
    public void disminuirGasto(double cantidad){
        this.dineroGastado = this.dineroGastado - cantidad;
    }
    
    @Override
    public void mostrarPersona(){
        super.mostrarPersona(); //Llamamos a la funcion padre
        System.out.println("          Tipo : " + this.tipo);
        System.out.println("Dinero Gastado : " + this.dineroGastado + " €");
        System.out.println("**************** ");
    }
    
}
