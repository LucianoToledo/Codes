////1.Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
////y los muestre por pantalla

Algoritmo Extra1
	
	Definir vec1, vec2, i Como Entero
	
	Dimension vec1[5]
	Dimension vec2[5]
	
	Para i=0 Hasta 4 Hacer
		vec1[i]=Aleatorio(0,9)
		vec2[i]=Aleatorio(0,9)
	FinPara
	
	Escribir "Vector 1"
	Para i=0 Hasta 4 Hacer
		Escribir Sin Saltar  " | " vec1(i)
	FinPara
	Escribir" |" 
	Escribir ""
	
	Escribir "Vector 2"
	Para i=0 Hasta 4 Hacer
		Escribir Sin Saltar  " | " vec2(i)
	FinPara
	Escribir" |" 
	Escribir ""
	
FinAlgoritmo
