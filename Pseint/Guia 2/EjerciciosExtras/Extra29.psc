////29. Escribir un programa que calcule los primeros 4 centros num�ricos. Un centro num�rico
////es un n�mero que separa una lista de n�meros enteros (comenzando en 1) en dos
////grupos de n�meros, cuyas sumas son iguales. El primer centro num�rico es el 6, el cual
////separa la lista (1 a 8) en los grupos: (1, 2, 3, 4, 5) y (7, 8) cuyas sumas son ambas iguales
////a 15. El segundo centro num�rico es el 35, el cual separa la lista (1 a 49) en los grupos:
////	(1 a 34) y (36 a 49) cuyas sumas son ambas iguales a 595.
////Nota: investigar que es un centro num�rico en caso de no saber que es

Algoritmo Extra29
	
	Definir base,sumaBase, tope, sumaTope, centro,i Como Entero
	base=0
	tope=50
	sumaBase=0
	sumaTope=0
	Para i=0 hasta 50 Hacer
		base=base+1
		sumaBase=sumaBase+base
		tope=tope-1
		sumaTope = sumaTope+tope
		Si sumaBase = sumaTope Entonces
			Escribir "El centro numerico es ",i
		FinSi
	FinPara

FinAlgoritmo
