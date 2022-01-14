////19. Escribir un programa que calcule el cuadrado de los 9 primeros números naturales e
////imprima por pantalla el número seguido de su cuadrado. Ejemplo: "
//// 2 elevado al cuadrado es igual a 4", y así sucesivamente.

Algoritmo Ej19
	
	Definir num,i, cuadr Como Entero
	num=0
	
	Para i=0 Hasta 9-1 Con Paso 1 Hacer
		num=num+1
		cuadr = num*num
		Escribir num, "^2= ",cuadr
	Fin Para
FinAlgoritmo
