////17. Implemente de forma recursiva una función que le dé la vuelta a una cadena de
////caracteres. NOTA: Si la cadena es un palíndromo, la cadena y su inversa coincidirán.
Funcion inver= inverso(pal)
	Definir inver,aux2 Como cadena
	Definir aux Como Caracter
	Definir i Como Entero
	i=Longitud(pal)
	
	si i=1 Entonces
		inver = pal
	SiNo
		i=i-1
		aux = subcadena(pal,i,i) //extraigo el ultimo caracter
		aux2=subcadena(pal,0,i-1) //guardo en aux2 el resto de la palabra
		inver = Concatenar(aux,inverso(aux2)) //concateno el ultimo caracter con el caracter anterior
	FinSi
FinFuncion

Algoritmo Extra17
	Definir palabra Como Cadena
	Escribir "Ingrese una palabra"
	Leer palabra
	Escribir inverso(palabra)
FinAlgoritmo
