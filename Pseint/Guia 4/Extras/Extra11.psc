////11. Crear  una  matriz  de  orden  n  *  m  (donde  n  y  m  son  valores  ingresados  por  el  usuario), 
////llenarla  con  números  aleatorios  entre  1  y  100  y  mostrar  su  traspuesta

Algoritmo Extra11
	
	Definir matriz, traspuesta,i,j,n,m Como Entero
	
	Escribir "ingrese n"
	leer n
	Escribir "ingrese m"
	leer m
	
	Dimension matriz[n,m]
	Dimension traspuesta[m,n]
	
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta m-1 Hacer
			matriz[i,j]=azar(100)
		FinPara
	FinPara
	
	para j=0 Hasta n-1 Hacer
		para i=0 Hasta m-1 Hacer
			si i=j Entonces
				traspuesta[i,j]=matriz[i,j]
			SiNo
				traspuesta[i,j]=matriz[j,i]
			FinSi
			FinPara
	FinPara
	
	Escribir "matriz"
	Para i=0 hasta n-1 Hacer 
		para j=0 Hasta m-1 Hacer
			Escribir Sin Saltar "|", matriz[i,j],"|"
		FinPara
		Escribir ""
	FinPara
	Escribir "--------------"
	Escribir "traspuesta"
	Para i=0 hasta m-1 Hacer 
		para j=0 Hasta n-1 Hacer
			Escribir Sin Saltar "|", traspuesta[i,j],"|"
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
