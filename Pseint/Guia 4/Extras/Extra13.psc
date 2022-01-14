////13. Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3. 
////Inicialice las matrices para evitar el ingreso de datos por teclado.

Algoritmo Extra13
	
	Definir i,j,k,A,B,C,cont,temp Como Entero
	Dimension A[3,3],B[3,3],C[3,3]
	
	para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			A[i,j]=azar(10)
			B[i,j]=azar(10)
		FinPara
	fin para 
	
///ingreso manual de datos
//	Escribir "matriz A" 
//	para i=0 Hasta 2 Hacer
//		para j=0 Hasta 2 Hacer
//			leer A[i,j]
//		FinPara
//	FinPara
//	Escribir "matriz B"
//	para i=0 Hasta 2 Hacer
//		para j=0 Hasta 2 Hacer
//			leer B[i,j]
//		FinPara
//	FinPara
	
	para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			C[i,j]=0
		FinPara
	FinPara
	
	para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			para k=0 Hasta 2 Hacer //se usa un 3er "Para", para poder mantener constante la fila en A y la columna en B mientras se hacen las sumas
				C[i,j]=C[i,j]+(A[i,k]*B[k,j]) //ej: se mantiene la fila 0 cte mientras va cambiando la columna en la matriz A
			FinPara
		FinPara
	FinPara
	
	Escribir "Matriz A"
	Para i=0 hasta 2 Hacer 
		para j=0 Hasta 2 Hacer
			Escribir Sin Saltar "|", A[i,j],"|"
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
	Escribir "Matriz B"
	Para i=0 hasta 2 Hacer 
		para j=0 Hasta 2 Hacer
			Escribir Sin Saltar "|", B[i,j],"|"
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	Escribir "producto de A*B"
	
	Para i=0 hasta 2 Hacer 
		para j=0 Hasta 2 Hacer
			Escribir Sin Saltar "|", C[i,j],"|"
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
