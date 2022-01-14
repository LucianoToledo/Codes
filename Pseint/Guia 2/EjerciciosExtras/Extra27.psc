////27. La función factorial se aplica a números enteros positivos. El factorial de un número
////entero positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:
////	n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n
////	Escriba un programa que calcule los factoriales de todos los números enteros desde el
////1 hasta el 5. El programa deberá mostrar la siguiente salida:
////	!1 = 1
////	!2 = 1*2 = 2
////	...
////	!5 = 1*2*3*4*5 = 120

Algoritmo Extra27
	
	Definir i,suma Como Entero
	Definir factorial, aux, fact,aux2 Como Cadena
	
	suma=1
	
	Para i=1 hasta 5 Hacer 
		
		suma=suma*i
		
		Si ((i=2) O (i=1)) Entonces                       //en la 1er vuelta guarda el valor de factorial, solo se ejecuta en la 1er y 2da vuelta
			factorial=Concatenar(ConvertirATexto(i-1),"*") //(i-1)*
		SiNo
			Si (i<>1) Entonces
				factorial=Concatenar(aux2,"*")             // Se ejecuta recien en la tercer vuelta
			FinSi
		FinSi
	
		aux=Concatenar(factorial,ConvertirATexto(i)) //(i-1)*i (en la 1er vuelta)
		aux2=aux //guardo el valor de aux para mandarlo al SI de arriba (linea27)
	
		Si i=1 Entonces
			Escribir "!",i," = ",suma
		SiNo
			Escribir "!",i," = ",aux," = ",suma
			
		FinSi
		
	FinPara

FinAlgoritmo
