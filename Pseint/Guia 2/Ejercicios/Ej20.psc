/// 20. Realizar un programa que pida una frase y el programa deber� mostrar la frase con un
/// espacio entre cada letra. La frase se mostrara as�: H o l a. Nota: recordar el
/// funcionamiento de la funci�n Subcadena().
///	NOTA:. En PSeInt, si queremos escribir sin que haya saltos de l�nea, al final de la
///		operaci�n "escribir" escribimos "sin saltar". Por ejemplo:
///			Escribir sin saltar "Hola, "
///			Escribir sin saltar "c�mo est�s?"
///		Imprimir� por pantalla: Hola, c�mo est�s?

Algoritmo Ej20
	
	Definir palabra, conca Como Cadena
	Definir lg, i Como Entero
	
	Escribir "Ingrese una palabra"
	Leer palabra
	lg = Longitud(palabra)
	
	Para i=0 Hasta lg-1 Con Paso 1 Hacer //(lg-1) xq la fnc subcadena va desde 0 a (n-1)
		conca = Concatenar(Subcadena(palabra,i,i)," ") //voy extrayendo cada caracter y le concateno el espacio
		Escribir sin saltar conca
	Fin Para
	
	Escribir ""
FinAlgoritmo
