////1. Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba
//// un curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor
//// o igual a 70; y reprueba en caso contrario

Algoritmo Extra1
	
	Definir  n1, n2, n3, prom Como Real
	Definir bandera Como Logico
	
	Escribir "Ingrese las 3 notas"
	Leer n1, n2, n3
	
	Si ((n1>=0 Y n1<=100)Y(n2>=0 Y n2<=100)Y(n3>=0 Y n3<=100)) Entonces
		bandera= Verdadero
	SiNo
		bandera = falso
	FinSi
	
	prom=( n1+ n2+ n3)/3
	
	Si bandera= Falso Entonces
		Escribir "Notas no validas "
	SiNo
		Si (prom >=70) Entonces
			Escribir "Aprobo"
		SiNo
			Escribir "Desaprobo"
		FinSi
	FinSi
	
	//hacer bucle para que no se corte si meto uno mal
	
FinAlgoritmo
