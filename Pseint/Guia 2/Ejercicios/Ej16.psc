///16. Dada una secuencia de n�meros ingresados por teclado que finaliza con un *-1, por
///ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,...,-1; realizar un programa que calcule el promedio de los
///n�meros ingresados. Suponemos que el usuario no insertar� n�mero negativos.

Algoritmo Ej16
	
	Definir num, contador, suma Como Entero
	Definir prom Como Real
	
	num = 0
	suma = 0
	contador = 0
	
	Mientras (num <> -1)
		
		Escribir "Ingrese un numero"
		Leer num
		
		suma = suma + num
		
		contador = contador+1
		
	FinMientras
	
	prom = (suma+1)/ (contador-1)
	
	Escribir "El promedio de la secuencia ingresada es: ", prom
	
FinAlgoritmo
