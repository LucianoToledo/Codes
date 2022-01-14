////18. Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
////programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
////todos ellos.

Algoritmo Ej18
	
	Definir num, suma, i, max, min Como Entero
	Definir prom Como Real
	i=-1 //lo inicio en -1 xq para el primer si del Hacer necesito que sea cero (se iniciar en 0 y en el SI poner i=1)
		//ademas la iteracion en la que pongo el 0 tambien suma 1 al contador por lo que iniciarlo asi me ahorra escribir i+1 en el prom
	suma=0
	max=0
	
	Hacer
		Escribir "Ingrese numero"
		Leer num
		suma = suma + num
		i = i+1
	
		si i=0 Entonces //se ejecuta por unica vez para guardar los datos iniciales
			max=num      //Otra forma seria iniciar el max y el min fuera del Hacer  
			min=num
		FinSi
		
		Si (num > max) Entonces
			max=num
		Fin si
		
		Si ((num<min) Y (num <> 0)) Entonces
			min = num
		FinSi
		
	Mientras Que (num <> 0)
	
	prom = suma/i
	
	Escribir ""
	Escribir "la suma de los numeros ingresados es: ", suma
	Escribir "el promedio de los numeros ingresado ses: ", prom
	Escribir "el max de los numeros ingresado es: ", max
	Escribir "la min de los numeros ingresado es: ", min
	
FinAlgoritmo
