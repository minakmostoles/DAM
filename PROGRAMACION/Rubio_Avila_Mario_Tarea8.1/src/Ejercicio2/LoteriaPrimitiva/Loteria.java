/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.LoteriaPrimitiva;

import Utilidades.ColorConsole;

/**
 *
 * @author Mario-PC
 */
public class Loteria {
    private int boletos[][] = new int[8][6];                //Guarda los numeros de los boletos
    private boolean boletosGanados[][] = new boolean[8][6]; //Es una array identica a la de boletos pero guarda si la posicion es ganadora
    private int resultadoGanador[] = new int[6];            //Es la matriz de numero ganadores
    
    private int numMax = 49; // este mas 1 (numMax+1) Nunca puede ser menor a 48 6x8

    public Loteria() {
        generateBoletosLineaDiferente();
        generateResultadoGanador();
        //evaluateWinner();
        
        mostrarBoletos();
        mostrarResultadoGanador();
        //mostrarWinner();
        evaluateLineWinner();
    }
    
    /**
     * Genera los boletos que juegan y evita que se generen repetidos todos
     */
    private void generateBoletosTodosDiferentes(){
        if (numMax>=49){//Si hay suficente numero diferentes para el proceso lo haces.
            //CREACION DE UN NUMERO NO REPETIDO
            int numerosBoletos[] = new int[48];              //Guarda los numero insertados en la tabla
            int auxNumero = 0;
            int puntero = 0;
            for(int i = 0; i < this.boletos.length; i++){
                for(int x = 0; x < this.boletos[i].length; x++){
                    if (puntero==0) {
                        auxNumero = (int)Math.floor(Math.random()*this.numMax+1);
                    }else {
                        boolean notNew=false;
                        do{
                            notNew=false;
                            auxNumero = (int)Math.floor(Math.random()*this.numMax+1);
                            for(int y = 0; y < numerosBoletos.length; y++){
                                if(numerosBoletos[y] == auxNumero) notNew = true;
                            }
                            //System.out.println("Numero nuevo : " + auxNumero);
                        }while (notNew);
                    }

                    //ASIGNAMOS EL NUMERO
                    numerosBoletos[puntero] = auxNumero;
                    this.boletos[i][x] = auxNumero;
                    puntero=puntero+1;
                }
            }        
        }else{
                System.out.println("Error no hay numero suficientes para esta posibilidad ajuste el numero maximo a 49");
        }
    }

    /**
     * Genera los boletos que juegan y evita que se generen repetidos en la misma linea
     */
    private void generateBoletosLineaDiferente(){
        //CREACION DE UN NUMERO NO REPETIDO
        int numerosBoletos[] = new int[6];              //Guarda los numero insertados en la tabla
        int auxNumero = 0;
        for(int i = 0; i < this.boletos.length; i++){
            for(int x = 0; x < this.boletos[i].length; x++){
                if (x==0) {
                    auxNumero = (int)Math.floor(Math.random()*this.numMax+1);
                }else {
                    boolean notNew=false;
                    do{
                        notNew=false;
                        auxNumero = (int)Math.floor(Math.random()*this.numMax+1);
                        for(int y = 0; y < numerosBoletos.length; y++){
                            if(numerosBoletos[y] == auxNumero) notNew = true;
                        }
                        //System.out.println("Numero nuevo : " + auxNumero);
                    }while (notNew);
                    numerosBoletos[x] = auxNumero;
                }
                
                //ASIGNAMOS EL NUMERO
                this.boletos[i][x] = auxNumero;
            }
        }
    }
    
    /**
     * Muestra los boletos que juegan
     */
    private void mostrarBoletos(){             
        System.out.print("------------BOLETOS------------\n| ");
        for(int i = 0; i < this.boletos.length; i++){
            for(int x = 0; x < this.boletos[i].length; x++){
                if (boletos[i][x] <10) System.out.print("0" + boletos[i][x] +" | ");
                else System.out.print(boletos[i][x] +" | ");
            }
            
            if (i < (this.boletos.length-1)) System.out.print("\n-------------------------------\n| ");
            else                             System.out.print("\n-------------------------------\n");
        }        
    }    
    
