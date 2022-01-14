////12. Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos 
////y ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna 
////de ceros. 
////
////Por ejemplo, nuestro matriz final debería verse así: 
////	
////	111111111111111 
////	100000000000001 
////	100000000000001 
////	100000000000001 
////	111111111111111

Algoritmo Extra12
	Definir i,j,matriz Como Entero
	Dimension matriz[5,15]
	
	para i=0 Hasta 4 Hacer
		para j=0 Hasta 14 Hacer
			si i=0 o i=4 Entonces
				matriz[0,j]=1 //1er fila
				matriz[4,j]=1 //ultima fila
			SiNo
				si j=0 o j=14 Entonces
					matriz[i,0]=1 //1er columna
					matriz[i,14]=1 //ultima columana
				SiNo
					matriz[i,j]=0
				FinSi
			FinSi
		FinPara
	FinPara
	
	Para i=0 hasta 4 Hacer 
		para j=0 Hasta 14 Hacer
			Escribir Sin Saltar "|", matriz[i,j],"|"
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
