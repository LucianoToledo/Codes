////10. Escribir una función recursiva que devuelva la suma de los primeros N enteros

Funcion sumatoria= suma(n)
	Definir sumatoria Como Entero
	
	Si n>0 Entonces
		sumatoria=n+suma(n-1) //va sumando n con el anterior hasta n=0; n+(n-1)+(n-2)+...0
		Escribir n, "+", sumatoria-n, "=", sumatoria
	FinSi
	
FinFuncion


Algoritmo Ej10
	
	Definir num Como Entero
	
	Escribir "Ingrese la cantidad de numeros a sumar"
	Leer num
	
	Escribir suma(num)
	
FinAlgoritmo
