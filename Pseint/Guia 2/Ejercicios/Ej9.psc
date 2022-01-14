///Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una 'A'  
///Si la primera letra es una 'A', se deberá de imprimir un mensaje por pantalla que  diga  "CORRECTO",  
///en  caso  contrario,  se  deberá  imprimir  "INCORRECTO". Nota: investigar la función Subcadena de Pseint

Algoritmo Ej9
	
	Definir pal Como Cadena
	
	Escribir "Ingrese palabra o frase"
	Leer pal
	
	Si (Subcadena(pal,0,0) == "a")Entonces
		
		Escribir "Correcto"
	SiNo
		Escribir "Incorrecto"
		
	FinSi
	
	Escribir Subcadena(pal,0,0) //Para saber que caracter estoy eavluando
	
	
FinAlgoritmo
