////20. Hacer un algoritmo para calcular la media de los números pares e impares, sólo se
////		ingresará diez números

Algoritmo Extra20
	
	Definir num,sumaPares, sumaImpares, cPar, cImpar,i Como Entero
	Definir mediaPar, mediaImpar Como Real
	
	sumaImpares=0
	sumaPares=0
	i=0
	cPar=0
	cImpar=0
	Hacer
		Escribir "Ingrese numero"
		Leer num
		i=i+1
		Si (num mod 2 )=0 Entonces
			sumaPares=sumaPares+num
			cPar=cPar+1
		SiNo
			sumaImpares=sumaImpares+num
			cImpar=cImpar+1
		FinSi
//		Escribir "--------"
//		Escribir "iteracion ",i
//		Escribir "--------"
	Mientras Que i<10 //el i va desde 0 hasta 9
	
	mediaPar=sumaPares/cPar
	mediaImpar=sumaImpares/cImpar
	
//	Escribir "suma de los pares", sumaPares
//	Escribir "contador par", cPar
//	Escribir "suma de los impares",sumaImpares
//	Escribir "contador impar", cImpar
//	Escribir "--------"
	//	Escribir i
	
	Escribir "La media de los numeros pares es: ",mediaPar
	Escribir "La media de los numeros impares es: ",mediaImpar
	
FinAlgoritmo
