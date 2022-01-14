///Construir un programa que simule un menú de opciones para realizar las cuatro
///operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
///numéricos enteros. El usuario, además, debe especificar la operación con el primer
///carácter de la operación que desea realizar: 'S' o 's' para la suma, 'R' o 'r' para la resta, 'M'
///o 'm' para la multiplicación y 'D' o 'd' para la división.

Algoritmo Ej11
	
	Definir n1, n2 Como Entero
	Definir op Como Real
	Definir opcio Como Caracter
	
	Escribir "Ingrese 2 numeros"
	Leer n1,n2
	
	Escribir ""
	Escribir "Ingrese una opcion"
	Escribir ""
	Escribir "S_Suma"
	Escribir "R_Resta"
	Escribir "M_Multiplicacion"
	Escribir "D_Division"
	Escribir ""
	Leer opcio
	
	Segun Mayusculas(opcio) Hacer
		"S":
			op = n1+n2
			Escribir "n1+n2= ",op
		"R":
			op = n1-n2
			Escribir "n1-n2= ",op
		"M":
			Escribir "n1*n2= ",op
		"D":
			op = n1/n2
			Escribir "n1/n2= ",op
		De Otro Modo:
			
		Escribir "Opcion invalida"
FinSegun


FinAlgoritmo
