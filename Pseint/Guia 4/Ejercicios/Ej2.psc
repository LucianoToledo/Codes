////2. Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo
////y muestre por pantalla la suma, resta y multiplicación de todos los números ingresados
////al arreglo.

Algoritmo Ej2
	
	Definir vec, suma, rest, mult Como Real
	Definir i Como Entero
	suma=0
	mult=1
	Dimension vec(10)
	
	Para i=0 Hasta 9 Hacer
		Escribir "Ingrese un numero"
		Leer vec(i)
		
		suma=suma+vec(i)
		
		si i=0 Entonces
			rest=vec(i)
		SiNo
			rest=rest-vec(i)
		FinSi
		mult=mult*vec(i)
	FinPara
	
	Escribir "suma ", suma
	Escribir "resta ", rest
	Escribir "multiplicacion ", mult
	
	Para i=0 Hasta 9 Hacer
		Escribir Sin Saltar  " | " vec(i)
	FinPara
	Escribir" |" 
	Escribir ""
	
FinAlgoritmo
