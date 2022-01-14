/// 20. Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
/// espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
/// funcionamiento de la función Subcadena().
///	NOTA:. En PSeInt, si queremos escribir sin que haya saltos de línea, al final de la
///		operación "escribir" escribimos "sin saltar". Por ejemplo:
///			Escribir sin saltar "Hola, "
///			Escribir sin saltar "cómo estás?"
///		Imprimirá por pantalla: Hola, cómo estás?

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
