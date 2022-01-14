//// 7. Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos

Algoritmo Extra7
	
	Definir num, lg Como Entero
	Definir tNum Como Cadena
	
	Escribir "Ingrese numero"
	Leer num
	
	tNum = ConvertirATexto(num)
	lg = Longitud(tNum)
	
	Segun lg Hacer
		1:
			Escribir "El numero ingresado tiene ",lg " digitos"
		2:
			Escribir "El numero ingresado tiene ",lg " digitos"
		3:
			Escribir "El numero ingresado tiene de 3 digitos"
		4:
			Escribir "El numero ingresado tiene ",lg " digitos"
		5:
			Escribir "El numero ingresado tiene ",lg " digitos"
		6:
			Escribir "El numero ingresado tiene ",lg " digitos"
		De Otro Modo:
			Escribir "Numero invalido"
	FinSegun
	
	
FinAlgoritmo
