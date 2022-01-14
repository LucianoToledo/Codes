////12. Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
////encontrando la manera de que la frase se muestre de manera continua en la matriz.
////Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:

Algoritmo Ej12 //codigo del cristian
	
    definir long, i, j, n Como Entero
    definir palabra como cadena
    definir m Como Caracter
	
    dimension m(3,3)
    n=3
	
    hacer
		escribir "Ingrese una palabra de longitud 9"
		leer palabra
		long=longitud(palabra)
    mientras que long<>9
	
    para i=0 hasta 2 Hacer
        si i=0 Entonces
            para j=0 hasta 2 Hacer
                m(i,j)= subcadena(palabra,j,j)
            FinPara
        SiNo
            para j=0 hasta 2 Hacer
                m(i,j)= subcadena(palabra,j+n,j+n)
            FinPara
            n=n+3
        FinSi
    FinPara
	
    para i=0 hasta 2 Hacer
        para j=0 hasta 2 Hacer
            escribir sin saltar "[", m(i,j), "]"
        FinPara
        escribir " "
    FinPara
	
FinAlgoritmo

///Codigo pancho, hay que optimizarlo 
//Algoritmo matriz4
//    Definir matriz, palabra, R Como Cadena
//    Definir i, j Como Entero
//    Dimension matriz[3 ,3]
//    Escribir "Ingrese una palabra: "
//    Leer palabra
//    Mientras Longitud(palabra) > 9 Hacer
//        Escribir "La longitud de la palabra debe ser igual a 9"
//        Escribir "Ingrese nuevamente una palabra"
//        Leer palabra
//    FinMientras
//    Para i = 0 Hasta 2 Hacer
//        Para j = 0 Hasta 2 Hacer
//            Si i = 0 Y j = 0 Entonces
//                R = Subcadena(Mayusculas(palabra), i , j )
//                matriz[i, j] = R
//            FinSi
//            Si i = 0 Y j = 1 Entonces
//                R = Subcadena(Mayusculas(palabra), i+1 , j )
//                matriz[i, j] = R
//            FinSi
//            Si i = 0 Y j = 2 Entonces
//                R = Subcadena(Mayusculas(palabra), i+2 , j )
//                matriz[i, j] = R
//            FinSi
//            Si i = 1 Y j = 0 Entonces
//                R = Subcadena(Mayusculas(palabra), i+2 , i+2 )
//                matriz[i, j] = R
//            FinSi
//            Si i = 1 Y j = 1 Entonces
//                R = Subcadena(Mayusculas(palabra), i+3 , i+3 )
//                matriz[i, j] = R
//            FinSi
//            Si i = 1 Y j = 2 Entonces
//                R = Subcadena(Mayusculas(palabra), i+4 , i+4 )
//                matriz[i, j] = R
//            FinSi
//            Si i = 2 Y j = 0 Entonces
//                R = Subcadena(Mayusculas(palabra), i+4 , i+4 )
//                matriz[i, j] = R
//            FinSi
//            Si i = 2 Y j = 1 Entonces
//                R = Subcadena(Mayusculas(palabra), i+5 , i+5 )
//                matriz[i, j] = R
//            FinSi
//            Si i = 2 Y j = 2 Entonces
//                R = Subcadena(Mayusculas(palabra), i+6 , i+6)
//                matriz[i, j] = R
//            FinSi
//        FinPara
//    FinPara
//    Para i = 0 Hasta 2 Hacer
//        Para j = 0 Hasta 2 Hacer
//            Escribir Sin Saltar "| " matriz[i, j] " |"
//        FinPara
//        Escribir ""
//    FinPara
//FinAlgoritmo
