////Una verdulería ofrece las manzanas con descuento según la siguiente tabla
////		nº de kg comprados / %desceunto
////		0-2				   /  0%
////		2.01-5			   /  10%
////		5.01 - 10		   /  15%
////		10.10 en adelante  /  20%
////Determinar cuánto pagará una persona que compre manzanas en esa verdulería

Algoritmo Extra10
	
	Definir kg, totDsc, precio, dsc, total Como Real
	
	Escribir "Ingrese kg de manzanas a comprar"
	Leer kg
	Escribir "Ingrese precio del kg de manzana"
	Leer precio
	
	Si kg<=2 Y kg>=0 Entonces
		dsc = 0.0
		totDsc=kg*precio
		total=kg*precio
	SiNo
		Si kg<=5 Y kg>2 Entonces
			dsc = 0.1 //solo almacena el valor del descuento para despues mostrarlo en pantalla
			totDsc=kg*precio*0.9 //total con descuento
			total=kg*precio //total sin descuento
		SiNo
			Si kg<=10 Y kg>5 Entonces
				dsc = 0.15 
				totDsc=kg*precio*0.85
				total=kg*precio
			SiNo
				Si kg>10 Entonces
					dsc = 0.20
					totDsc=kg*precio*0.80
					total=kg*precio
				FinSi
			FinSi
		FinSi
	FinSi
	
	
	Escribir ""
	Escribir "El precio por kg de manzana es: $", precio
	Escribir "Cantidad de kg de manzanas a comprar: ", kg " kg"
	Escribir "Descuento obtenido: ", dsc, " %"  
	Escribir "Total: $", total
	Escribir "Total con descuento: $", totDsc
FinAlgoritmo
