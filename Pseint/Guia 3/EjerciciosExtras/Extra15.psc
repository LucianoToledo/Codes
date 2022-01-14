////15. Diseñar un procedimiento que reciba una frase, y el programa remueva todas las
////vocales repetidas. Al final el procedimiento mostrará la frase final.

subproceso Vocales (f)
    definir i, long, j, contA, contE,contI,contO,contU Como Entero
    definir letra como caracter
    contA=0
    contE=0
    contI=0
    contO=0
    contU=0
    f=minusculas(f)
    long=longitud(f)
	
    para j=0 hasta long Hacer
        letra= subcadena(f,j,j)
        segun letra Hacer
            "a": contA=contA+1
            "e": contE=contE+1
            "i": contI=contI+1
            "o": contO=contO+1
            "u": contU=contU+1
        FinSegun
    FinPara
    para i=0 hasta long Hacer
        letra= subcadena(f,i,i)
        segun letra Hacer
            "a": si contA=1 Entonces  //si el contador es mayor a 1 no se escribe la letra
                    escribir sin saltar letra
                FinSi
            "e": si contE=1 Entonces
                    escribir sin saltar letra
                FinSi
            "i": si contI=1 Entonces
                    escribir sin saltar letra
                FinSi
            "o": si contO=1 Entonces
                    escribir sin saltar letra
                FinSi
            "u": si contU=1 Entonces
                    escribir sin saltar letra
                FinSi
			De otro modo 
                escribir sin saltar letra
        FinSegun
    FinPara
FinSubProceso

Algoritmo Extra15
	
	Definir frase Como cadena
	
	Escribir "Ingrese frase"
	Leer frase
	
	vocales(frase)
	
FinAlgoritmo

//Para i=0 hasta Longitud(frase) Hacer
//	aux=Subcadena(frase,i,i)
//	
//	Para j=0 hasta Longitud(frase) Hacer
//		si Subcadena(frase,j,j) = aux Entonces
//			frase = concatenar(Subcadena(frase,i,i),"")
//		FinSi
//	FinPara