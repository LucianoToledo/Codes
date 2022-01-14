////15. Realizar un programa que permita visualizar el resultado del producto de una matriz de 
////enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden 
////inicializarse evitando así el ingreso de datos por teclado.

Algoritmo Extra15
	
	Definir i,j,n,k,matriz,vec,c Como Entero
	
	Hacer
		Escribir "ingrese tamaño del vector"
		leer n
	Mientras Que n<=0
	Dimension matriz[3,3], vec[n]
	
	si n<>3 Entonces
		Escribir "Multiplicacion no definida"
	sino
		para i=0 Hasta 2 Hacer
			vec[i]=azar(10)
			para j=0 Hasta 2 Hacer
				matriz[i,j]=azar(10)
			FinPara
		FinPara
		
		Dimension c[3,1]
		para i=0 hasta 2 Hacer
			para j=0 hasta 0 Hacer
				c[i,j]=0
			FinPara
		FinPara
		
		para i=0 Hasta 2 Hacer //recorre 3 filas
			para j=0 Hasta 2 Hacer //recorre 3 columnas
				para k=0 Hasta 0 Hacer //recorre una columna
					C[i,k]=C[i,k]+(matriz[i,j]*vec[j]) 
				FinPara
			FinPara
		FinPara
		
	FinSi
	
	Escribir "vector"
	Para i=0 hasta 2 Hacer 
		Escribir "|", vec[i],"|"
	FinPara
	
	Escribir "matriz "
	Para i=0 hasta 2 Hacer 
		para j=0 Hasta 2 Hacer
			Escribir Sin Saltar "|", matriz[i,j],"|"
		FinPara
		Escribir ""
	FinPara
	
	Escribir "matriz resultante"
	Para i=0 hasta 2 Hacer //recorre 3 filas
		para j=0 Hasta 0 Hacer //recorre 1 columna
			Escribir Sin Saltar "|", C[i,j],"|"
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
