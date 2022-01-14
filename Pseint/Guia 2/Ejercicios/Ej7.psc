///Realizar  un  programa  que  pida  una  frase o  palabra y  si  la  frase o  palabra es  de  4 caracteres de largo,
///el programa le concatenara un signo de exclamación al final, y si no es  de  4  caracteres  el  programa  le concatenara un  
///signo  de  interrogación  al  final.  El programa  mostrará  después  la  frase  final. 
///Nota:  investigar  la  función  Longitud()  y Concatenar() de Pseint

Algoritmo Ej7
	
	Definir palab, conc Como Cadena
	
	Escribir "Ingrese palabra"
	Leer palab
	
	Si (Longitud(palab)=4) Entonces
		conc = Concatenar(palab,"!")
		Escribir conc 
	SiNo
		conc = Concatenar(palab,"?")
		Escribir conc 
	FinSi
	
FinAlgoritmo
