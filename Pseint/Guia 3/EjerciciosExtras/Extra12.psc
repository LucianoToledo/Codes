////12. Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta
////		entre las letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a
////		través del Código Ascii.

SubProceso  ascii(caract)
	
	Definir i, aux Como Entero
	Definir abc Como cadena
	Definir bandera Como Logico
	
	abc="abcdefghijklmnopqrstuvwxyz"
	aux=0
	
	Para i=0 Hasta longitud(abc) Hacer
		Si Minusculas(caract)=Subcadena(abc,i,i) Entonces
			aux=i+1
		Finsi
	FinPara
	
	Si aux>=13 Y aux<=20 Entonces
		Escribir "La letra ingresada esta entre M y T, ascii=",aux+64
	SiNo
		Escribir "La letra ingresada no se encuentra entre M y T"
	FinSi
	
FinSubAlgoritmo

Algoritmo Extra12
	
	Definir letra Como Cadena
	
	Escribir "ingrese una letra"
	Leer letra
	
	ascii(letra)	
FinAlgoritmo

//Segun Mayusculas(caract) Hacer
//	"O":
//		i=79
//	"P":
//		i=80
//	"Q":
//		i=81
//	"R":
//		i=82
//	"S":
//		i=83
//	"T":
//		i=84
//	"U":
//		i=85
//	"V":
//		i=86
//	"W":
//		i=87
//	"X":
//		i=88
//	"Y":
//		i=89
//	"Z":
//		i=90
//FinSegun