///Escriba un programa que pida 3 notas y valide si esas notas est�n entre 1 y 10. Si est�n entre esos 
///par�metros se debe poner en verdadero una variable de tipo l�gico y si no ponerla en falso. 
///Al final el programa debe decir si las 3 notas son correctas usando la variable de tipo l�gico.


Algoritmo Ej8
	
	Definir n1, n2, n3 Como Entero
	Definir band Como Logico
	
	Escribir "Ingrese las 3 notas"
	Leer n1,n2,n3
	
	Si ((n1>0 Y n1<=10)Y(n2>0 Y n2<=10)Y(n3>0 Y n3<=10)) Entonces
		band = Verdadero
	SiNo
		band = Falso
	FinSi
	
	Si (band = Verdadero) Entonces
		Escribir "Las notas son correctas"
	SiNo
		Escribir "Las notas son incorrectas"
	FinSi
	
	
FinAlgoritmo
