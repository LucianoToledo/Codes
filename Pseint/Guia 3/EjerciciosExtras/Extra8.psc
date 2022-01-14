////8. Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
////numero es capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc.
////	No podemos transformar el numero a cadena para realizar el ejercicio

Funcion capi=capicua(n)
	
	Definir capi Como Logico
	Definir a,b,x,i, num Como Entero
	Definir aux Como Real
	num=n //almaceno el valor original para no perderlo en el mientras
	i=0 //contador
	x=1 //aca se almacena parcialmente el numero escrito al revez
	
	si n < 10 Entonces 
		capi=falso //si el numero es de una cifra no es capicua
	SiNo
		Mientras n>=10 
			b= n mod 10 //ultimo digito  -   3 2
			aux = n/10  //12.3  1.2
			n = trunc(aux) //12  1
			i=i+1
			si i=1 Entonces //solo se ejecuta la 1er vuelta
				x=b //3 32
			SiNo
				x=10*x+b //3 32
			FinSi
		FinMientras
		x=10*x+n  //321
	FinSi
	
	Si x=num Entonces
		capi=Verdadero
	SiNo
		capi=falso
	FinSi
FinFuncion


Algoritmo Extra8
	Definir num Como Entero
	
	Escribir "Ingrese numero"
	Leer num
	
	Si capicua(num)=Verdadero Entonces
		Escribir "El numero ingresado es capicua"
	SiNo
		Escribir "El numero ingresado no es capicua"
	FinSi
FinAlgoritmo
