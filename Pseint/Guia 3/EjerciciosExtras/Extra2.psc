////2. Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como
////numero entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner
////n�meros con decimales

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
