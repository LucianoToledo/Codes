////19. Se debe realizar un programa que:
////	1º) Pida por teclado un número (entero positivo).
////	2º) Pregunte al usuario si desea introducir o no otro número.
////	3º) Repita los pasos 1º y 2º mientras que el usuario no responda n/N (no).
////	4º) Muestre por pantalla la suma de los números introducidos por el usuario

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
