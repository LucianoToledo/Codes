///Escribir un programa que calcule el volumen de un cilindro. Para ello se deberá solicitar
///al usuario que ingrese el radio y la altura. Mostrar el resultado por pantalla.
///volumen = p * radio2 * altura

Algoritmo EjExtra3
	
	Definir rad, h, vol Como Real
	
	Escribir "Ingrese valor del radio"
	Leer rad
	Escribir "Ingrese valor de la altura"
	Leer h
	
	vol = pi*(rad^2)*h
	
	Escribir "El volumen del cilindro es ", vol, " m3"
	
FinAlgoritmo
