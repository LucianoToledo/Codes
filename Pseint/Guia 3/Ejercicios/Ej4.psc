////4. Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
////función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso
////	de la función Subcadena()

Funcion cantidad=cantLetras(fraseIngresada, letraIngresada)
	
	Definir cantidad,i,lg Como Entero
	lg=Longitud(fraseIngresada)
	cantidad=0
	
	para i=0 Hasta lg Hacer
		Si Subcadena(fraseIngresada,i,i) = letraIngresada Entonces
			cantidad=cantidad+1
		FinSi
	FinPara
	
FinFuncion

Algoritmo Ej4
	Definir frase Como Cadena
	Definir letra Como Caracter
	Definir i Como Entero
	
	Escribir "Ingrese una frase"
	Leer frase
	Escribir "Ingrese letra"
	Leer letra

	Escribir "La cantidad de veces que aparece la letra " , letra
	Escribir " en la frase ingresada, es de: ",cantLetras(frase,letra)
FinAlgoritmo
	