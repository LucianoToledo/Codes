////14. Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha
////	anterior. Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba
////	una fecha representada a través de tres enteros dia, mes y anio, y retorne la fecha
////	anterior. Puede asumir que dia, mes y anio representan una fecha válida. Realice
////	pruebas de escritorio para los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3,
////	anio=2004

SubProceso diaAnterior(dd,mm,aa)
	
	dd=dd-1
	
	Si dd=0 Entonces
		dd=31
		mm=mm-1
		Si mm=0 Entonces
			mm=12
			aa=aa-1
		FinSi
	FinSi	
	
	Escribir dd,"/",mm,"/",aa
FinSubProceso

Algoritmo Extra14
	
	Definir dia, mes, anio Como Entero
	
	Hacer
		Escribir "Ingrese fecha dd/mm/aa"
		Leer dia, mes, anio
	Hasta Que (dia<=31 Y dia >=0) Y (mes>=0 Y mes<=12) y Anio >= 0
	
	diaAnterior(dia,mes,anio)
	
FinAlgoritmo
