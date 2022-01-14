////14. Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las 
////dos primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 
////columna se deberá almacenar el resultado de sumar el número de la primera y segunda 
////columna. Mostrar la matriz de la siguiente forma:
////3 + 5 = 8 
////4 + 3 = 7 
////1 + 4 = 5  
////... 

Algoritmo Extra14
	Definir i,j,matriz,n Como Entero
	Hacer
		Escribir "Ingrese cantidad de filas"
		Leer n
	Mientras Que n<=0
	
	Dimension matriz[n,3]
	
	para i=0 Hasta n-1 Hacer
		para j=0 hasta 1 Hacer
			//			Escribir "ingrese valor [",i,",",j,"]"
			//			leer matriz[i,j]
			matriz[i,j]=azar(10)
		FinPara
	FinPara
	
	para i=0 Hasta n-1 Hacer
		para j=2 hasta 2 Hacer //solo se guarda en la 3er columna
			matriz[i,j]=matriz[i,j-1]+matriz[i,j-2]
		FinPara
	FinPara
	
	Para i=0 hasta n-1 Hacer 
		para j=0 Hasta 2 Hacer
			si j=0 Entonces
				Escribir Sin Saltar matriz[i,j], "+"
			SiNo
				si j=1 Entonces
					Escribir Sin Saltar matriz[i,j]
				SiNo
					si j=2 Entonces
						Escribir Sin Saltar "=",matriz[i,j]
					FinSi
				FinSi
			FinSi
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
