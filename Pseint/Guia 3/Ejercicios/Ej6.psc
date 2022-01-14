////6. Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo
////entero. La variable A, debe terminar con el valor de la variable B.

SubProceso intercambio(n1,n2)
	
	Definir aux Como Entero
	
	aux=n1
	n1=n2
	n2=aux
	
	Escribir n1,"   ", n2
FinSubProceso


Algoritmo Ej6
	
	Definir a, b Como Entero
	Escribir "Ingrese 2 numeros"
	Leer a,b
	
	intercambio(a,b)  //invocacion del subprograma
	
FinAlgoritmo
