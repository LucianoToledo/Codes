///Realiza  un  programa  que  s�lo  permita  introducir  los  caracteres  'S'  y  'N'.  
///Si  el  usuario ingresa alguno de esos dos caracteres se deber� de imprimir un mensaje por pantalla
///que diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO".

Algoritmo Ej4
	
	Definir c1 Como Caracter
	
	Escribir "Ingrese caracter"
	Leer c1
	
	Si (Mayusculas(c1) = "N" O Mayusculas(c1) = "S")Entonces
		Escribir "Correcto"
	SiNo
		Escribir "Incorrecto"
	FinSi
	
FinAlgoritmo
