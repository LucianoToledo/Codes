////9. Escribir un programa que procese una secuencia de caracteres ingresada por teclado
////y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente
////manera: cada vocal se reemplaza por el car�cter que se indica en la tabla y el resto de
////	los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
////	a = @
////	e = #
////	i = $
////	o = %
////	u = *
////	Realice un subprograma que reciba una secuencia de caracteres y retorne la
////	codificaci�n correspondiente. Utilice la estructura "seg�n" para la transformaci�n.
////	Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
////		La salida del programa deber�a ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
////		NOTA: investigue el uso de la funci�n concatenar de PSeInt para armar la palabra/frase

SubProceso transformacion(frase)
	Definir i, lg Como Entero
	Definir aux Como Caracter
	
	lg=Longitud(frase)
	Escribir ""
	Para i=0 Hasta lg Hacer
		aux=Subcadena(frase,i,i)
		Segun aux Hacer
			"a":
				aux="@"
			"e":
				aux="#"
			"i":
				aux="$"
			"o":
				aux="%"
			"u":
				aux="*"
		FinSegun		
		Escribir Sin Saltar aux
	FinPara
	Escribir ""
FinSubProceso

Algoritmo Ej9
	
	Definir frase Como Cadena
	
	Escribir "Ingrese una frase"
	Leer frase
	
	transformacion(frase)
	
FinAlgoritmo
