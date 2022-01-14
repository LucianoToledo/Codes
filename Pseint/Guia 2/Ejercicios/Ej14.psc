///Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la
///nota se pedirá de nuevo hasta que la nota sea correcta.

Algoritmo Ej14
	
	Definir nota Como Entero
	Escribir "Ingrese nota"
	Leer nota
	
	Mientras (nota<0 O nota>10)
		Escribir "Nota incorrecta"
		Escribir ""
		Escribir "Ingrese nuevamente"
		Leer nota
	FinMientras
	
	Escribir "La nota ingresada es: ", nota
FinAlgoritmo
