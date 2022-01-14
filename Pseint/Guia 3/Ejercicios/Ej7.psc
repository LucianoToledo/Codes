////7. Crear una procedimiento que calcule la temperatura media de un día a partir de la
////temperatura máxima y mínima. Crear un programa principal, que utilizando un
////procedimiento, vaya pidiendo la temperatura máxima y mínima de n días y vaya
////mostrando la media de cada día. El programa pedirá el número de días que se van a
////introducir.

SubProceso temperatura(nDia)
	Definir max, min, suma, promedio Como Real
	Definir i Como entero
	
	Para i=1 Hasta nDia Hacer
		Escribir "Ingrese temperatura minima del dia ",i
		Leer min
		Escribir "Ingrese temperatura maxima del dia ",i
		Leer max
		
		promedio = (min+max)/2
		Escribir "La media del dia ",i," es ", promedio
	FinPara
FinSubProceso

Algoritmo Ej7
	
	Definir dia Como Entero
	
	Escribir "Ingrese cantidad de dias"
	Leer dia
	
	temperatura(dia)
	
	
FinAlgoritmo
