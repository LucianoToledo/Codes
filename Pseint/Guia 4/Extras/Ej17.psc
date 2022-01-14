////17. Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina
////ofreciendo sus productos. Para tareas administrativas el país está dividido en cinco
////zonas: Norte, Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene
////	distintas estadísticas sobre el comportamiento de sus representantes en cada zona. Se
////	desea hacer un programa que lea el monto de las ventas de los representantes en cada
////	zona y calcule luego:
////	a) el total de ventas de una zona introducida por teclado
////	b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
////	c) el total de ventas de todos los representantes.
Funcion R=repre(aux,tabla)
	Definir R,i,j Como Entero
	R=0
	para i=aux hasta aux Hacer
		para j=1 hasta 5 Hacer
			R=R+ConvertirANumero(tabla[aux,j])
		FinPara
	FinPara
FinFuncion

Funcion R=calculo(aux,tabla)
	Definir R,i,j Como Entero
	R=0
	Para i=1 Hasta 5 Hacer//total zona
		para j=1 Hasta 5 Hacer
			si j=aux Entonces 
				R=R+ConvertirANumero(tabla[i,aux])
			FinSi
		fin para	
	fin para
FinFuncion

Algoritmo Ej17
	
	Definir i,j,tot,aux Como Entero
	Definir tabla como cadena	
	Definir opc, opcZ como caracter
	
	Dimension tabla[6,7]
	
	Para i=1 Hasta 4 Hacer
		para j=1 Hasta 5 Hacer
			tabla[i,j]=ConvertirATexto(azar(20))
		FinPara
	FinPara
	para i=0 hasta 5 Hacer
		para j=0 hasta 6 Hacer
			tabla[0,0]="  "
			tabla[1,0]="R1"
			tabla[2,0]="R2"
			tabla[3,0]="R3"
			tabla[4,0]="R4"
			tabla[5,0]="T"
			tabla[5,6]="  "
			tabla[0,1]="N"
			tabla[0,2]="S"
			tabla[0,3]="C"
			tabla[0,4]="E"
			tabla[0,5]="O"
			tabla[0,6]="TOTAL"
		FinPara
	FinPara
	
	Para i=0 hasta 4 Hacer 
		para j=0 Hasta 5 Hacer
			Escribir Sin Saltar "|", tabla[i,j],"|"
		FinPara
		Escribir ""
	FinPara
	
	opc="a" //inicializo la variable
	Mientras Mayusculas(opc)<> "D"
		Escribir "Elija opcion"
		Escribir "a) el total de ventas de una zona "
		Escribir "b) el total de ventas de un vendedor "
		Escribir "c) el total de ventas de todos los representantes. "
		Escribir "d) SALIR"
		leer opc
		Segun Mayusculas(opc) hacer
			"A":
				opcZ="a"
				Mientras Mayusculas(opcZ)<> "F"
					Escribir "Ingrese zona, presione F para salir"
					leer opcZ
					Segun Mayusculas(opcZ) hacer
						"N":
							aux=1
							Escribir "El total de la zona norte es $", calculo(aux,tabla)
						"S":
							aux=2
							Escribir "El total de la zona sur es $", calculo(aux,tabla)
						"C":
							aux=3
							Escribir "El total de la zona centro es $", calculo(aux,tabla)
						"E":
							aux=4
							Escribir "El total de la zona este es $", calculo(aux,tabla)
						"O":
							aux=5
							Escribir "El total de la zona oeste es $", calculo(aux,tabla)
						De Otro Modo:
							Escribir "Zona no encontrada"
					FinSegun
				fin mientras
			"B":
				opcZ="a"
				Mientras Mayusculas(opcZ)<> "F"
					Escribir "Ingrese numero de representante, presione F para salir"
					leer opcZ
					Segun Mayusculas(opcZ) hacer
						"1":
							aux=1
							Escribir "El total de representante 1 es $", repre(aux,tabla)
						"2":
							aux=2
							Escribir "El total de representante 1 es $", repre(aux,tabla)
						"3":
							aux=3
							Escribir "El total de representante 1 es $", repre(aux,tabla)
						"4":
							aux=4
							Escribir "El total de representante 1 es $", repre(aux,tabla)
						De Otro Modo:
							Escribir "Representante no encontrado"
					finsegun
				FinMientras
			"C":
				tot=0
				para i=1 hasta 4 Hacer
					para j=1 hasta 5 Hacer
						tot=tot+ConvertirANumero(tabla[i,j])
					FinPara
				FinPara
			De Otro Modo:
				si Mayusculas(opc)<> "D" Entonces
					Escribir "Opcion no valida, intente otra vez"
				FinSi
		FinSegun
	FinMientras
	
FinAlgoritmo
