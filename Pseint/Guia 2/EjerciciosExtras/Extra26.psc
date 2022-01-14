////26. Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
////invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
////deberá mostrar:
////	*****
////	****
////	***
////	**
////	*

Algoritmo Extra26
	
	Definir num,i,j Como Entero
	
	Escribir "Ingrese un numero"
	Leer num
	
	Para i=1 Hasta num Hacer
		
		Para j=num Hasta 1 Con Paso -1 Hacer //j=num va tomando un numero menos en cada iteracion por la resta num-1
			Escribir Sin Saltar "*" //por ende en cada iteracion va dibujando uno menos
		Fin Para
		
		num=num-1 //va restando 1 al num para que j valga uno menos en cada iteracion
				//Este -1 no afecta al num del primer Para sino que solo al segundo
		Escribir " "
	FinPara
	
	Escribir ""
	
FinAlgoritmo
