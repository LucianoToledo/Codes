////11. El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de
////las cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
////programa que determine cuál es la nota eliminada y el promedio de los trabajos
////prácticos de un estudiante.

Algoritmo Extra11
	
	Definir nota1, nota2, nota3,nota4, prom, min Como Real
	
	Escribir "Ingrese notas de los TPs"
	Leer nota1, nota2, nota3, nota4
	
	Mientras (nota1 < 0 O nota1 > 10) O (nota2 < 0 O nota2 > 10) O (nota2 < 0 O nota2 > 10) O (nota2 < 0 O nota2 > 10) Hacer
        Escribir "Ingrese notas entre 1 y 10"
        Leer nota1, nota2, nota3, nota4
    FinMientras
	
	Si ((nota1<nota2)Y(nota1<nota3)Y(nota1<nota4)) Entonces
		min=nota1
	SiNo
		Si ((nota2<nota1)Y(nota2<nota3)Y(nota2<nota4)) Entonces
			min=nota2
		SiNo
			Si ((nota3<nota1)Y(nota3<nota2)Y(nota3<nota4)) Entonces
				min=nota3
			SiNo
				Si ((nota4<nota1)Y(nota4<nota2)Y(nota4<nota3)) Entonces
					min=nota4
				FinSi
			FinSi
		FinSi
	FinSi
	
	prom = (nota1+nota2+nota3+nota4-min)/3
	
	Escribir "las notas son :",nota1,", ", nota2,", ", nota3,", ", nota4
	Escribir "El promedio es: ", prom
	Escribir "min ",min
	
FinAlgoritmo
