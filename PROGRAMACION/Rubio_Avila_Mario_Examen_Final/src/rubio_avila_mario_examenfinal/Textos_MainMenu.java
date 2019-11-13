/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubio_avila_mario_examenfinal;

/**
 *
 * Dispone de los array de IMPORTANCIA para la confeccion del menu principal
 * Anterior mente se disponia en la clase ToolsAndMenu pero es mejor separado 
 * ya que esto cambia en cada proyecto y ToolsAndMenu tiene menos varianza.
 * 
 * @author Mario-PC
 */
public class Textos_MainMenu {
    final static public String TITLENAME = "GESTION COMUNIDAD DE VECINOS";
    final static public String AUTHORNAME = "Rubio Avila Mario";
    
    final static public String[] TITLEMENU = new String[] {"MENU PRINCIPAL"};
    static final String[] MENUOPCIONS = new String[] {
                                            "1.- Añadir un factura de un proveedor de la comunidad:",
                                            "2.- Añadir cuota de piso de la comunidad:",
                                            "3.- Mostrar Ingreso/gastos de un año-mes (NO IMPLEMENTADO)",
                                            "4.- Mostrar pisos que no han pagado la cuota de un año-mes",                                         
                                            "0.- Salir"};
}
