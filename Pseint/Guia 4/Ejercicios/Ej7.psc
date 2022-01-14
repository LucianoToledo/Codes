////7. Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios.
////	Después, hacer una función que reciba los dos arreglos y diga si todos sus valores son
////		iguales o no. La función debe devolver el resultado de está validación, para mostrar el
////		mensaje en el algoritmo. Nota: recordar el uso de las variables de tipo lógico.

Funcion bandera=validar(vecA,vecB,N)
	Definir bandera Como Logico
	Definir i, cont Como Entero
	cont=0
	
	Para i=0 Hasta N-1 Hacer
		Si vecA(i)=vecB(i) Entonces
			cont=cont+1
		FinSi
	FinPara
	
	Si cont=N Entonces //si el contador es igual a la dimension significa que los vectores son iguales
		bandera=Verdadero
	SiNo
		bandera=falso
	FinSi
	
	Escribir "Vector A"
	Para i=0 Hasta n-1 Hacer //escribo el vector A
        Escribir Sin Saltar  " | " vecA(i)
    FinPara
    Escribir" |" 
    Escribir ""
	
	Escribir "Vector B"
	Para i=0 Hasta n-1 Hacer//escribo el vector B
        Escribir Sin Saltar  " | " vecB(i)
    FinPara
    Escribir" |" 
    Escribir ""
	
FinFuncion

SubProceso rellenar(vec Por Referencia,N)
	Definir i Como Entero
	Para i=0 hasta N-1 Hacer
		vec(i)=Aleatorio(0,10)
	FinPara
FinSubProceso

Algoritmo Ej7
	
	Definir vec1, vec2, N Como Entero
	
	Escribir "Ingrese dimension"
	Leer N
	Escribir ""
	Dimension vec1(N)
	Dimension vec2(N)
	
	rellenar(vec1, N)
	rellenar(vec2 ,N)
	
	Si  validar(vec1,vec2, N)=Verdadero Entonces
		Escribir "Los vectores son iguales"
	SiNo
		Escribir "Los vectores son diferentes"
	FinSi
	
FinAlgoritmo
