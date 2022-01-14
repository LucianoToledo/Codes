///Pedir al usuario que ingrese su nombre y apellido, Luego concatenar ambos, con 3* entre ellos
///Ej: VALENTINO***CHIOLA.

Algoritmo Extra3
	
	Definir nombre, apell, concat, aux Como Cadena
	
	Escribir "Ingrese Nombre"
	Leer nombre
	Escribir "Ingrese Apellido"
	Leer apell
	
	concat = nombre+"***"+apell
	
	///concat = concatenar(nombre,"***")
	///aux = Concatenar(concat,apell)
	
	Escribir ""
	Escribir concat
	
FinAlgoritmo
