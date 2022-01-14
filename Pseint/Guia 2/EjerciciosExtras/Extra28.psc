////28. Realizar un programa que calcule la siguiente sumatoria:
////	1 + 1/2! + 1/3! + ? + 1/n!
////	donde n es un valor entero ingresado por el usuario y n! es el factorial de ese número

Algoritmo Extra28
	
	Definir facto,i,num Como Entero
	Definir suma Como real
	
	Escribir "Ingrese un numero"
	Leer num
	
	facto=1
	suma=0
	
	Para i=1 Hasta num Hacer
		facto=facto*i
		suma=suma+(1/facto)
		
	FinPara
	Escribir "---------"
	Escribir suma
	
FinAlgoritmo
