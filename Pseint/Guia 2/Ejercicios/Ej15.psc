///Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n
///solicite n�meros al usuario hasta que la suma de los n�meros introducidos supere el l�mite inicial


Algoritmo Ej15
	
	Definir limite, num, suma Como Entero
	
	Escribir "Defina un limite"
	Leer limite
	
	suma = 0
	
	Mientras (suma<limite)
		Escribir "Ingrese un numero"
		Leer num
		suma = suma + num
		Escribir suma
	FinMientras
	
FinAlgoritmo
