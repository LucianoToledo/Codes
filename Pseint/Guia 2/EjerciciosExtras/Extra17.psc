////17. Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
////convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
////		investigar la función trunc()

Algoritmo Extra17
	
	Definir num Como Real
	Definir nExtraido,i Como Entero
	
	Escribir "Ingrese un numero"
	Leer num
	
	
	nExtraido=num
	i=0
	
	Mientras num<0 Hacer
		Escribir "El numero ingresado es negativo"
		Escribir "Ingrese un numero positivo"
		Leer num
	FinMientras
	
	Mientras num>1 Hacer
		num=num/10
		//Escribir num
		nExtraido=trunc(num)
		//Escribir nExtraido
		i=i+1
		//Escribir i
		//Escribir "----------------"
	FinMientras
	
	Escribir "El numero ingresado tiene ",i," digitos"
	
FinAlgoritmo
