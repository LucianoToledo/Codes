///A partir de una conocida cantidad de metros que el usuario ingresa a trav�s del teclado
///se debe obtener su equivalente en cent�metros, en mil�metros y en pulgadas.
///Ayuda: 1 pulgada equivale a 2.54 cent�metros

Algoritmo Ej4
	
	Definir medida, mCent, mMilim, mPul Como Real
	
	Escribir "Ingrese medida en metros"
	Leer medida
	
	mCent = medida*100
	mMilim = medida*1000
	mPul = mCent/2.54
	
	Escribir "La medida ingresada es: ", medida,"m"
	Escribir"En cm: ",mCent, "cm"
	Escribir "En Milimetro: ",mMilim, "mm"
	Escribir "En Pulgada: ",mPul
	
FinAlgoritmo
