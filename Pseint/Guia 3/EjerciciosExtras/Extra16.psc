////16. Crear un programa que calcule la suma de los enteros positivos pares desde N hasta 2.
////Chequear que si N es impar se muestre un mensaje de error.

Funcion resultado=suma(n)
	Definir resultado,i Como Entero
	
	si n=2 Entonces
		resultado=0
	SiNo		
		resultado=n+suma(n-2)
	FinSi
	
FinFuncion

Algoritmo Extra16
	Definir num Como Entero
	Escribir "ingrese numero"
	Leer num
	
	Mientras ((num mod 2) <> 0) Hacer
		Escribir "Error, ingresar un numero par"
		leer num
	fin mientras
	
	Escribir suma(num)
FinAlgoritmo
