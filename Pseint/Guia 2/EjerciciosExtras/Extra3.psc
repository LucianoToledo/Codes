////3. Solicitar al usuario que ingrese dos n�meros enteros y determinar si ambos son pares o
////	impares. Mostrar en pantalla un mensaje que indique "Ambos n�meros son pares"
////	siempre y cuando cumplan con la condici�n. En caso contrario se deber� imprimir el
////	siguiente mensaje "Los n�meros no son pares, o uno de ellos no es par".
////Nota: investigar la funci�n mod de Pseint.

Algoritmo Extra3
	
	Definir n1, n2 Como Entero
	
	Escribir "Ingrese 2 numeros enteros"
	Leer n1, n2
	
	Si ((n1 mod 2)=0 Y (n2 mod 2)=0 )Entonces
		Escribir "Ambos n�meros son pares"
	SiNo
		Escribir "Los n�meros no son pares, o uno de ellos no es par"
		
	FinSi
	
FinAlgoritmo
