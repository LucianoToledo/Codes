////3. Crea una función EsMultiplo que reciba los dos números pasados por el usuario,
////validando que el primer numero múltiplo del segundo y devuelva verdadero si el
////	primer numero es múltiplo del segundo, sino es múltiplo que devuelva falso.

Funcion esMultiplo = validar(n1,n2)
	
	Definir esMultiplo Como Logico
	
	Si (n1 mod n2) = 0 Entonces
		esMultiplo=Verdadero
	SiNo
		esMultiplo=Falso
	FinSi
	
FinFuncion

Algoritmo Ej3
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese 2 numeros"
	Leer num1, num2
	
	Escribir validar(num1,num2)
	
	
FinAlgoritmo
	