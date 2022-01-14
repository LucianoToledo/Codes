////8. Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
////	entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000. Obtener
////	la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que
////	compra, y el monto total que tiene que pagar por el total de la compra.

Algoritmo Extra8
	
	Definir llanta Como Entero
	Definir montoUnitario, montoTotal Como Real
	
	Escribir "Ingrese cantidad de llantas a comprar"
	Leer llanta
	
	Si llanta<5 Entonces
		montoUnitario=3000
		montoTotal=llanta*montoUnitario
	SiNo
		Si llanta>=5 Y llanta<10 Entonces
			montoUnitario=2500
			montoTotal=llanta*montoUnitario
		SiNo
			Si llanta>=10 Entonces
				montoUnitario=2000
				montoTotal=llanta*montoUnitario
			FinSi
		FinSi
	FinSi
	
	Escribir ""
	Escribir "Precio por llanta $", montoUnitario
	Escribir "Precio total $", montoTotal
FinAlgoritmo
