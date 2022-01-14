////9. Escribir un programa que realice la búsqueda lineal de un número entero ingresado por
////el usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
////coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra.
////En caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje

Algoritmo Ej9
	Definir matriz, i,j,nBuscado, cont Como Entero
	Dimension matriz[5,5]
	
	Para i=0 hasta 4 Hacer
		para j=0 Hasta  4 Hacer
			matriz[i,j]=Aleatorio(0,10)
		FinPara
	FinPara
	
	Escribir "Ingrese el numero a buscar en la matriz"
	Leer nBuscado
	cont=0
	
	Para i=0 hasta 4 Hacer
		para j=0 Hasta  4 Hacer
			Si matriz[i,j] = nBuscado Entonces
				cont=cont+1
				Escribir "El numero se encuentra en las coordenadas [",i,",",j,"]"
			FinSi
		FinPara
	FinPara
	
	Si cont=0 Entonces
		Escribir "El numero ingresado no se encuentra en la matriz"
	FinSi
	
	Escribir ""
	Escribir "Matriz generada:"
	
	Para i=0 hasta 4 Hacer //muestra la matriz
		para j=0 Hasta 4 Hacer
			Escribir Sin Saltar "|", matriz[i,j],"|"
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
