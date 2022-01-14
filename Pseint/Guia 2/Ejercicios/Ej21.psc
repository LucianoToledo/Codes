////21. Un docente de Programación tiene un listado de 3 notas registradas por cada uno de estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
////Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de sus estudiantes:
////	**Nota promedio final de los estudiantes que reprobaron el curso. 
///                Un estudiante reprueba el curso si tiene una nota final inferior a 6.5
////	**Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
////    **La mayor nota obtenida en las exposiciones.
////	**Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
////El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno
////pedirá las 3 notas y calculará todos informes claves que requiere el docente. 

////	Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el ejercicio.
////	No hacer todos al mismo tiempo y después probar

Algoritmo Ej21
	
	Definir estudiantes, inte, expo, parc,i, cRepro, cParc, cInte, nMax Como Entero
	Definir nFinal, nGlRepro,nGlApro, porcExpo,promRepro Como Real
	
	
	cInte=0 //contador de los que aprobaron los integradores
	cRepro=0 //contador de los que reprobraron el curso
	cParc=0 //contador de los que dejaron regular el parcial
	nMax=0
	nGlRepro=0
	
	Escribir "Ingrese cantidad de alumnos"
	Leer estudiantes
	
	Para i=1 Hasta estudiantes Hacer
		
		Escribir "Notas del estudiante ",i
		Escribir "Ingrese nota del integrador, expo, parcial"
		leer inte, expo, parc
		
		nFinal=inte*0.35+expo*0.25+parc*0.4
		Escribir "La nota final del alumno ",i, " Es ",nFinal
		
		Escribir "--------------------"
		
		Si nFinal < 6.5 Entonces
			cRepro=cRepro+1
			nGlRepro=nGlRepro+nFinal
		FinSi
		
		Si cRepro=0 Entonces
			cRepro=1
		FinSi
		promRepro=(nGlRepro)/cRepro
		
		Si expo > 7.5 Entonces
			cInte = cInte+1
		FinSi
		
		porcExpo=(cInte*100)/estudiantes
		
		Si (expo > nMax) Entonces
			nMax=Expo
		Fin si
		
		Si parc >=4 Y parc <7.5 Entonces
			cParc = cParc+1 
		FinSi
		
	FinPara
	
	Escribir "La nota promedio final de los que reprobaron el curso es ", promRepro
	Escribir "El % de los que tienen los integradores aprobados es ", porcExpo
	Escribir "La mayor nota de las expo es ", nMax
	Escribir "La cantidad de estudiantes con el parcial regular es ", cParc
FinAlgoritmo
