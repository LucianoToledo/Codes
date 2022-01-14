////2. Diseñar una función que reciba un numero en forma de cadena y lo devuelva como
////numero entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner
////números con decimales

Funcion numNumero = num(n)
	Definir numNumero Como Entero
	numNumero=ConvertirANumero(n)
FinFuncion

Algoritmo Extra2
	
	Definir numCadena Como Cadena
	Definir lg Como Entero
	
	Escribir "Ingrese numeros"
	Leer numCadena
	
	Escribir num(numCadena)
	
	lg=Longitud(numCadena)
	
	Mientras lg>3 Hacer
		Escribir "Ingrese un numero de hasta 3 digitos"
		Escribir "Ingrese numeros"
		Leer numCadena
		lg=Longitud(numCadena)
	FinMientras
	
FinAlgoritmo
