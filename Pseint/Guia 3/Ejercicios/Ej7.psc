////7. Crear una procedimiento que calcule la temperatura media de un d�a a partir de la
////temperatura m�xima y m�nima. Crear un programa principal, que utilizando un
////procedimiento, vaya pidiendo la temperatura m�xima y m�nima de n d�as y vaya
////mostrando la media de cada d�a. El programa pedir� el n�mero de d�as que se van a
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
