///Escribir un programa que calcule el precio promedio de un producto. El precio promedio
///se debe calcular a partir del precio del mismo producto en tres establecimientos
///distintos.

Algoritmo Ej3
	Definir p1, p2, p3, promedio Como Real
	
	Escribir "Ingrese valor del producto en el establecimiento 1"
	Leer p1
	Escribir "Ingrese valor del producto en el establecimiento 2"
	Leer p2
	Escribir "Ingrese valor del producto en el establecimiento 3"
	Leer p3
	
	promedio = (p1+p2+p3)/3
	
	Escribir "El promedio de los 3 establecimientos es: ", promedio
	
FinAlgoritmo
