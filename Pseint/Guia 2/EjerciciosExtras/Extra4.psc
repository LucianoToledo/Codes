////4. La empresa "Te llevo a todos lados" está destinada al alquiler de autos y tiene un sistema
////de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro
////	de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de
////	regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la
////	cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra
////	40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total
////	de $5,20 el minuto de uso. Realice un programa que permita registrar esa información y
////	el total a pagar por el cliente.

Algoritmo Extra4
	
	Definir hs, min Como Entero
	Definir  monto, lt Como Real 
	
	Escribir "Ingrese cantidad de horas utilizadas"
	Leer hs
	Si hs <= 2 Entonces
		monto = 400
	SiNo
		Si hs > 2 Entonces
			Escribir "Ingrese cantidad de litros de nafta gastados"
			Leer lt
			min=(hs*60)
			monto=40*lt+min*5.20
		FinSi
	FinSi
	
	Escribir "El total a pagar es de $", monto
FinAlgoritmo
