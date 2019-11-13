/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_examenfinal;

import Comunidades.Comunidad;
import Comunidades.Piso;
import Comunidades.Proveedor;
import Facturacion.FacturaCuotaPiso;
import Facturacion.FacturaProveedor;
import Utilidades.ColorConsole;
import Utilidades.ToolsAndMenu;
import static Utilidades.ToolsAndMenu.getDoubleFromKB;
import static Utilidades.ToolsAndMenu.getIntFromKB;
import static Utilidades.ToolsAndMenu.getStringFromKB;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author examen
 */
public class Rubio_Avila_Mario_ExamenFinal {
    
    public static ArrayList<Comunidad> Comunidades = new ArrayList<Comunidad>();               //Lista de comunidades (PARA EL FUTURO)
    public static Comunidad comunidadSeleccionada;                                      //Para el futuro
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modoDemo();
        selectMainPrincipal();
    }
    
    static private void selectMainPrincipal(){
        ToolsAndMenu.title(Textos_MainMenu.TITLEMENU);
        while (true){
        int op = ToolsAndMenu.menu(Textos_MainMenu.MENUOPCIONS);
            //Actuamos sobre lo solicitado
            switch (op){
                case 0://SALIDA APP
                    System.out.println("Esperamos volver a verle pronto");
                    ToolsAndMenu.sleepThread(1);//Pausa por tiempo
                    System.exit(0);//Provocamos la salida del programa
                    break;
                case 1://Agnadir cliente
                    agnadirFaturaProvedor();
                    ToolsAndMenu.pausa();
                    break;
                case 2:                
                    agnadirCuotaPiso();
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    printContabilidadMes();
                    ToolsAndMenu.pausa();
                    break;
                case 4:  
                    getMoroso();
                    ToolsAndMenu.pausa();
                    break;   
                }
            }
        }
    
    static private void agnadirFaturaProvedor(){
        String auxCIF = getStringFromKB(3,"el CIF del provedor");//Capturo el cif
        if (!auxCIF.equals("")){
            if (comunidadSeleccionada.buscaProveedorCIF(auxCIF)){
                String auxidFactura = getStringFromKB(2,"el id de la factura");
                String auxConcepto = getStringFromKB(2,"el concepto de la factura");
                int auxDia = getIntFromKB(2,"el dia de la factura");
                int auxMes = getIntFromKB(2,"el mes de la factura");
                int auxAgnos = getIntFromKB(2,"el año de la factura");
                double auxDinero = getDoubleFromKB(2,"el importe de la factura");
                comunidadSeleccionada.agnadirFacturaProvedor(auxCIF ,new FacturaProveedor(auxidFactura,auxAgnos,auxMes,auxDia,auxDinero,auxConcepto));
            }else{
                System.out.println(ColorConsole.RED +"ERROR : El CIF del proveedor no se encuentra" + ColorConsole.RESET);
            }
            //comunidadSeleccionada.setProveedores(proveedores);
        }else{
            System.out.println(ColorConsole.RED +"ERROR : Se necesita la informacion del CIF" + ColorConsole.RESET);
        }
    }
    
    static private void agnadirCuotaPiso(){
        String auxID = getStringFromKB(3,"el ID del piso");//Capturo el cif
        if (!auxID.equals("")){
            if (comunidadSeleccionada.buscaPropietarioID(auxID)){
                String auxidFactura = getStringFromKB(2,"el id de la factura");
                int auxMes = getIntFromKB(2,"el mes de la factura");
                int auxAgnos = getIntFromKB(2,"el año de la factura");
                double auxDinero = getDoubleFromKB(2,"el importe de la factura");
                comunidadSeleccionada.agnadirCuotaPiso(auxID ,new FacturaCuotaPiso(auxidFactura,auxAgnos,auxMes,auxDinero));
            }else{
                System.out.println(ColorConsole.RED +"ERROR : El CIF del proveedor no se encuentra" + ColorConsole.RESET);
            }
            //comunidadSeleccionada.setProveedores(proveedores);
        }else{
            System.out.println(ColorConsole.RED +"ERROR : Se necesita la informacion del CIF" + ColorConsole.RESET);
        }
    }
    
    static private void getMoroso(){
        int auxMes = getIntFromKB(2,"el mes para buscar morosos");
        int auxAgnos = getIntFromKB(2,"el año para buscar morosos"); 
        
        ArrayList<Piso> morosos = comunidadSeleccionada.pisosMorosos(auxAgnos,auxMes);
        if (!(morosos == null)){
                System.out.println("PISOS QUE NO HAN PAGADO LA CUOTA DEL MES " + auxMes + " DEL AÑO " + auxAgnos);
                for(Piso x : morosos){
                    System.out.println(x.toString());
            }   
        }
        
    }
    
    static private void printContabilidadMes(){
        int auxMes = getIntFromKB(2,"el mes para buscar morosos");
        int auxAgnos = getIntFromKB(2,"el año para buscar morosos"); 
        if (auxMes != 0 && auxAgnos!= 0){
        comunidadSeleccionada.contabilidadMes(auxAgnos,auxMes);
        }else{
            System.out.println(ColorConsole.RED +"ERROR : Inserte fechas validas." + ColorConsole.RESET);
        }
     
    }
        
    //Test programa
    static private void modoDemo(){
        System.out.println("Modo Demo : Se crea una comunidad con 3 Vecinos , 3 provedores , una factura de cada tipo a cada propietario y de cada provedores");
        
        //Creamos pisos
        ArrayList<Piso> Pisos = new ArrayList<Piso>();               //Lista de pisos
        Piso p1 = new Piso("1A","Rocio De La Fuente");
        Piso p2 = new Piso("2A","Mario Rubio");
        Piso p3 = new Piso("1B","Beatriz Mendez");
        Pisos.add(p1);
        Pisos.add(p2);
        Pisos.add(p3);
        
        
        //Creamos provedores
        ArrayList<Proveedor> Proveedores = new ArrayList<Proveedor>();               //Lista de proveedores
        Proveedor prov1 = new Proveedor("00A","Endesa     ","C/Las acacias n8 Toledo");
        Proveedor prov2 = new Proveedor("00B","Gas Natural","C/Las acacias n9 Toledo");
        Proveedor prov3 = new Proveedor("00C","Movistar   ","C/Las acacias n1 Toledo");
        Proveedores.add(prov1);
        Proveedores.add(prov2);
        Proveedores.add(prov3);
        

        
        Comunidades.add (new Comunidad("C01",Pisos,Proveedores));
        comunidadSeleccionada = Comunidades.get(0);    
        
        //Agnadimos unas cuantas facturas propias para pruebas
        FacturaCuotaPiso f1 = new FacturaCuotaPiso("01",2019,5,10);
        FacturaCuotaPiso f2 = new FacturaCuotaPiso("01",2019,6,15);
        FacturaCuotaPiso f3 = new FacturaCuotaPiso("01",2019,7,20);
        comunidadSeleccionada.agnadirCuotaPiso ("1A", f1);
        comunidadSeleccionada.agnadirCuotaPiso ("2A", f2);
        comunidadSeleccionada.agnadirCuotaPiso ("3A", f2);        
        
        //Provedores
        FacturaProveedor fprov1 = new FacturaProveedor("01", 2019, 5, 5, 10, "Factura ejemplo1");
        FacturaProveedor fprov2 = new FacturaProveedor("01", 2019, 6, 6, 15, "Factura ejemplo1");
        FacturaProveedor fprov3 = new FacturaProveedor("01", 2019, 7, 7, 20, "Factura ejemplo1");
        
        comunidadSeleccionada.agnadirFacturaProvedor("00A",fprov1);
        comunidadSeleccionada.agnadirFacturaProvedor("00B",fprov2);
        comunidadSeleccionada.agnadirFacturaProvedor("00C",fprov3);
       
    }
    
    
}//FIN CLASE
