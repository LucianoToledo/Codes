////23. Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
////m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
////recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
////compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
////vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
////deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
////vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
////cada venta.

Algoritmo Ej23
	
	Definir vendedores, i ,j Como Entero
	Definir comision, sueldo, base, venta, sumaVenta, nventa, contVenta, sueldoTotal Como Real
	
	Escribir "Ingrese cantidad de vendedores"
	Leer vendedores

	sumaVenta=0
	contVenta=0
	sueldoTotal = 0
	
	Para i=1 Hasta vendedores Hacer
		Escribir "Ingrese la cantidad de ventas realizadas por el vendedor ", i
		Leer nventa
		Escribir "Ingrese sueldo base"
		Leer base
		Para j=1 hasta nventa Hacer
			Escribir "Ingrese monto de la venta ", j
			Leer venta
			sumaVenta= sumaVenta+venta
			contVenta = contVenta+1
		FinPara
		
		sueldo = base+sumaVenta*0.1
		
		Escribir "El vendedor ", i," Hizo un total de ", contVenta," ventas con un total de $", sumaVenta
		Escribir "Sueldo base $" ,base
		Escribir "Comisiones: $",sumaVenta*0.1
		Escribir "Sueldo total $", sueldo
		Escribir "--------------------------"
		sueldoTotal = sueldoTotal+sueldo
		
	FinPara
	
	Escribir "Se deber� pagar un total de $", sueldoTotal, " en sueldos"
	
FinAlgoritmo
