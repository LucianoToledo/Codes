////19. Escribir un programa que calcule el máximo común divisor (MCD) de dos enteros
////positivos. Si M >= N una función recursiva para MCD es:
////	MCD = M, si N =0
////	MCD = MCD (N, M mod N), si N <> 0
////El programa le debe permitir al usuario ingresar los valores para M y N. Una función
////recursiva es entonces llamada para calcular el MCD. El programa debe imprimir el valor para el MCD.

Funcion result = MCD(n,m)
	Definir result Como Entero
	
	Hacer
		Si n=0 Entonces
			result=m
		SiNo
			result=MCD(n,(m mod n))
		FinSi
	Hasta Que n>=m
	
FinFuncion

Algoritmo Extra19
	
	Definir n,m Como Entero
	
	Escribir "Ingrese N"
	Leer n
	Escribir "Ingrese M"
	Leer m
	
	Si m<=n Entonces
		Escribir "No se puede calcular el MCD"
	SiNo	
		Escribir MCD(n,m)
	FinSi

FinAlgoritmo
