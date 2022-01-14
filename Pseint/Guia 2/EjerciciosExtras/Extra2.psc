////2. Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
////	10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
////	mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
////	debe cobrar al cliente e imprimirlo por pantalla.

Algoritmo Extra2
	
	Definir mes Como Entero
	Definir monto, montoTotal Como Real
	
	Escribir "Ingrese importe de la compra"
	Leer monto
	Escribir "Ingrese numero de mes"
	Leer mes
	
	Si (mes =9 o mes=10 o mes=11) Entonces
		montoTotal = monto*0.9
		Escribir "El total a pagar es $", montoTotal
	SiNo
		Escribir "El total a pagar es $", monto
	FinSi
	
FinAlgoritmo
