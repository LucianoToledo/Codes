////13. Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros
////comience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al
////usuario al comenzar. Ejemplo: si se ingresa el n�mero 3:
////1
////12
////123
SubProceso escalera(n)
	Definir i, aux Como real
	aux=1
	
	para i=1 hasta n Hacer
		si i=1 Entonces
			aux=i
		SiNo
			aux=aux*10+i
		FinSi
		Escribir aux
	FinPara
	
FinSubProceso


Algoritmo Extra13
	
	Definir num Como Entero
	Escribir "Ingrese un numero"
	Leer num
	escalera(num)
FinAlgoritmo
