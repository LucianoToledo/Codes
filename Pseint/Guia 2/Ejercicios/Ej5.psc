///Realizar un  programa  que  pida  un  numero  y  determine  si  ese  numero  es  par  o  impar.
///Mostrar en pantalla un mensaje que indique si el numero es par o impar. 
///(para que un número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar la función mod de Pseint.

Algoritmo Ej5
	
	Definir num Como Entero
	
	Escribir "Ingrese numero"
	Leer num
	
	Si (num Mod 2) = 0 Entonces
		Escribir num, " es par"
	SiNo
		Escribir num, " es impar"
	FinSi
	
FinAlgoritmo
