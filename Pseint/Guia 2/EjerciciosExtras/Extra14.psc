////14. Escriba un programa que solicite dos números enteros (mínimo y máximo). A
////continuación, se debe pedir al usuario que ingrese números enteros situados entre el
////máximo y mínimo. Cada vez que un numero se encuentre entre ese intervalo, se sumara
////uno a una variable. El programa terminará cuando se escriba un número que no
////pertenezca a ese intervalo, y al finalizar se debe mostrar por pantalla la cantidad de
////números ingresados dentro del intervalo.

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
