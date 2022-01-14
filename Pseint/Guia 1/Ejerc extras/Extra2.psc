///Pedir al usuario que ingrese la marca y modelo de un auto e imprima en pantalla el modelo y
///la marca (orden invertido a lo que se lee, con la marca toda en mayúscula)

Algoritmo Extra2
	Definir modelo, marca Como Cadena
	Escribir "Ingrese marca del vehiculo"
	Leer marca
	Escribir "Ingrese modelo del vehiculo"
	Leer modelo
	
	Escribir ""  //Para hacer espacios en la consola
	Escribir ""
	Escribir "Modelo: ",modelo
	Escribir "Marca: ",Mayusculas(marca)
	
FinAlgoritmo
