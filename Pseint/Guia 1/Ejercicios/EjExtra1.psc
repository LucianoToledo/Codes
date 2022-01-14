///Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el
///curso actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el
///porcentaje puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que
///ingrese la cantidad total de niños, y la cantidad total de niñas que hay en el curso.

Algoritmo EjExtra1
	
	Definir ninos, ninas, total Como Entero
	Definir porcNo, porcNa Como Real
	
	Escribir "Ingrese la cantidad de niños"
	Leer ninos
	Escribir "Ingrese la cantidad de niñas"
	Leer ninas
	
	total = ninos+ninas
	
	porcNo = (ninos*100)/total 
	porcNa = (ninas*100)/total 
	
	Escribir "En el curso hay ",ninas, " niñas y ",ninos," niños"
	Escribir "El ",porcNa,"% de alumnos son niñas y el ",porcNo, "%de alumnos son niños"
	
FinAlgoritmo
