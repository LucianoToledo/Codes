SubProceso relleno(matriz Por Referencia, n, muestra)
	Definir i,j,aux Como Entero
	aux=n //se inicializa una variable aux que almacena la dimension de la matriz
	para i=0 hasta n-1 Hacer
        si i=0 Entonces//almacena en la primera fila de la matriz 
            para j=0 hasta n-1 Hacer
                matriz[i,j]= subcadena(muestra,j,j) 
            FinPara
        SiNo//almacena el resto de filas
		para j=0 hasta n-1 Hacer
			matriz[i,j]= subcadena(muestra,j+aux,j+aux) //aumento el indice de los caracteres que extraigo,sino se guardan siempre los mismos
		FinPara
		aux=aux+n
	FinSi
FinPara
FinSubProceso

SubProceso validacion(matriz Por referencia, n)
	Definir i,j,k Como Entero
	Definir pivote1, pivote2 Como Caracter
	Definir band1, band2 Como Logico
	band1=Verdadero
	band2=Verdadero
	
	pivote1 = matriz[0,0] //almaceno el primer elemento de la diagonal de izq a der
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			Si i=j Y matriz[i,j]<>pivote1 Entonces
				band1=falso
			FinSi
		FinPara
	FinPara
	
	k=n-1
	pivote2 = matriz[0,n-1] //almaceno el primer elemento de la diagonal de der a izq
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			Si matriz[i,k]<>pivote2 Entonces
				band2=falso
			FinSi
		FinPara
		k=k-1 //voy restando K para disminuir una columna en cada iteracion
	FinPara
	
	si band1 Y band2 Entonces
		Escribir "Muestra Valida"//variable de salida
	SiNo
		Escribir "Muestra No Valida"//variable de salida
	FinSi
	
FinSubProceso

Algoritmo ToledoLuciano
	
	Definir n,i,j, cont, contAux Como Entero
	Definir muestra,matrizMuestra,carc Como Cadena
	Definir band Como Logico
	band=falso
	cont=0
	contAux=0
	
	Hacer
		Si cont>=1 Entonces //No se ejecuta en la primera iteracion del bucle
			Escribir "Muestra no valida, ingrese nuevamente"//variable de salida
		FinSi
		cont=cont+1
		Escribir "Ingrese muestra"
		Leer muestra //variable de entrada
	Mientras Que Longitud(muestra)<>9 Y Longitud(muestra)<>16 Y Longitud(muestra)<>1369
	
	
	n=raiz(Longitud(muestra))
	Dimension matrizMuestra[n,n]
	
	relleno(matrizMuestra,n,muestra)
	validacion(matrizMuestra,n)
	
	
	Para i=0 hasta n-1 Hacer //variable de salida, muestra la matriz
        para j=0 hasta n-1 Hacer
            escribir sin saltar "[", matrizMuestra(i,j), "]"
        FinPara
        escribir " "
    FinPara
FinAlgoritmo
