///Construir un programa que simule un men� de opciones para realizar las cuatro
///operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
///num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
///car�cter de la operaci�n que desea realizar: 'S' o 's' para la suma, 'R' o 'r' para la resta, 'M'
///o 'm' para la multiplicaci�n y 'D' o 'd' para la divisi�n.

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
