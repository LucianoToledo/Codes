////2.Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
////usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados

Algoritmo Extra2
	Definir vec,i,suma,n Como entero
	Definir prom Como Real
	
	Escribir "Ingrese dimension del vector"
	Leer n
	
	Dimension vec[n]
	suma=0
	para i=0 Hasta n-1 Hacer
		Escribir "Ingrese un numero"
		Leer vec(i)
		
		suma=suma+vec(i)
	FinPara
	
	prom=suma/n
	
	Escribir "-----------------------"
	Escribir "El promedio de los numeros ingresados es ",prom
	
	Para i=0 Hasta n-1 Hacer
		Escribir Sin Saltar  " | " vec(i)
	FinPara
	Escribir" |" 
	Escribir ""
FinAlgoritmo
