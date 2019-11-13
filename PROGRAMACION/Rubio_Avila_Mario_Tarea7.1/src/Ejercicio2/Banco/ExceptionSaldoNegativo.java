/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.Banco;

/**
 *
 * @author Mario-PC
 * @version 190212.0_1
 * Lamentandolo mucho tengo que salirme del guion para crear mi propia excepcion para evitar que se puedan hacer cantidades negativas
 * hay otras opciones pero no las encuentro de calidad para que quede un codigo bonito y funcional
 */
public class ExceptionSaldoNegativo extends RuntimeException {

    public ExceptionSaldoNegativo() {
        
    }

    public ExceptionSaldoNegativo(String message) {
        super("Lamentandolo mucho el saldo es insuficiente " + message + ".");
    }
    
}
