////21. Se pide escribir un programa que calcule la suma de los N primeros números pares. Es
////    decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma
////	de los siguientes valores: 2+4+6+8+10.

Algoritmo Extra21
	
	Definir num, nPar,i, suma Como Entero
	
	i=0
	suma=0
	
	Escribir "Ingrese la cantidad de numeros a sumar"
	Leer num
	
	Hacer
		i=i+1
		Si ((i mod 2 )= 0) Entonces
			suma = suma+i
		FinSi
		
//		Escribir suma
//		Escribir "-------"
	Mientras Que i<>(num*2) //el nPar maximo que puedo tener es num*2
	
	Escribir "La suma es ",suma
	
FinAlgoritmo
