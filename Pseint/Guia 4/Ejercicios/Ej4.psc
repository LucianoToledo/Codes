////4. Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
////usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el
////valor m�s grande del vector.

Funcion res = maxi(vec,N)
	
	Definir res,i Como Entero
	res=0
	para i=0 hasta N-1 Hacer
		Si vec(i)>=res Entonces
			res=vec(i)
		FinSi
		
	FinPara
	Escribir "El mayor numero es: ",res
FinFuncion

Algoritmo Ej4
	
	Definir vec, i ,N Como Entero
	
	Escribir "Ingrese dimension del vector"
	Leer N	
	Dimension vec(N)
	Escribir "----------------"
	
	Para i=0 hasta (N-1) Hacer
		Escribir "Ingrese un numero, posicion: ",i
		Leer vec(i)
	FinPara
	
	Escribir maxi(vec,N)
	
FinAlgoritmo
