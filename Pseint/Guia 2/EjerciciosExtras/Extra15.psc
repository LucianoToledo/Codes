////15. Escriba un programa que solicite al usuario números decimales mientras que el usuario
////escriba números mayores al primero que se ingresó. Por ejemplo: si el usuario ingresa
////		como primer número un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
////		número. El programa continuará solicitando valores sucesivamente mientras los valores
////			ingresados sean mayores que 3.1, caso contrario, el programa finaliza.

Algoritmo Extra15
	//yo lo plantee como que el numero a ingresar debe ser mayor al anterior y no al primer numero que se ingreso
	Definir num, anterior Como Real
	
	Escribir "Ingrese numero"
	Leer num
	anterior=num-1
	
	Mientras num>anterior Hacer
		anterior=num
		
		Escribir "Ingrese numero"
		Leer num
		
		Escribir "num ",num
		Escribir "anterior ", anterior
	FinMientras
	
	///Codigo del pancho
	///el pancho tomo el primer numeor ingresado como base
	
//	Definir nroDecimal, nro Como Real
//    Escribir "Ingrese un numero real: "
//    Leer nroDecimal
//    Escribir "Ingrese otro numero real: "
//    Leer nro
//    Mientras nro > nroDecimal Hacer
//        Escribir "Ingrese otro numero real: "
//        Leer nro
//    FinMientras
	
FinAlgoritmo
