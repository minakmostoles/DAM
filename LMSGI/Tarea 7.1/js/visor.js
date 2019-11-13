/*Tarea 7.1 - Rubio Avila Mario*/
function selectFoto(num) {                  		//Funcion para cambiar la ruta de la imagen
    direccion=("imagenes/panoramica"+num+".jpg");   //conformamos la nueva ruta
    document.images["fotoVisor"].src=direccion;     //lo cambiamos en el codigo
}
