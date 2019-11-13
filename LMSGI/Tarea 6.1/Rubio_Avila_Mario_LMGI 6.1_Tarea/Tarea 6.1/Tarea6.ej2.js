/*Ejercicio2: El programa debe pedir al usuario tres número reales por pantalla y nos dice cual es el
mayor de ellos. Debe comprobar que los valores introducidos son números validos, y en caso
contrario dar un mensaje de error.*/

//Constantes
const TOTAL_NUMEROS_EVALUAR = 3;                                              //Numero de elementos a insertar
const TEXTO_ERROR = "El numero insertado no es correcto inserte otro valido ";//Mensaje a mostrar con el error

//Variables globales
var numeros = [];
var numeroMayor;

//Programa
for (x=0; x<TOTAL_NUMEROS_EVALUAR; x++){
    do{
        let nuevoNumero = documento=prompt('Ingrese el '+ (x+1) +'º a evaluar: ',''); 
		//Imprimo en consola las verificaciones.
		console.log('	 Prueba esNatural : '+ nuevoNumero+ ' - ' + esNatural	 (nuevoNumero));
		console.log('    Prueba esDecimal : '+ nuevoNumero+ ' - ' + esDecimal	 (nuevoNumero));
		console.log('Prueba esDecimalPuro : '+ nuevoNumero+ ' - ' + esDecimalPuro(nuevoNumero));
		console.log('      Prueba esTexto : '+ nuevoNumero+ ' - ' + esTexto(nuevoNumero));
        if ((esNatural(nuevoNumero) || esDecimal(nuevoNumero) || esDecimalPuro(nuevoNumero))&& !esTexto(nuevoNumero)) //Si es un numero valido
            numeros[x] = parseFloat(nuevoNumero); //Lo asigno 
        else alert(TEXTO_ERROR);    //Muestro el error
    }while (numeros[x] == undefined)//Repetir la captura mientras el numero no sea valido
    numeroMayor=numeros[x];         //Inicializo la variable con un numero de la lista. Exactamente sale del dowhile siempre el ultimo que se inserte 
}

for (x=0; x<TOTAL_NUMEROS_EVALUAR; x++){
    if (numeroMayor < numeros[x]) numeroMayor = numeros[x];
    document.write('El numero '+ (x+1) +' insertado es : '+ numeros[x] +'<br>'); //Siempre lo imprimo como (x+1) porque asi es mas logico para las personas pero el bucle va de 0 a TOTAL_NUMEROS_EVALUAR
}

document.write('El numero mayor es '+ numeroMayor + '<br>');

//Funciones
//Validadores de numeros devuelve true con regular expresion
function esNatural(strNumero){  //Es un numero entero sin decimal
	regexp = /^[0-9]*$/;
	return regexp.test(strNumero);
}

function esDecimal(strNumero){  //Es decimas con entero
	regexp = /^[0-9]*.[0-9]*$/;
	return regexp.test(strNumero);
}

function esDecimalPuro(strNumero){//Es decimal sin entero
	regexp = /^.[0-9]*$/;
	return regexp.test(strNumero);
}

function esTexto(strNumero){//Comprueba si es texto
	regexp = /^[a-z A-Z]*$/;
	return regexp.test(strNumero);
}

