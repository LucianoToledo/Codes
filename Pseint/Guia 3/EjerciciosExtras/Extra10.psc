////11. Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y
////muestra una cadena con un espacio adicional tras cada letra.
////Por ejemplo, "Hola, t�" devolver� "H o l a , t � ". Crea un programa principal donde se
////use dicho procedimiento

SubProceso convertirEspaciado(frase)
	
	Definir i,lg Como Entero
	
	lg=Longitud(frase)
	
	Para i=0 hasta lg Hacer
		Escribir Sin Saltar Concatenar(Subcadena(frase,i,i)," ")
	FinPara
	Escribir ""
	
FinSubProceso

Algoritmo Extra11
	
	Definir frase Como Cadena
	
	Escribir "Ingrese una frase"
	Leer frase
	
	convertirEspaciado(frase)
FinAlgoritmo
