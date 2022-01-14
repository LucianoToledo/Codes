////7. Crear un programa que ordene un vector lleno de números enteros aleatorios, de menor
////a mayor. Nota: investigar el ordenamiento burbuja

Algoritmo Extra7
	
	Definir vec,vecAux,i,j,n,temp Como entero
	
	Escribir "Ingrese dimension del vector"
	leer n
	Dimension vec[n]
	Dimension vecAux[n]
	
	Para i=0 Hasta n-1 Hacer
		vec[i]=azar(20)
		vecAux[i]=vec[i] //lo guardo aca para poder mostrar como se creo el vector
	FinPara
	
	para i=0 hasta n-2 Hacer
		para j=0 Hasta n-2 Hacer
			si vec[j]>vec[j+1] Entonces //ordenamiento burbuja de menor a mayor
				temp=vec[j] 
				vec[j]=vec[j+1] 
				vec[j+1]=temp
			FinSi
		FinPara
	FinPara
	
	Escribir "Vector original"
	Para i=0 Hasta n-1 Hacer
		Escribir Sin Saltar  " | " vecAux[i]
	FinPara
	Escribir" |" 
	Escribir ""
	
	Escribir "Vector ordenado"
	Para i=0 Hasta n-1 Hacer
		Escribir Sin Saltar  " | " vec[i]
	FinPara
	Escribir" |" 
	Escribir ""
	
FinAlgoritmo
