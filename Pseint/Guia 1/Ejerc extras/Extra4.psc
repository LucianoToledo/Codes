///Pedir al usuario que ingrese un número, luego mostrar por pantalla un número aleatorio con
///un mensaje "SU NUMERO DE SORTEO ES". Condición, el numero aleatorio a mostrar NUNCA
///podrá ser mayor al ingresado por el usuario.

Algoritmo Extra4
	
	Definir num, aleat Como Entero
	

		Escribir "Ingrese un numero del 1 al 100"
		Leer num
		
		aleat=Aleatorio(0,num)
		
		///aleat = azar(num)
		
		Escribir "El numero ingresado es: ", num
		Escribir "Su numero de sorteo es: ", aleat
		Escribir ""
		
		//Si num == aleat Entonces
			//Escribir "Felicidades has ganado el sorteo"
		//SiNo
			//Escribir "No has ganado el sorteo"
		//Fin Si
	
	
FinAlgoritmo
