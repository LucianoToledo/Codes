////8. Programe una función recursiva que calcule la suma de un arreglo de números enteros.

Funcion r=suma(v,n)
	Definir r,i Como entero
	
	Si n = 1 Entonces
        r = v[n-1] //-1 para que entre en el rango, ej si paso 5, la posicion5 no existe porque seria de 0 a 4
    SiNo
        r = v[n-1] + suma(v, n-1)
    FinSi
	
FinFuncion

Algoritmo Extra8
	
	Definir n,i,vec Como Entero
	
	Escribir "Ingrese dimension del vector"
	Leer n
	
	Dimension vec[n]
	
	para i=0 Hasta n-1 Hacer
		vec[i]=azar(20)
	FinPara
	
	Escribir "la suma de los elementos del vector es ", suma(vec,n)
	
	Para i=0 Hasta n-1 Hacer
		Escribir Sin Saltar  " | " vec(i)
	FinPara
	Escribir" |" 
	Escribir ""
	
FinAlgoritmo
