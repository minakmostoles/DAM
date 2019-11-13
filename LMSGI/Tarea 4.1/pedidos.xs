<?xml version="1.0" encoding="UTF-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">

	<xs:element name="pedidos">
		<xs:complexType>
			<xs:sequence>
				<xs:element name="pedido">
					<xs:complexType>
						<xs:sequence>			
							<xs:element name="sucursal" type="xs:string"/>
							<xs:element name="dir_entrega" type="xs:string"/>
							<xs:element name="nom_trabajador" type="xs:string"/>
							<xs:element name="f_pedido" type="xs:date"/>
							<xs:element name="obs_pedido" type="xs:string"/>
							<xs:element name="plazo_revision" type="xs:string"/>
							<xs:element name="articulo">
								<xs:complexType>
									<xs:sequence>
										<xs:element name="unidades" type="xs:int"/>
										<xs:element name="precio_und" type="xs:string"/>
										<xs:element name="obs_articulo" type="xs:string"/>
									</xs:sequence>
								</xs:complexType>
							</xs:element>
						</xs:sequence>
					</xs:complexType>
				</xs:element>
			</xs:sequence>
		</xs:complexType>
	</xs:element>
</xs:schema>
