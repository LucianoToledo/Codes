////4.Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre
////0 y 20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de
////PseInt. Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos
////estudiantes son:
////	a)
////	Deficientes 0-5
////	b)
////	Regulares 6-10
////	c)
////	Buenos 11-15
////	d)
////	Excelentes 16-20

Algoritmo Extra4
	Definir notas, defic, regu, bn, ex,i Como Entero
	
	Dimension notas[100]
	
	defic=0
	regu=0
	bn=0
	ex=0
	
	para i=0 Hasta 99 Hacer
		notas[i]=azar(21)
		
		si notas[i]>=0 Y notas[i]<=5 Entonces
			defic=defic+1
		FinSi
		si notas[i]>=6 Y notas[i]<=10 Entonces
			regu=regu+1
		FinSi
		si notas[i]>=11 Y notas[i]<=15 Entonces
			bn=bn+1
		FinSi
		si notas[i]>=16 Y notas[i]<=20 Entonces
			ex=ex+1
		FinSi
		
	FinPara
	
	Escribir "Alumnos deficientes: ",defic
	Escribir "Alumnos regulares ", regu
	Escribir "Alumnos buenos ", bn
	Escribir "Alumnos excelentes ",ex
	Escribir ""
	
	Para i=0 Hasta 99 Hacer
		Escribir Sin Saltar  " | " notas(i)
	FinPara
	Escribir" |" 
	Escribir ""
FinAlgoritmo
