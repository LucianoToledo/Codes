////5. Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer
////hasta que ingrese la opción Salir:
////	a. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria usando la función Aleatorio(valorMin, valorMax) de PseInt.
////	b. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
////	c. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento a elemento. Ejemplo: C = A + B
////	d. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a elemento. Ejemplo: C = B - A
////	e. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar:Vector A, B, o C.
////	f.Salir.
////NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La
////longitud para todos los vectores debe ser la misma, por lo tanto, esa información sólo se
////solicitará una vez.

Algoritmo Ej5
	
	Definir vecA, vecB, vecC, i, N,cont Como Entero
	Definir opc Como Caracter
	Definir bA, bB Como Logico
	cont=0
	opc="a" //inicializo la variable
	bA=Falso
	bB=falso
	
	Mientras Mayusculas(opc)<>"F" Hacer
		cont=cont+1
		Si cont=1 Entonces //para que se ejecute solo la primer vuelta
			Escribir "Ingrese tamaño del vector"
			Leer N
		FinSi
		
		Escribir "----------------------"
		Escribir "Seleccione opcion"
		Escribir "a. Llenar Vector A"
		Escribir "b. Llenar Vector B"
		Escribir "c. Llenar Vector C con la suma de los vectores A y B."
		Escribir "d. Llenar Vector C con la resta de los vectores B y A. "
		Escribir "e. Mostrar."
		Escribir "f. Salir."
		Leer opc
		Escribir "--------------------"
		
		Segun Mayusculas(opc) Hacer
			"A":
				Dimension vecA(N)
				Para i=0 Hasta N-1 Hacer
					vecA(i)=Aleatorio(-100,100)
				FinPara
				Escribir "Vector A llenado"
				Escribir "---------------"
				bA=Verdadero
			"B":
				Dimension vecB(N)
				Para i=0 Hasta N-1 Hacer
					vecB(i)=Aleatorio(-100,100)
				FinPara
				Escribir "Vector B llenado"
				Escribir "---------------"
				bB=Verdadero
			"C":
				Si bA=Falso Y bB= Falso Entonces
					Escribir "Los vectores A y B se encuentan vacios"
				SiNo
					si bB=Falso Entonces
						Escribir "El vector B se encuentra vacio"
					SiNo
						Si bA=Falso Entonces
							Escribir "El vector A se encuentra vacio"
						FinSi
					FinSi
				FinSi
				
				Si bA=Verdadero Y bB=verdadero Entonces
					Dimension vecC(N)
					Para i=0 Hasta N-1 Hacer
						vecC(i)=vecA(i)+vecB(i)
					FinPara
					Escribir "Vector C llenado"
					Escribir "---------------"
				FinSi
			"D":
				Si bA=Falso Y bB= Falso Entonces
					Escribir "Los vectores A y B se encuentan vacios"
				SiNo
					si bB=Falso Entonces
						Escribir "El vector B se encuentra vacio"
					SiNo
						Si bA=Falso Entonces
							Escribir "El vector A se encuentra vacio"
						FinSi
					FinSi
				FinSi
				Si bA=Verdadero Y bB=verdadero Entonces
					Dimension vecC(N)
					Para i=0 Hasta N-1 Hacer
						vecC(i)=vecB(i)-vecA(i)
					FinPara
				FinSi
			"E":
				Escribir "------------"
				Escribir "Mostrar vecto A, B o C"
				Leer opc
				Segun Mayusculas(opc) Hacer
					"A":
						Para i=0 Hasta N-1 Hacer
							Escribir Sin Saltar  " | ",vecA(i)
						FinPara
					"B":
						Para i=0 Hasta N-1 Hacer
							Escribir Sin Saltar  " | ",vecB(i)
						FinPara
					"C":
						Para i=0 Hasta N-1 Hacer
							Escribir Sin Saltar  " | ",vecC(i)
						FinPara
				FinSegun
		FinSegun
	FinMientras
FinAlgoritmo
