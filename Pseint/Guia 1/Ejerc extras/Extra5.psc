///Pedir al usuario que ingrese un n�mero, luego mostrar por pantalla un n�mero aleatorio con
///un mensaje "SU NUMERO DE SORTEO ES". Condici�n, el numero aleatorio a mostrar DEBE
///estar entre el triple del n�mero ingresado por el usuario y el valor m�ximo puede ser hasta el
///qu�ntuple del n�mero ingresado por el usuario

Algoritmo Extra5
	
	Definir num, aleat Como Entero
	
	
	Escribir "Ingrese un numero del 1 al 100"
	Leer num
	
	aleat=Aleatorio(num*3,num*5) //no hace falta hacer una variable para guardar el Aleatorio, 
								//se puede hacer directamente en el Escribir 
	
	Escribir "El numero ingresado es: ", num
	Escribir "Su numero de sorteo es: ", aleat
	Escribir ""
	
FinAlgoritmo
