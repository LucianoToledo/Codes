////24. Escribir un programa que calcule la suma de los N primeros números naturales. El valor
////de N se leerá por teclado

Algoritmo Extra24
	
	Definir num, i,suma Como Entero
	
	Escribir "Ingrese un numero"
	Leer num
	suma=0
	
	Para i=1 hasta num Hacer
		suma=suma+i
	FinPara

	Escribir "La suma de los numeros naturales hasta ",num," es: ",suma
	
FinAlgoritmo