///Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
///solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial


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
