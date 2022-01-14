///Continuando el ejercicio anterior, ahora se pedirá una frase o palabra y se validara 
///si la primera letra de la frase es igual a la ultima letra de la frase. 
///Se deberá de imprimir un mensaje  por  pantalla  que diga  "CORRECTO",  en  caso  contrario,  se  deberá  imprimir "INCORRECT 

Algoritmo Ej10
	
	Definir pal Como Cadena
	Definir lg Como Entero
	
	Escribir "Ingrese palabra o frase"
	Leer pal
	
	lg = Longitud(pal)

	
	Si (Subcadena(pal,0,0) == Subcadena(pal,lg-1,lg-1))Entonces
		
		Escribir "Correcto"
	SiNo
		Escribir "Incorrecto"
		
	FinSi
	
	Escribir ""
	Escribir "Longitud: ", lg //muestra la long de la palabra
	Escribir "Primer caracter: ",Subcadena(pal,0,0) //primer caracter
	Escribir "ultimo caracter ",Subcadena(pal,lg-1,lg-1) //ultimo caracter
	
FinAlgoritmo
