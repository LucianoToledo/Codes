////18. Realizar un programa que solicite al usuario su código de usuario (un número entero
////mayor que cero) y su contraseña numérica (otro número entero positivo). El programa
////no le debe permitir continuar hasta que introduzca como código 1024 y como
////contraseña 4567. El programa finaliza cuando ingresa los datos correctos

Algoritmo Extra18
	
	Definir user, pass Como Entero
	
	Hacer
		Escribir "Ingrese su usuario"
		Leer user
	Mientras Que user <> 1024
	Hacer
		Escribir "Ingrese contraseña"
		Leer pass
	Mientras Que pass <> 4567
	
FinAlgoritmo
