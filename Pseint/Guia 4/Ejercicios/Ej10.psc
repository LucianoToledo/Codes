////10. Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario)
////realizar un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos
////otro subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar
////la matriz y los resultados por pantalla.

SubProceso sumatoria(matriz,n,m)
	Definir suma,i,j Como Entero
	
	suma=0
	para i=0 Hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			suma=suma+matriz[i,j]
		FinPara
	FinPara
	
	Escribir "la suma de todos los elementos de la matriz es ",suma
FinSubProceso

Algoritmo Ej10
	
	Definir n,m,matriz,i,j Como Entero
	
	Escribir "Ingrese N y M"
	Leer n,m
	Dimension matriz[n,m]
	
	para i=0 Hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			matriz[i,j]=Aleatorio(0,10)
		FinPara
	FinPara
	
	sumatoria(matriz,n,m)
	
	Para i=0 hasta n-1 Hacer //muestra la matriz
		para j=0 Hasta m-1 Hacer
			Escribir Sin Saltar "|", matriz[i,j],"|"
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
