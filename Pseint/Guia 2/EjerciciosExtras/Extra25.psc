////25. Siguiendo el ejercicio 20 de los ejercicios principales, ahora deberemos hacer lo mismo
////pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola,
////deberemos mostrar a l o H.

Algoritmo Extra25
	
	Definir palabra, conca Como Cadena
	Definir lg, i Como Entero
	
	Escribir "Ingrese una palabra"
	Leer palabra
	lg = Longitud(palabra)
	
	Para i=lg Hasta 0 Con Paso -1 Hacer //parte desde la longitud de la palabra hasta 0
		conca = Concatenar(Subcadena(palabra,i,i)," ") //voy extrayendo cada caracter y le concateno el espacio
		Escribir sin saltar conca
	Fin Para
	
	Escribir ""
	
FinAlgoritmo
