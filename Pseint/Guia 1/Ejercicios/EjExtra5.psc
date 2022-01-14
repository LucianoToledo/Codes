///Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio
///del año, y el precio del mismo producto al finalizar el año. El programa debe calcular cuál
///fue el porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla.

Algoritmo EjExtra5
	
	Definir preIni, preFin, aumento, porc Como Real
	
	Escribir "Ingrese precio inicial"
	Leer preIni
	Escribir "Ingrese precio final"
	Leer preFin
	
	aumento = preFin-preIni
	porc = (aumento/preIni)*100
	
	Escribir "El producto tuvo un aumento de ", porc, " %"
FinAlgoritmo
