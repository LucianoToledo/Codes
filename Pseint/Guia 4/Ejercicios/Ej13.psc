////13. Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas)
////que tiene como propiedad especial que la suma de las filas, las columnas y las
////diagonales es igual. Por ejemplo:
////	2 7 6
////	9 5 1
////	4 3 8
////	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir
////	un algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso
////	de que sea mágica escribir la suma. Además, el programa deberá comprobar que los
////	números introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el
////	tamaño de la matriz que no debe superar orden igual a 10.

Algoritmo Ej13
	Definir matriz, n ,num,i,j,contFila, contColum,suma, sumaAux, sumaMatriz Como Entero
	Escribir "Ingrese dimension de la matriz"
	Leer n
	Dimension matriz[n,n]
	
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta n-1 Hacer
			
			Escribir "Ingrese numero [",i,",",j,"]"
			leer num
			
			Mientras num<=0 O num>=10
				Escribir "El numero debe estar entre 1 y 9"
				Escribir "Ingrese nuevamente [",i,",",j,"]"
				Leer num
			FinMientras
			
			matriz[i,j]=num
			
		FinPara
	FinPara
	Escribir "------------"
	suma=0
	
	para i=0 Hasta 0 Hacer
		para j=0 Hasta n-1 Hacer
			suma=suma+matriz[i,j] //guardo la suma de la primer fila
			Escribir Sin Saltar matriz[i,j]
		FinPara
	FinPara
	
	sumaAux=suma*n
	
	sumaMatriz=0
	para i=0 Hasta n-1 Hacer
		Para j=0 hasta n-1 Hacer
			sumaMatriz=sumaMatriz+matriz[i,j] //suma de todos los elementos de la matriz
		FinPara
	FinPara
	
	Si sumaAux=sumaMatriz Entonces //la suma de una fila por su dimension es igual a la suma de todos los elementos de la matriz
		Escribir "Es una matriz magica"
	SiNo
		Escribir "No es una matriz magica"
	FinSi
	
	Escribir "suma fila ",suma
	Escribir "suma aux ", sumaAux
	Escribir "suma total ",sumaMatriz
	
	Para i=0 hasta n-1 Hacer //muestra la matriz
		para j=0 Hasta n-1 Hacer
			Escribir Sin Saltar "| ", matriz[i,j]," |"
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
