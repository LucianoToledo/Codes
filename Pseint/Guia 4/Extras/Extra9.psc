////9. Programe una función que calcule el producto de un arreglo de números enteros. Para
////	esto imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los
////	valores es igual a (V[1]*V[2]*V[3]*V[4]

Funcion r=multi(v,n)
	Definir r,i Como entero
	r=1
	
	para i=0 Hasta n-1 Hacer
		r=r*v[i]
	FinPara
	
FinFuncion

Algoritmo Extra9
	
	Definir n,i,vec Como Entero
	
	Escribir "Ingrese dimension del vector"
	Leer n
	
	Dimension vec[n]
	
	para i=0 Hasta n-1 Hacer
		vec[i]=azar(10)
	FinPara
	
	Escribir "El producto de los elementos del vector es ", multi(vec,n)
	
	Para i=0 Hasta n-1 Hacer
		Escribir Sin Saltar  " | " vec(i)
	FinPara
	Escribir" |" 
	Escribir ""
FinAlgoritmo
