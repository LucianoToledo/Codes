///Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por
///pantalla el área y perímetro del mismo
///area = base * altura
///perimetro = 2 * altura + 2 * base.

Algoritmo EjExtra2
	
	Definir b, h ,area, peri Como Real
	
	Escribir "Ingrese el base"
	Leer b
	Escribir "Ingrese la altura"
	Leer h
	
	area = b * h
	peri = 2 * b + 2 * h
	
	Escribir "El area es de ", area
	Escribir "El perimetro es de ", peri
	
FinAlgoritmo
