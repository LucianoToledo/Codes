///Conocido el n�mero en matem�tica PI, pedir al usuario que ingrese el valor del radio
///de una circunferencia y calcular y mostrar por pantalla el �rea y per�metro. Recuerde que
///para calcular el �rea y el per�metro se utilizan las siguientes f�rmulas: 
///area = PI * radio2
///perimetro = 2 * PI * radio

Algoritmo trabajandoConDatos
	
	Definir area, radio, perimetro Como Real
	
	Escribir "Ingrese valor del radio"
	Leer radio
	
	area = pi * (radio^2)
	perimetro = 2 * pi * radio
	
	Escribir "El area es de: ", area 
	Escribir "El perimetro es: ", perimetro
	
FinAlgoritmo
