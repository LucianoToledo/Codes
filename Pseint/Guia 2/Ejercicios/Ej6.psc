///Realizar  un  programa  que  pida introducir  solo  frases  o  palabras  de  6 caracteres. 
///Si  el usuario ingresa una frase o palabrade 6 caracteresse deber� de imprimir un mensaje por   pantalla   que   diga   "CORRECTO", 
///en   caso   contrario,  se   deber�   imprimir "INCORRECTO". Nota:investigar la funci�n Longitud() de Pseint.

Algoritmo Ej6
	
	Definir frase Como Cadena
	
	Escribir "Ingrese una palabra o frase de 6 caracteres"
	Leer frase
	
	Si (Longitud(frase) = 6 ) Entonces
		Escribir "Correcto"
	SiNo
		Escribir "Incorrecto"
	FinSi
	
FinAlgoritmo
