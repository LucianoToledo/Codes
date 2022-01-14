///Escribir un programa que calcule cuántos litros de combustible consumió un automóvil.
///El usuario ingresase una cantidad de litros de combustible cargados en la estación y
///una cantidad de kilómetros recorridos, después, el programa calculará el consumo
///(km/lt) y se lo mostrará al usuario.

Algoritmo Ej5
	Definir litros, km, consumo Como Real
	
	Escribir "Ingrese la cantidad de litros cargados"
	Leer litros
	Escribir "Ingrese la cantidad de km recorridos"
	Leer km
	
	consumo = km/litros
	
	Escribir "El consumo es de ", consumo, "km/lt"
	
FinAlgoritmo
