////19. Se debe realizar un programa que:
////	1�) Pida por teclado un n�mero (entero positivo).
////	2�) Pregunte al usuario si desea introducir o no otro n�mero.
////	3�) Repita los pasos 1� y 2� mientras que el usuario no responda n/N (no).
////	4�) Muestre por pantalla la suma de los n�meros introducidos por el usuario

Algoritmo Extra19
	
	Definir num, suma Como Entero
	Definir rta Como Caracter
	Definir bandera Como Logico
	
	suma=0
	bandera = Verdadero
	
	Hacer
		
		Escribir "Ingrese un numero"
		Leer num
		suma=suma + num
		
		Escribir "Desea ingresar otro numero? s/n"
		Leer rta
		
	Mientras Que Mayusculas(rta)<>"N"
	
	Escribir "La suma de los numeros ingresados es ",suma
	
FinAlgoritmo
