///Escribir un programa que calcule cu�ntos litros de combustible consumi� un autom�vil.
///El usuario ingresase una cantidad de litros de combustible cargados en la estaci�n y
///una cantidad de kil�metros recorridos, despu�s, el programa calcular� el consumo
///(km/lt) y se lo mostrar� al usuario.

Algoritmo Ej5
	Definir litros, km, consumo Como Real
	
	Escribir "Ingrese la cantidad de litros cargados"
	Leer litros
	Escribir "Ingrese la cantidad de km recorridos"
	Leer km
	
	consumo = km/litros
	
	Escribir "El consumo es de ", consumo, "km/lt"
	
FinAlgoritmo
