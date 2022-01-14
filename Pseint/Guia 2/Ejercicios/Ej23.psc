////23. Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
////múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
////recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
////compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
////vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
////deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
////vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
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
	
	Escribir "Se deberá pagar un total de $", sueldoTotal, " en sueldos"
	
FinAlgoritmo
