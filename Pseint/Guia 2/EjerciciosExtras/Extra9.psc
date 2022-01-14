////Realice un programa que, dado un año, nos diga si es bisiesto o no. 
///Un año es bisiesto bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible por 100
////Si un año es divisible por 100 y además es divisible por 400, también resulta
////	bisiesto. Nota: recuerde la función mod de PSeInt

Algoritmo Extra9
	
	Definir anio Como Entero
	
	Escribir "Ingrese anio"
	Leer anio
	Si (anio mod 4)=0 Y (anio mod 100)<>0 Entonces
		Escribir "El anio ", anio, " es bisiesto"
	SiNo
		Si (anio mod 400)=0 Y (anio mod 100)=0 Entonces
			Escribir "El anio ", anio, " es bisiesto"
		SiNo
			Escribir "El anio ", anio, " no es bisiesto"
		FinSi
	FinSi
	
FinAlgoritmo
