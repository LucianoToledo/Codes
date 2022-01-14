////6. Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide
////desarrollar un programa que:
////	a. Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra. Ayuda: utilizar la función Subcadena de PSeInt.
////	b. Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una
////	posición dentro del arreglo, y el programa debe intentar ingresar el carácter
////	en la posición indicada, si es que hay lugar (es decir la posición está vacía o
////	es un espacio en blanco). De ser posible debe mostrar el vector con la frase y
////	el carácter ingresado, de lo contrario debe darle un mensaje al usuario de que
////	esa posición estaba ocupada

Algoritmo Ej6
	
	Definir vec,frase Como cadena
	Definir carc Como Caracter
	Definir i, posic, cont Como Entero
	Definir bandera Como Logico
	Dimension vec(20)
	
	Hacer
		Escribir "Ingrese una frase"
		Leer frase
		Si Longitud(frase)<=20 Entonces
			bandera=Verdadero
		Sino
			bandera=falso
			Escribir "Ingrese una frase con 20 caracteres como maximo"
		FinSi
	Mientras Que bandera=falso
	
	Para i=0 hasta 19 Hacer
		vec(i)=Subcadena(frase,i,i)
	FinPara
	
	Escribir "Ingrese un caracter y posicion"
	Leer carc,posic
	cont=0
	
	Para i=0 hasta 19 Hacer
		si i=posic Y (vec(i)="" o vec(i)=" ") Entonces
			vec(i)=carc
			cont=cont+1
		FinSi
	FinPara
	
	si cont=0 Entonces
		Escribir "La posicion esta ocupada"
	FinSi
	
	Escribir ""
	Escribir "La frase resultante es "
	
	Para i=0 Hasta 19 Hacer
		Escribir Sin Saltar  " | " vec(i)
	FinPara
	Escribir" |" 
	Escribir ""
	
//	Para i=0 Hasta 19 Hacer
//		Escribir Sin Saltar  " | " i
//	FinPara
//	Escribir" |" 
//	Escribir ""
	
FinAlgoritmo
