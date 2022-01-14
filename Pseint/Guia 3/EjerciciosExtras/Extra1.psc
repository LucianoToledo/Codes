////1. Realizar una función que calcule y retorne la suma de todos los divisores del número n
////distintos de n. El valor de n debe ser ingresado por el usuario

Funcion sumatoria=divisores(n)
	Definir sumatoria,i Como Entero
	sumatoria=0
	Para i=n-1  hasta 1 Con Paso -1 Hacer
		Si (n mod i) =0 Entonces
			sumatoria=sumatoria+i
		FinSi
	FinPara
FinFuncion

Algoritmo Extra1
	
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	
	Escribir "La suma de todos los divisores de ",num," es: ", divisores(num)
FinAlgoritmo
