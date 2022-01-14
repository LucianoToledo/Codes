////6. Leer tres números que denoten una fecha (día, Mes, año) y comprobar que sea una fecha
////válida. Si la fecha no es válida mes =  un mensaje de error por pantalla. Si la fecha es
////		válida se debe imprimir la fecha cambiando el número que representa el Mes por su
////	nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006".

Algoritmo Extra6
	
	Definir dia, nMes  Como Entero
	Definir mes, anio,nAnio Como Cadena
	Definir band Como Logico
	
	Escribir "Ingrese fecha dd/mm/aa" 
	Leer dia, nMes, nAnio
	
	band = Verdadero
	
	
	Si nMes = 2 Entonces
		mes = "febrero"
		Si dia > 28
			band = Falso
		Fin si
	Sino
		Si (nMes = 4) o (nMes = 6) o  (nMes = 9) o (nMes = 11)  Entonces //meses de 30 dias
			Segun nMes Hacer
				4:
					mes =  "Abril"
				6:
					mes =  "Junio"
				9:
					mes =  "Septiembre"
				11:
					mes =  "Noviembre"
				De Otro Modo:
					mes =  "nMes invalido"
					band = Falso
			FinSegun
			Si dia=31  Entonces
				band = Falso
			Fin si
		SiNo
			Segun nMes Hacer
				1:
					mes =  "Enero"
				3:
					mes =  "Marzo"
				5:
					mes =  "Mayo"
				7:
					mes =  "Julio"
				8:
					mes =  "Agosto"
				10:
					mes =  "Octubre"
				12:
					mes =  "Diciembre"
				De Otro Modo:
					mes =  "nMes invalido"
					band = Falso
			FinSegun
		FinSi
	FinSi
	
	Si dia <=0 O dia >=32 Entonces
		band = Falso
	FinSi
	
	Si ConvertirANumero(nAnio) >= 00 Y ConvertirANumero(nAnio)  <= 21 Entonces
		anio= "20"+nAnio
	SiNo
		anio = "19"+nAnio
	FinSi
	
	
	Si band = Verdadero Entonces
		Escribir  dia, " de ", Mes , " de ", anio
	SiNo
		Escribir "Fecha invalida" 
	FinSi
	
	
	
FinAlgoritmo
