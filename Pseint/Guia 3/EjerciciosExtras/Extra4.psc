////4. Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea
////calcular el jornal diario de acuerdo con las siguientes reglas:
////	a) La tarifa de las horas diurnas es de $ 90
////	b) La tarifa de las horas nocturnas es de $ 125
////	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y
////		en un 15% si el turno es nocturno.
////		El programa debe solicitar la siguiente información al usuario: el nombre del
////		trabajador, el día de la semana, el turno (diurno o nocturno) y la cantidad de horas
////		trabajadas. Además, debemos preguntarle al usuario si el día de la semana (lunes,
////		martes, miércoles, etc.) era festivo o no, para poder calcular el jornal diario. Utilice
////		una función para realizar el cálculo

Funcion calculoJornal=jornal(tn,d,h,bandera)
	Definir calculoJornal, salario Como Real
	
	Si bandera=Verdadero Entonces
		Si Mayusculas(tn)="D" Entonces
			calculoJornal=h*90*1.1
		SiNo
			Si Mayusculas(tn)="N" Entonces
				calculoJornal=h*125*1.15
			FinSi
		FinSi
	SiNo
		Si Mayusculas(tn)="D" Entonces
			calculoJornal=h*90
		SiNo
			Si Mayusculas(tn)="N" Entonces
				calculoJornal=h*125
			FinSi
		FinSi
	FinSi
FinFuncion

Algoritmo Extra4
	
	Definir nombre, dia Como Cadena
	Definir turno, festivo Como Caracter
	Definir hs Como Entero
	Definir banderaFestivo Como Logico
	Escribir "Ingrese nombre"
	Leer nombre
	Escribir "Ingrese turno (D para diurni y N para Nocturno)"
	Leer turno
	Escribir "Ingrese dia y horas trabajadas"
	Leer dia, hs
	
	Escribir "¿El dia ", dia, " era festivo? (S/N)" 
	Leer festivo
	
	Si Mayusculas(festivo) = "S" Entonces
		banderaFestivo=Verdadero
	SiNo
		banderaFestivo=Falso
	FinSi
	
	Escribir "EL jornal del dia ", dia," de ",nombre," es ",jornal(turno,dia,hs,banderaFestivo)
	
FinAlgoritmo
