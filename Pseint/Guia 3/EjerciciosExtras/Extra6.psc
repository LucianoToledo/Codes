////6. Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el
////    n�mero tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener
////	que separar el numero en partes (si es un numero de m�s de un digito) y ver si cada
////	numero es par o impar. Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos
////	pasar el numero a cadena para realizar el ejercicio.

Funcion banderaImpar=esImpar(n)
	Definir banderaImpar Como Logico
	
	Si (n mod 2) =0 Entonces
		banderaImpar=Falso 
	SiNo
		banderaImpar=Verdadero
	FinSi
	
FinFuncion

funcion band=digitos(n)
	Definir band Como Logico
	Definir ultimoN Como Entero
	Definir aux Como Real
	
	
	si n<10 Entonces
        band=esImpar(n)
    sino 
		band=Verdadero
        mientras n>9 Y band = Verdadero Hacer //si n>9 significa que el numero tiene mas de 2 digitos
            ultimoN = (n mod 10) //extraigo el ultimo digito en cada iteracion 
			band=esImpar(ultimoN) 
            aux = n / 10 
            n = trunc(aux) //tengo el numero menos el ultimo digito 
        FinMientras
		
		Si band = Verdadero Entonces
			band=esImpar(n)
		FinSi
    FinSi
	
FinFuncion

Algoritmo Extra6
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero"
	Leer num
	
	Si digitos(num) = Verdadero Entonces
		Escribir "El numero tiene todos sus digitos impares"
	SiNo
		Escribir "El numero tiene digitos pares e impares"
	FinSi
	
FinAlgoritmo
