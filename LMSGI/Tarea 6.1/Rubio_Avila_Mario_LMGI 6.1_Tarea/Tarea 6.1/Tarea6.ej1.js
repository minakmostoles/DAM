/*Ejercicio1:Se ha realizado un censo provincial y se desea procesar la información obtenida en
dicho censo. De cada una de las personas censadas se debe obtener la siguiente información:
número de documento de identidad, edad y sexo ('femenino' o 'masculino'). Deber ser valido para
masculino las siguientes entradas 'masculino','m' y 'varón' y para ‘mujer 'femenino', 'f' y 'mujer'
Se pide confeccionar un programa que lea los datos de cada persona censada (para finalizar
ingresar el valor cero en el número de documento) e informar:
a) Cantidad total de personas censadas.
b) Cantidad de varones.
c) Cantidad de mujeres.
d) Cantidad de varones cuya edad varía entre 16 y 65 años.
e) Cantidad de mujeres cuya edad varía entre 16 y 65 años.
NOTAS: deberás aplicar un mínimo estilo como se muestra en la captura que adjunto y en el script
hacer uso al menos de los operadores "DoWhile","if" y las variables que necesites.*/

//Constante

const edadVaronMin = 16;
const edadVaronMax = 65;
const edadMujerMin = 16;
const edadMujerMax = 65;

//Variables
var documento;
var edad;
var numeroHombres=0;
var numeroMujeres=0;
var numeroHombresEnIntervalo=0;
var numeroMujeresEnIntervalo=0;

do{                                                                     //Haz lo siguiente
    documento=prompt('Ingrese Nº de documento: ','');                   //Solicitamos un numero
    documento=parseInt(documento);                                      //Convertimos el documento en entero
        if (documento>0){                                               //Si el documento es mayor a 0
            edad=prompt('Ingrese la edad:','');                         //Ingrese la edad
            edad=parseInt(edad);                                        //Convierte la edad en String
            sexo=prompt('Ingrese el sexo (masculino/femenino):','');    //Eres masculino o femenino
            if (sexo=='masculino' || sexo=='m' || sexo=='varon'){                        //Permito insertar masculino o m 
                numeroHombres++;                                        //Sumo para el calculo de numero de varones totales
                if (edad>=edadVaronMin && edad<=edadVaronMax){          //Si esta en el intervalo de las constantes 
                    numeroHombresEnIntervalo++;                         //Lo sumo como que esta en el intervalo
                }
            } //Fin Varones
            else if(sexo=='femenino' || sexo=='f' || sexo=='mujer'){                     //Permito insertar femenino o f
                numeroMujeres++;                                        //Sumo para el calculo de numero de hembras totales
                if (edad>=edadMujerMin && edad<=edadMujerMax){          //Si esta en el intervalo de las constantes 
                    numeroMujeresEnIntervalo++;                         //Incremento mujeres en intervalo
                }
            } //Fin femenino
        }
}while(documento!=0);//Fin insertar documentos a la encuesta

//CENSO
document.write('<h1 align="center">'+'CENSO'+'</h1><br>');
document.write('Total de personas censadas: '+(numeroHombres+numeroMujeres)+'<br>');
document.write('Cantidad de varones: '+numeroHombres+'<br>');
document.write('Cantidad de mujeres: '+numeroMujeres+'<br>');    
document.write('Cantidad de varones entre 16 y 65 años:'+numeroHombresEnIntervalo+'<br>');   
document.write('Cantidad de mujeres entre 16 y 65 años: '+numeroMujeresEnIntervalo+'<br>');