////11. Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la
////	diagonal principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe
////	generar otro subproceso para imprimir la matriz.
SubProceso mostr(matriz,n)
	Definir i,j Como Entero
	Para i=0 hasta n-1 Hacer //muestra la matriz
		para j=0 Hasta n-1 Hacer
			Escribir Sin Saltar "|", matriz[i,j],"|"
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso llenado(matriz,n)
	Definir i,j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta n-1 Hacer
			Si i=j Entonces
				matriz[i,j]=0
			SiNo
				matriz[i,j]=Aleatorio(1,9)
			FinSi
		FinPara
	FinPara
FinSubProceso

Algoritmo Ej11
	
	Definir matriz,n Como entero
	
	Escribir "Ingrese tamaño"
	Leer n
	
	Dimension matriz[n,n]
	
	llenado(matriz,n)
	mostr(matriz,n)
	
FinAlgoritmo
