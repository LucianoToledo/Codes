////23. Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de
////    3 comprendidos entre 1 y 100.

Algoritmo Extra23
	
	Definir multDos, multTres,i Como Entero
	
	multDos=0
	multTres=0
	
	Para i=1 hasta 100  Con Paso 1 Hacer
		
		Si ((i mod 2) =0) Entonces
			multDos=multDos+1
//			Escribir "cantidad ",multDos
//			Escribir "numero ", i
//			Escribir "---------------"
		FinSi
		
		Si ((i mod 3) = 0) Entonces
			multTres=multTres+1
//			Escribir "cantidad ",multTres
//			Escribir "numero ", i
//			Escribir "---------------"
		FinSi
		
	FinPara
	
	Escribir "Cantidad de numero multiplos de 2: ",multDos
	Escribir "Cantidad de numero multiplos de 3: ",multTres
	
FinAlgoritmo
