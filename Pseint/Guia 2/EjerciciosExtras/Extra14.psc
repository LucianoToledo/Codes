////14. Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A
////continuaci�n, se debe pedir al usuario que ingrese n�meros enteros situados entre el
////m�ximo y m�nimo. Cada vez que un numero se encuentre entre ese intervalo, se sumara
////uno a una variable. El programa terminar� cuando se escriba un n�mero que no
////pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
////n�meros ingresados dentro del intervalo.

Algoritmo Extra14
	
	Definir min, max,num, contador Como Entero
	
	Escribir "Ingrese un numero minimo y otro maximo"
	Leer min, max
	Escribir "Ingrese numero"
	Leer num
	contador=0
	
	Mientras num>min Y num<max Hacer
		contador=contador+1
		Escribir "Ingrese numero"
		Leer num
	FinMientras
	
	Escribir "Intervalo [",min,",",max,"]"
	Escribir "Cantidad de numeros ingresados dentro del intervalo: ",contador
FinAlgoritmo
