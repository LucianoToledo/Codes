////22. Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree
////un cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del
////cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:
////		* * * *
////		*     *
////		*     *
////		* * * *
////	Nota: Recordar el uso del escribir sin saltar en Pseint.

Algoritmo Ej22
	
	Definir paso1, paso2, nro Como Entero
	Escribir "Ingrese un numero mayor a 2: "
	Leer nro
	
	Si nro > 2 Entonces
		Para paso1 <- 1 hasta nro Hacer // base superior
			Escribir Sin Saltar " * "
		FinPara
		Escribir "   "
		
		Para paso1 <- 1 hasta nro-2 Hacer //lados menos 2 para que no se cuenten las bases sup e inf
			Escribir Sin Saltar " * "
			Para paso2 <- 1 hasta nro-2 Hacer
				Escribir Sin Saltar "   " //los espacios del medio menos 2 para que no tomen los ladoz izq y derecho
			FinPara
			Escribir " * "
		FinPara
		
		Para paso2 <- 1 hasta nro Hacer //base inferior
			Escribir Sin Saltar " * "
		FinPara
		Escribir Sin Saltar "   "
	SiNo
		Escribir "Ingrese un numero mayor a 2"
	FinSi
	
FinAlgoritmo
