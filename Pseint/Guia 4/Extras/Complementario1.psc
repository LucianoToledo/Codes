////1. "Salida de un laberinto": Se trata de encontrar un camino que nos permita salir de un
////	laberinto definido en una matriz NxN. Para movernos por el laberinto, sólo podemos
////	pasar de una casilla a otra que sea adyacente a la primera y no esté marcada como
////	una casilla prohibida (esto es, las casillas prohibidas determinan las paredes que
////	forman el laberinto).
////Algoritmo recursivo:
////		*Se comienza en la casilla (0,0) y se termina en la casilla (N-1, N-1)
////		*Nos movemos a una celda adyacente si esto es posible.
////		*Cuando llegamos a una situación en la que no podemos realizar ningún
////		movimiento que nos lleve a una celda que no hayamos visitado ya,
////		retrocedemos sobre nuestros pasos y buscamos un cam alternativo.
SubProceso mostrarCamino(cam)
	Definir i,j Como entero
	Para i=0 hasta 6 Hacer 
		para j=0 Hasta 6 Hacer
			Escribir Sin Saltar "|", cam[i,j],"|"
		FinPara
		Escribir ""
	FinPara
FinSubProceso

Algoritmo Complementario1
	
	Definir lab,i,j,cont,xx,yy Como entero
	Definir bandFinalizado,band Como Logico
	Definir opc,cam Como Caracter
	
	
	Dimension lab[7,7], cam[7,7]
	
	para i=0 hasta 6
		para j=0 hasta 6
			lab[i,j]=0
		FinPara
	FinPara
	para i=0 hasta 6
		para j=0 hasta 6
			cam[i,j]="?"
		FinPara
	FinPara
	cam[0,0]="1"
	cam[6,6]="2"
	
	lab[0,0]=1
	lab[0,1]=1
	lab[1,1]=1
	lab[2,1]=1
	lab[2,0]=1
	lab[0,1]=1 //
	lab[3,0]=1
	lab[4,0]=1
	lab[4,1]=1//
	lab[4,2]=1
	lab[4,3]=1//
	lab[3,3]=1
	lab[2,3]=1
	lab[1,3]=1//
	lab[1,4]=1
	lab[1,5]=1
	lab[1,6]=1
	lab[2,6]=1//
	lab[3,6]=1
	lab[3,5]=1
	lab[4,5]=1
	lab[5,5]=1//
	lab[6,5]=1
	lab[6,6]=2
	
	i=0
	j=0
	hacer 
		Hacer
			Escribir ""
			Escribir "a,s,d,w"
			Leer opc
			
			Mientras(opc = "s" Y i=6) o (j=6 Y opc = "d")
				Escribir "Posicion invalida, ingrese nuevamente"
				Leer opc
				
			finmientras
			
			Mientras (j=0 Y opc = "a") o (opc="w" Y i=0)
				Escribir "Posicion invalida, ingrese nuevamente"
				Leer opc
			finmientras
			
			Segun opc
				"a": //izquierda
					si lab[i,j-1]=0 Entonces
						Escribir "-----------"
						Escribir "!!!!! Pared ¡¡¡¡¡¡"
						Escribir ""
					SiNo
						Escribir ""
						cam[i,j-1]="*"
						j=j-1
					FinSi
				"d": //derecha
					si lab[i,j+1]=0 Entonces
						Escribir "-----------"
						Escribir "!!!!! Pared ¡¡¡¡¡¡"
						Escribir ""
					SiNo
						cam[i,j+1]="*"
						j=j+1
						Escribir "-----------"
					FinSi
				"w": //arriba
					si lab[i-1,j]=0 Entonces
						Escribir "-----------"
						Escribir "!!!!! Pared ¡¡¡¡¡¡"
						Escribir ""
					SiNo
						cam[i-1,j]="*"
						i=i-1
						Escribir "-----------"
						Escribir ""
					FinSi
				"s": //abajo
					si lab[i+1,j]=0 Entonces
						Escribir "-----------"
						Escribir "!!!!! Pared ¡¡¡¡¡¡"
						Escribir ""
					SiNo
						cam[i+1,j]="*"
						i=i+1
						Escribir "-----------"
					FinSi
			FinSegun
			mostrarCamino(cam)
		Mientras Que i <= 6 Y lab[i,j] <> 2 o opc="f"
	Mientras Que j <= 6 Y lab[i,j] <> 2 o opc="f"
	
	si opc="f" Entonces
		Escribir "No has completado el laberinto"
	SiNo
		Escribir "--------------"
		Escribir "Felicidades, terminaste "
	FinSi
	Escribir ""
	Para i=0 hasta 6 Hacer 
		para j=0 Hasta 6 Hacer
			Escribir Sin Saltar "|", lab[i,j],"|"
		FinPara
		Escribir ""
	FinPara
	Escribir "------------"
	
FinAlgoritmo
