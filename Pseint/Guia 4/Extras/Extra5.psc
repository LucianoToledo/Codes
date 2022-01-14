////5.Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter,
////facilitando un potencial reordenamiento del vector. Digamos que se pide ingresar el
////carácter en la posición X y la misma está ocupada, entonces de existir un espacio en
////cualquier posición X-n o X+n, desplazar los carteres hacia la izq o hacia la derecha para
////	poder ingresar el carácter en cuestión en el lugar deseado. El procedimiento de
////	reordenamiento debe ubicar el espacio más cercano

Algoritmo Extra5Terminaaaaaaaaaaaar
	
	Definir i,j ,pos,lg, izq, der, aux, aux2 Como Entero
	Definir vec,frase Como cadena
	Definir car,temp Como caracter
	
	Dimension vec[20]
	
	Escribir "Ingrese frase"
	leer frase	
	mientras Longitud(frase)>20 Hacer
		Escribir "La frase debe tener 20 carteres"
		Escribir "Ingrese nuevamente:"
		Leer frase
	FinMientras
	
	para i=0 Hasta 19 Hacer
		vec[i]=Subcadena(frase,i,i)
	FinPara
	para i=0 hasta 19 Hacer              //relleno los vacios con espacios
        si vec[i]="" Entonces
            vec[i]= " "
        FinSi
    FinPara
	
	Escribir "Ingrese carter"
	leer car
	mientras Longitud(car)>=2 Hacer
		Escribir "Debe ingresar un carter"
		Escribir "Ingrese nuevamente:"
		Leer car
	FinMientras
	Escribir "Ingrese pos en donde agregar el caracter"
	Leer pos
	
	der=0
    izq=0
    si vec[pos]=" " Entonces
        vec[pos]=car
    SiNo
        aux=pos+1 //se guarda la pos de la derecha
        mientras aux<=19 y vec[aux]<>" " Hacer
            der= der+1 //cuenta la cantidad  de espacios vacios hay a la derecha de la pos ingresada
            aux= aux+1 //guarda la prox pos para entrar de vuelta al bucle
        FinMientras
		
        aux=pos-1 //lo mismo que lo anterior pero para la izquierda
        mientras aux>=0 y vec[aux]<>" " Hacer
            izq= izq+1
            aux= aux-1
        FinMientras
		
        si der<izq Entonces //si hay mas espacios a la izq que a la der, corre todo a la derecha para hacer un espacio vacio donde va el caracter
            aux2=19
            mientras aux2>=pos Hacer //mientras mi aux2 sea mayor igual que la posicion
                vec[aux2]=vec[aux2-1] //guardar en la posicion aux2 el caracter de la posicion aux2-1
                aux2=aux2-1 //le resto 1 a aux2
            FinMientras
            vec[pos]=car //guardo el caracter en el espacio vacio
        sino
            izq=izq+1 //para no perder un caracter
            mientras izq>=0 Hacer
                vec[pos-izq]=vec[pos-izq+1] //[pos-izq] es el espacio en blanco que lo relleno con el siguiente de la derecha
                izq=izq-1
            FinMientras
            vec[pos]=car//guardo el caracter en el espacio vacio
        FinSi
    FinSi
	
	Para i=0 Hasta 19 Hacer
		Escribir Sin Saltar  " | " vec[i]
	FinPara
	Escribir" |" 
	Escribir ""
	Para i=0 Hasta 19 Hacer
		Escribir Sin Saltar  " | " i
	FinPara
	Escribir" |" 
	Escribir ""
	
FinAlgoritmo
