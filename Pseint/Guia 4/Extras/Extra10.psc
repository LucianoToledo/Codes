////10. Realizar un programa que rellene de números aleatorios una matriz a través de un
////subprograma y generar otro subprograma que muestre por pantalla la matriz final

subproceso mostrarMatriz(v,a,a)
	definir i,j Como Entero
	Para i=0 hasta a-1 Hacer 
		para j=0 Hasta a-1 Hacer
			Escribir Sin Saltar "|", v[i,j],"|"
		FinPara
		Escribir ""
	FinPara
FinSubProceso

subproceso relleno(v,a,a)
	Definir i,j Como Entero
	para i=0 Hasta a-1 Hacer
		para j=0 Hasta a-1 Hacer
			v[i,j]=azar(10)
		FinPara
	FinPara
	mostrarMatriz(v,a,a)
FinSubProceso

Algoritmo Extra10
	
	Definir n,i,vec Como Entero
	Escribir "Ingrese dimension del vector"
	Leer n
	Dimension vec[n,n]
	
	Escribir ""
	relleno(vec,n,n)
	
FinAlgoritmo
