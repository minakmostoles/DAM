/* Ejercicio3: Realizar un programa que pida la carga de dos vectores numéricos, de cuatro
componentes que deberás almacenarlo en un array. Obtener la suma de los dos vectores, dicho
resultado guardarlo en un tercer vector del mismo tamaño. Sumar componente a componente.*/

//Constantes
const TOTAL_NUMEROS_EVALUAR = 4;
const TEXTO_ERROR = "El numero insertado no es correcto inserte un numero entero" //Mensaje a mostrar con el error

var vector1 = [];//Vector de numeros enteros
var vector2 = [];//Vector de numeros enteros
var resultado = [];//Vector suma de vectores
var strVectores

//Programa

//Rellenamos el primer vector
for (x=0; x<TOTAL_NUMEROS_EVALUAR; x++){
    do{
        var nuevoNumero = documento=prompt('Ingrese el '+ (x+1) +'º numero del 1º vector: ','');
        if (esNatural(nuevoNumero)) vector1[x] = parseInt(nuevoNumero);
        else alert(TEXTO_ERROR);    //Muestro el error
    }while (vector1[x] == undefined)//Repetir la captura mientras el numero no sea valido
}

//Rellenamos el segundo vector
for (x=0; x<TOTAL_NUMEROS_EVALUAR; x++){
    do{
        var nuevoNumero = documento=prompt('Ingrese el '+ (x+1) +'º numero del 2º vector:: ','');
        if (esNatural(nuevoNumero)) vector2[x] = parseInt(nuevoNumero);
        else alert(TEXTO_ERROR);    //Muestro el error
    }while (vector2[x] == undefined)//Repetir la captura mientras el numero no sea valido
}

//Realiza la suma
for (x=0; x<TOTAL_NUMEROS_EVALUAR; x++){
    resultado[x] = vector1[x] + vector2[x];
    //document.write('El numero en la posicion '+ (x+1) +' es : '+ resultado[x] +'<br>'); //Sirve para imprimir el resultado
}

//Imprimo segun el ejemplo
document.write('Vector1 = ');
imprimeVector(vector1);
document.write(' + Vector2 = ');
imprimeVector(vector2);
document.write('<br>==<br>Vector suma=');
imprimeVector(resultado);


/*
 *Funciones
 */
//Funcion que imprime los vectores
function imprimeVector(vector){
	document.write('(');
    for (x=0; x<TOTAL_NUMEROS_EVALUAR; x++){
        if(x<(TOTAL_NUMEROS_EVALUAR-1)) document.write(vector[x] + ' ,'); //Si no es el ultimo lo imprimo pero con coma
		else document.write(vector[x]);								      //Si el ultimo solo el numero
    }
	document.write(')');	
}


//Funcion que suma vectores
/*function sumaVector(vectorPrimero, vectorSegundo){
    for (x=0; x<TOTAL_NUMEROS_EVALUAR; x++){
        resultante[x] = vectorPrimero[x] + vectorSegundo[x];
    }
    return resultante;
}*/


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