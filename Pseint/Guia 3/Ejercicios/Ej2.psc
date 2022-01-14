////2. Realizar una función que valide si un numero es impar o no. Si es impar la función debe
////devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe
////		tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo.

Funcion bandera = validar(n1)
	
	Definir bandera Como Logico
	Si (n1 mod 2) = 0 Entonces
		bandera=Verdadero
	SiNo
		bandera=falso
	FinSi
FinFuncion


Algoritmo Ej2
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero"
	Leer num
	
	Si (validar(num) = Verdadero) Entonces
		Escribir "El numero es par"
	SiNo
		Escribir "El numero es impar"
	FinSi
	
//	Escribir validar(num)
	
FinAlgoritmo




///Otra forma

//Funcion resultado <- pareimpar (a)
//	Definir resultado Como Logico
//	resultado = (a mod 2 = 0);
//Fin Funcion
//
//Algoritmo paresono
//	Definir a Como Entero;
//	Escribir "El programa va a definir si el numero ingresado por el usuario es par o impar";
//	Leer a;
//	Si (pareimpar(a) == Verdadero) Entonces
//		Escribir "Es verdadero";
//	SiNo
//		Escribir "Es falso";
//	Fin Si
//FinAlgoritmo
