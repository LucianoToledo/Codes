///Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el
///curso actual. Dise�ar un algoritmo para este prop�sito. Recuerda que para calcular el
///porcentaje puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que
///ingrese la cantidad total de ni�os, y la cantidad total de ni�as que hay en el curso.

Algoritmo EjExtra1
	
	Definir ninos, ninas, total Como Entero
	Definir porcNo, porcNa Como Real
	
	Escribir "Ingrese la cantidad de ni�os"
	Leer ninos
	Escribir "Ingrese la cantidad de ni�as"
	Leer ninas
	
	total = ninos+ninas
	
	porcNo = (ninos*100)/total 
	porcNa = (ninas*100)/total 
	
	Escribir "En el curso hay ",ninas, " ni�as y ",ninos," ni�os"
	Escribir "El ",porcNa,"% de alumnos son ni�as y el ",porcNo, "%de alumnos son ni�os"
	
FinAlgoritmo
