////9. El número de combinaciones de m elementos tomados de n es:
////	(m/n)=(m!/n!(m-n)!)
////	Diseñar una función que permita calcular el número combinatorio de (m/n)
////Nota: n debe ser mayor a 0 y menor que m
Funcion resultado=combinatorio(m,n)
	Definir resultado Como Real
	Definir i,numerador, denoIzq,denoDer Como Entero
	
	numerador=1
	denoIzq=1
	denoDer=1
	
	Para i=1 Hasta m Hacer
		numerador=numerador*i
	FinPara
	
	Para i=1 Hasta n Hacer
		denoIzq=denoIzq*i
	FinPara
	
	Para i=1 Hasta (m-n) Hacer
		denoDer=denoDer*i
	FinPara
	
	resultado=(numerador/denoIzq*denoDer)
	
FinFuncion


Algoritmo Extra9
	
	Definir m,n Como Entero
	
	Escribir "Ingrese m"
	Leer m
	Hacer
		Escribir "Ingrese n"
		Leer n
	Hasta Que n<m Y n>0

	Escribir combinatorio(m,n)
	
FinAlgoritmo