    /**
     * Muestra el mapa de elementos ganadores es usado para ver graficamente los ganadores
     * Usado mayormente para debuger
     */
    private void mostrarWinner(){  
        System.out.print("--------------------BOLETOS----------------------\n| ");
        for(int i = 0; i < this.boletosGanados.length; i++){
            for(int x = 0; x < this.boletosGanados[i].length; x++){
                if (boletosGanados[i][x]) System.out.print(ColorConsole.GREEN + " " + boletosGanados[i][x]+ ColorConsole.RESET + " | ");
                else System.out.print(ColorConsole.RED +  boletosGanados[i][x] + ColorConsole.RESET + " | ");
            }
            
            if (i < (this.boletosGanados.length-1)) System.out.print("\n-------------------------------------------------\n| ");
            else                             System.out.print("\n-------------------------------------------------\n");
        }        
    }    
    
    /**
     * Genera los numero del convinacion ganadora
     */
    private void generateResultadoGanador(){
        //CREACION DE UN NUMERO NO REPETIDO
        int numerosGanador[] = new int[6];              //Guarda los numero insertados en la tabla
        int auxNumero = 0;
        for(int x = 0; x < this.resultadoGanador.length; x++){
            if (x==0) {
                auxNumero = (int)Math.floor(Math.random()*this.numMax+1);
            }else {
                boolean notNew=false;
                do{
                    notNew=false;
                    auxNumero = (int)Math.floor(Math.random()*this.numMax+1);
                    for(int y = 0; y < numerosGanador.length; y++){
                        if(numerosGanador[y] == auxNumero) notNew = true;
                    }
                    //System.out.println("Numero nuevo : "+auxNumero);
                }while (notNew);
                
            }
            //ASIGNAMOS EL NUMERO
            numerosGanador[x] = auxNumero;
            this.resultadoGanador[x] = auxNumero;
        }        
    }
    
    /**
     * Muestra la convinacion ganadora
     */
    private void mostrarResultadoGanador(){     
        System.out.print("-------RESULTADO GANADOR-------\n| ");
        for(int i = 0; i < this.resultadoGanador.length; i++){
            if (this.resultadoGanador[i]<10) System.out.print("0" + this.resultadoGanador[i] +" | ");
            else System.out.print(this.resultadoGanador[i] +" | ");
        }        
        System.out.print("\n-------------------------------\n");
    }
    
    /**
     * Evalua si el numero esta en la lista de elementos ganadores
     * @param numero
     * @return 
     */
    private boolean evaluateNumero(int numero){
        for(int x = 0; x < this.resultadoGanador.length; x++){
            //System.out.println("El numero buscado es "+ numero + " y el resultado "+ this.resultadoGanador[x]);
            if (this.resultadoGanador[x] == numero) return true;
        }                
        return false;
    }
    
    /**
     * Se encarga de hacer el mapa de elementos ganadores es usado para ver graficamente los ganadores
     * Usado mayormente para debuger
     */
    private void evaluateWinner(){
        for(int i = 0; i < this.boletos.length; i++){
            for(int x = 0; x < this.boletos[i].length; x++){
                if (evaluateNumero(this.boletos[i][x])) this.boletosGanados[i][x] = true;
                else                                    this.boletosGanados[i][x] = false;
            }
        }        
    }
    
    private void evaluateLineWinner(){
        for(int i = 0; i < this.boletos.length; i++){
            int numerosCorrectoLinea = 0;
            for(int x = 0; x < this.boletos[i].length; x++){
                if (evaluateNumero(this.boletos[i][x])) numerosCorrectoLinea++;
            }
            if (numerosCorrectoLinea == 0) System.out.println(ColorConsole.RED + "El boleto "+ (i+1) +" no has sido agraciado."+ ColorConsole.RESET);
            else if (numerosCorrectoLinea > 0 && numerosCorrectoLinea <6) System.out.println(ColorConsole.YELLOW + "El boleto "+ (i+1) +" tiene "+ numerosCorrectoLinea +" correctos pero no es premiado."+ ColorConsole.RESET);
            else if (numerosCorrectoLinea == 6) System.out.println(ColorConsole.GREEN + "Felidades ganastes la loteria con el boleto"+ (i+1) +"."+ ColorConsole.RESET);
        }    
    }

}

