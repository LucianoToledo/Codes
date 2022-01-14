///Escriba un programa PSeInt que acepte la identificación de un empleado, el total de horas trabajadas de un mes
///y la cantidad que recibió por hora. Imprima la identificación y el salario del empleado de un mes en particular.
SubAlgoritmo sueldo()
	
	Definir hs, pagaHs Como Entero
	definir s Como Real
	pagaHs = 150
	
	Escribir "Ingrese cantidad de horas trabajadas"
	Leer hs	
	
	s = hs*pagaHs
	Escribir "Ha trabajado ", hs, " horas"
	Escribir " Sueldo mensual: ",s
	
FinSubAlgoritmo

Algoritmo EjInternet
	
	Definir id Como Entero
		
	Escribir "Ingrese id"
	Leer id
	
	Segun id Hacer
		1:
			Escribir "lisandro"
			sueldo()
		2:
			Escribir "cristian"
			sueldo()
		3:
			Escribir "dante"
			sueldo()
		4:
			Escribir "luciano"
			sueldo()
		5:
			Escribir " barbara	"
			sueldo()
		6:
			Escribir " belen "
			sueldo()
			
		De Otro Modo:
			Escribir "Empelado no encontrado"
	Fin Segun
	
FinAlgoritmo

