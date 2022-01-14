///A partir de una conocida cantidad de días que el usuario ingresa a través del teclado,
///escriba un programa para convertir los días en horas, en minutos y en segundos. Por
///ejemplo --> 1 día = 24 horas = 1440 minutos = 86400 segundos

Algoritmo EjExtra4
	
	Definir dia, hs , min, seg Como Entero
	
	Escribir "Ingrese cantidad de dias"
	Leer dia
	
	hs = dia*24
	min = dia*1440
	seg = dia*86400
	
	Escribir dia, " dias son equivalente a ",hs," hs, ",min, " minutos, ",seg, " segundos"
FinAlgoritmo
