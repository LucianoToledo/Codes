////3. Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
////usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a
////buscar tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n
////donde se encuentra el valor. En caso que el n�mero se encuentre repetido dentro del
////arreglo se deben imprimir todas las posiciones donde se encuentra ese valor.
////Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar
////un mensaje.

Algoritmo Ej3
	
	Definir vec, i,N,nBuscado,cont Como Entero
	
	Escribir "Ingrese dimension del vector"
	Leer N
	
	Dimension vec(N)
	Escribir "----------------"
	
	Para i=0 hasta (N-1) Hacer
		Escribir "Ingrese un numero, posicion: ",i
		Leer vec(i)
	FinPara
	
	Escribir ""
	Escribir "----------------"
	Escribir "Ingrese numero a buscar en el vector"
	Leer nBuscado
	Escribir ""
	
	cont=0
	Para i=0 hasta (N-1) Hacer
		si vec(i)=nBuscado Entonces
			cont=cont+1
			Escribir "Se encontro el numero en la posicion ",i
		FinSi
	FinPara
	Escribir ""
	
	Si cont=0 Entonces
		Escribir "El numero ingresado no se encontro"
	SiNo
		Escribir "El numero se encontro ", cont, " veces"
	FinSi

	

FinAlgoritmo
