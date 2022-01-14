////5. Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
////	numero es primo o no. Un número es primo cuando es divisible sólo por 1 y por sí
////mismo, por ejemplo: 2, 3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD

Funcion primo = esPrimo(n)
	
	Definir i,j Como Entero
	Definir primo Como Logico
	i=n
	j=0
	
	Mientras i<>0 Hacer
		Si n mod i = 0 Entonces
			j=j+1 
		FinSi
		i=i-1
	FinMientras
	
	Si j=2 Entonces 
		primo = Verdadero //En los casos que sea divisible por 1 o por si mismo va a sumar, por lo que si j=2 es primo
	SiNo
		primo = falso //si j<>2 significa que es divisible por mas de un numero, por lo que n no va a ser primo
	FinSi
	
FinFuncion

Algoritmo Ej5
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero"
	Leer num
	
	Si esPrimo(num)=Verdadero Entonces
		Escribir "El numero ingresado ingresado es primo"
	SiNo
		Escribir "El numero ingresado ingresado no es primo"
	FinSi
	
FinAlgoritmo
