///13. Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica
///de tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un per�odo de prueba:
///?		Producir menos de 200 tornillos defectuosos.
///?		Producir m�s de 10000 tornillos sin defectos.
///El grado de eficiencia se determina de la siguiente manera:
///?		Si no cumple ninguna de las condiciones, grado 5.
///?		Si s�lo cumple la primera condici�n, grado 6.
///			Si s�lo cumple la segunda condici�n, grado 7.
///			Si cumple las dos condiciones, grado 8
///	Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el
///	ejercicio. No hacer todos al mismo tiempo y despu�s probar.

Algoritmo Ej13
	
	Definir tnDef, tnBn Como Entero
	Definir b1, b2, b3,b4 Como Logico
	Definir grado Como Cadena
	
	
	Escribir "Ingrese cantidad de tornillos defectuosos"
	Leer tnDef
	
	Escribir "Ingrese cantidad de tornillos sin defectos"
	Leer tnBn
	
	Si (tnDef<= 200 y tnBn>=10000) Entonces 
		grado = "Grado 8, cumple las dos condiciones"
	SiNo
		Si(tnDef<= 200 y tnBn<10000) Entonces 
			grado = "Grado 6, s�lo cumple la primera condici�n,"
		SiNo
			Si(tnDef>200 y tnBn>=10000) Entonces 
				grado = "Grado 7, s�lo cumple la segunda condici�n,"
			SiNo
				grado = "Grado 5, no cumple ninguna"
			FinSi
		FinSi
	FinSi

	Escribir grado
	
FinAlgoritmo
