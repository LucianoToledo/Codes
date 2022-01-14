////12. Una empresa tiene personal de distintas áreas con distintas condiciones de
////contratación y formas de pago. El departamento de contabilidad necesita calcular los
////sueldos semanales (lunes a viernes) en base a las 3 modalidades de sueldo:
////	a) comisión
////	b) salario fijo + comisión, y
////	c) salario fijo.

////	a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
////	realizadas en la semana, y el 40% de ese monto total corresponde al salario del
////	empleado.
////	b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
////	hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
////	esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
////	como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
////	del valor de venta total.
////	c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
////	hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
////	horas semanales, las horas extras se deben pagar con un extra del 50% del valor de
////	la hora. Realizar un menú de opciones para poder elegir el tipo de contrato que tiene
////	un empleado.

Algoritmo Extra12
	
	Definir tipo Como caracter
	Definir comision, sueldo, montoVentas, valorHora, valorHoraExtra Como Real
	Definir cantVentas, hs, hsExtras Como Entero
	Definir bandera Como Logico
	
	Escribir "Ingrese tipo de empleado A - B - C"
	Leer tipo
	tipo = Mayusculas(tipo)
	

	Si tipo = "A" Entonces
		Escribir "Ingrese monto total de ventas"
		Leer montoVentas
		comision=montoVentas*0.4
		sueldo = comision
	SiNo
		Si tipo = "B" Entonces
			Escribir "Ingrese paga por hora"
			Leer valorHora
			Escribir "Ingrese cantidad de horas trabajadas en la semana"
			Leer hs
			Mientras hs>40 Hacer
				Escribir "Maximo de horas permitido es 40"
				Escribir "No se permiten horas extras"
				Escribir "Ingrese nuevamente las horas"
				Leer hs
			FinMientras
			Escribir "Ingrese monto total de ventas"
			Leer montoVentas
			comision=montoVentas*0.25
			sueldo = valorHora*hs+comision
		SiNo
			Si tipo = "C" Entonces
				Escribir "Ingrese paga por hora"
				Leer valorHora
				Escribir "Ingrese cantidad de horas trabajadas en la semana"
				Leer hs
				Si hs>40 Entonces
					hsExtras=hs-40
				SiNo
					hsExtras=0
				FinSi
				valorHoraExtra=(valorHora/2)
				Sueldo=(valorHora*hs)+(hsExtras*valorHoraExtra)
				bandera = Verdadero
			FinSi
		FinSi
	FinSi

	Escribir "Tipo de empleado ", tipo
	
	Si bandera= Verdadero Entonces
		Escribir "El valor de la hora extra es: $", valorHoraExtra
		Escribir "Cantidad de horas extras trabajadas: ", hsExtras
	FinSi
	
	Escribir "El sueldo correspondiente es: $", sueldo
FinAlgoritmo
