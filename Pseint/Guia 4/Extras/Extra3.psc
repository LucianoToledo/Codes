////3.Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
////almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector
////se debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la
////	función Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su
////	longitud

Algoritmo Extra3
	
	Definir lg,i,n Como Entero
	Definir nombre como cadena
	
	Escribir "ingrese dimension de los vectores"
	Leer n
	
	Dimension nombre[n]
	Dimension lg[n]
	
	para i=0 Hasta n-1 Hacer
		Escribir "Ingrese nombre de la persona"
		leer nombre[i]
		lg[i]=Longitud(nombre[i])
	FinPara
	
	para i=0 Hasta n-1 Hacer
		Escribir "| ", nombre[i], " | ", lg[i]," | "
	FinPara
FinAlgoritmo
