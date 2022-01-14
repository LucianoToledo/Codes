////5. Realizar una funci�n que calcule la suma de los d�gitos de un numero.
////Ejemplo: 25 = 2 + 5 = 7
////Nota: Para obtener el �ltimo numero de un digito de 2 cifras o m�s debemos pensar en
////		el resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc

Funcion resultado = suma(n)
	Definir resultado, ultimoN Como Entero
	Definir aux,aux1 Como Real
	
    resultado = 0
    si n<10 Entonces
        resultado = n
    sino 
        mientras n>9 Hacer //si n>9 significa que el numero tiene mas de 2 digitos
            ultimoN = n mod 10 //se guarda el ultimo digito en cada iteracion
            resultado = resultado + ultimoN 
            aux = n / 10
            n = trunc(aux) //tengo el numero menos el ultimo digito
        FinMientras
        resultado = resultado + n
    FinSi

FinFuncion

Algoritmo Extra5
	Definir num,long Como entero
	
	Escribir "Ingrese numero"
	Leer num
	
	Escribir "La suma de los digitos de ",num," es de ", suma(num)
	
FinAlgoritmo
