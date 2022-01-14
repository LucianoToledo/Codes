////6. Crear una función que devuelva la diferencia que hay entre el valor más chico de un
////arreglo y su valor más grande.

Funcion resultado=diferencia(vec,n)
	Definir resultado,i,max,min Como Entero
	min=100
	max=0
	para i=0 hasta n-1 Hacer
		si vec[i]>=max Entonces
			max=vec[i]
		FinSi
		
		si vec[i]<=min Entonces
			min=vec[i]
		FinSi
	FinPara
	
	Escribir "max ", max
	Escribir "min ",min
	resultado=max-min
FinFuncion

Algoritmo Extra6
	Definir vec,i,n Como Entero
	Escribir "Ingrese dimension del vector"
	Leer n
	Dimension vec[n]
	
	Para i=0 Hasta n-1 Hacer
		vec[i]=azar(100)
	FinPara
	
	Escribir diferencia(vec,n)
	
	Para i=0 Hasta n-1 Hacer
		Escribir Sin Saltar  " | " vec(i)
	FinPara
	Escribir" |" 
	Escribir ""
FinAlgoritmo
