////16. Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
////calcula seg�n el siguiente criterio: la parte pr�ctica vale el 10%; la parte de problemas
////	vale el 50% y la parte te�rica el 40%. El programa leer� el nombre del alumno, las tres
////	notas obtenidas, mostrar� el resultado por pantalla, y a continuaci�n volver� a pedir los
////	datos del siguiente alumno hasta que el nombre sea una cadena vac�a. Las notas deben
////	estar comprendidas entre 0 y 10, y si no est�n dentro de ese rango no se imprimir� el
////		promedio y se mostrar� un mensaje de error.

Algoritmo Extra16
	
	Definir notaFinal,practica, probl, teo Como Real
	Definir nombre Como Cadena
	
	Escribir "Ingresar nombre del alumno"
	Leer nombre
	
	Mientras  nombre<>"" Hacer
		
		Escribir "Ingresar notas"
		Leer practica, probl, teo

		Mientras (practica<=0 Y practica>=10) Y (probl<=0 Y probl>=10) Y (teo<=0 Y teo>=10) Hacer //validacion de notas dentro del intervalo
			Escribir "Error en las notas ingresads, nota no valida"
			Escribir "Ingres nuevamente las notas"
			Leer practica, probl, teo
		FinMientras
		
		notaFinal=practica*0.1+probl*0.5+teo*0.4
		
		Escribir "Alumno: ", nombre
		Escribir "Promedio: ", notaFinal
		Escribir "-----------------------"
		Escribir "Ingresar nombre del alumno" //proximo alumno
		Leer nombre
	FinMientras
	
FinAlgoritmo
