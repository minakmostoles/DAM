<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<!-- Creamos la web con la aparicion del nodo raiz-->
	<xsl:template match="/notas">
		<html>
			<head>
				<title>Tarea 5.1 - XHTML</title>
				<!--Hoja de estilos para practicar su uso-->
				<link href="css/style.css" type="text/css" rel="stylesheet" />
			</head>
			<body>
				<div class="tituloDivision">
					<h1>LMSGI - Tarea 5.1 - XHTML</h1>
				</div>
				<div class="TablaXML">
					<h2 class="tituloConvocatoria">NOTAS CONVOCATORIA JUNIO</h2>
					<table>
						<tr>
							<th colspan="2" align="left">Datos</th>
							<th colspan="4" align="left">Notas</th>
						</tr>
							<tr class="cabecera">
							<th>Nombre</th>
							<th>Apellidos</th>
							<th>Tareas</th>
							<th>Cuestionarios</th>
							<th>Examen</th>
							<th>Final</th>
						</tr>
						<xsl:apply-templates/>
					</table>
				</div>
			</body>
			<footer>
				<a>Mario Rubio Avila - 2019 - LMSGI TAREA 5.1</a>
			</footer>
		</html>
	</xsl:template>

	<!-- Seleccionamos solo los nodos /nota/alumno con el atributo convocatoria igual a Junio  -->
	<xsl:template match="alumno[@convocatoria='Junio']">
		<tr><!-- Creamos una fila para cada uno que lo cumpla -->
			<td class="textIzq"><xsl:value-of select="nombre"/></td>
			<td class="textIzq"><xsl:value-of select="apellidos"/></td>
			<td><xsl:value-of select="tareas"/></td>
			<td><xsl:value-of select="cuestionarios"/></td>
			<td><xsl:value-of select="examen"/></td>
			<td align="center"><!-- Escribimos la nota final en texto-->
				<xsl:choose><!--swicht-->

					<!--      &lt; <          -->
					<!-- 	  &gt; >          -->
					<!-- <  5 Insuficiente 	  -->
					<!-- => 5 and < 6 	      -->
					<!-- => 6 and < 7         -->
					<!-- => 7 and < 9 Notable -->
					<!-- => 9 Sobresaliente   -->

					<xsl:when test="final  &lt; 5">INSUFICIENTE</xsl:when>
					<xsl:when test="final &gt;=5 and final &lt; 6">SUFICIENTE</xsl:when>
					<xsl:when test="final &gt;=6 and final &lt; 7">BIEN</xsl:when>
					<xsl:when test="final &gt;=7 and final &lt; 9">NOTABLE</xsl:when>
					<xsl:when test="final &gt;=9 and final &lt;= 10">SOBRESALIENTE</xsl:when>

				</xsl:choose>
			</td>
		</tr>
	</xsl:template>
	<xsl:template match="alumno[@convocatoria!='Junio']"><!--Lo que no es junio acaba aqui--></xsl:template>

</xsl:stylesheet>