////8. Realizar un procedimiento que permita realizar la división entre dos números y muestre
////el cociente y el resto utilizando el método de restas sucesivas.
////El método de división por restas sucesivas consiste en restar el dividendo con el
////divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y
////el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:
////		50 - 13 = 37 una resta realizada
////		37 - 13 = 24 dos restas realizadas
////		24 - 13 = 11 tres restas realizadas
////	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3

SubProceso restas(n1,n2)
	Definir cociente, residuo Como Entero
	residuo=n1 //solo se una vez para que se ejecute el mientras
	cociente=0
	Mientras residuo>=n2 Hacer
		residuo=residuo-n2
		cociente=cociente+1		
	FinMientras
	
	Escribir "-----------"
	Escribir n1,"/",n2
	Escribir "Cociente: ", cociente
	Escribir "residuo: ",residuo 
FinSubProceso

Algoritmo Ej8
	
	Definir dividendo, divisor Como Entero
	
	Escribir "Ingrese dividendo"
	Leer dividendo
	Escribir "Ingrese divisor"
	Leer divisor
	
	restas(dividendo, divisor)
	
FinAlgoritmo
