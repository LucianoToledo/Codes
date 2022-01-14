///17. Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
///una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
///	mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
///	clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema correctamente

//cod con el Hacer Mientras que

Algoritmo Ej17
	
	///forma que lo desarrollo un compañero de la sala
	Definir eureka, clave Como Cadena
	Definir i, suma Como Entero
	
	Hacer
		Escribir "Ingrese Clave"
		Leer clave
		i=i+1
		
	Mientras Que ((i<3) Y (clave<>"eureka"))
	
	Si clave="eureka" Entonces
		Escribir "Ha ingresado al sistema correctamente"
	SiNo
		Escribir "Ustes agoto los 3 intentos"
	FinSi
	
	
Fin Algoritmo

///Forma original como lo hice la primera vez
//Definir clave, contra Como Cadena
//Definir intento,i Como Entero
//
//clave = "eureka"
//intento=0
//i=3
//
//Escribir "Ingrese la contraseña"
//Leer contra
//
//intento = intento+1
//
//Si (Contra = clave) Entonces
//	
//	Escribir "Contraseña correcta"
//	
//SiNo 
//	Hacer
//		Escribir intento
//		Escribir "Contraseña incorrecta, ingrese nuevamente, " i-1 " intentos"
//		leer contra
//		intento = intento+1		
//		i=i-1
//	Mientras Que ((contra <> clave) Y (intento <> 3)) //no tiene sentido que sea un Y y no un O
//	
//	Si ((intento = 3) Y (Contra = clave)) Entonces
//		Escribir "Contraseña correcta"
//	SiNo
//		Si ((intento = 3) Y (Contra <> clave)) Entonces 
//			Escribir "Has agotado los 3 intentos"
//		SiNo
//			Si (Contra = clave) Entonces
//				Escribir "Contraseña correcta"
//			FinSi
//		FinSi
//	FinSi
//FinSi

///cod con el Hacer Hasta Que 
//Algoritmo Ej17
//	
//	Definir clave, contra Como Cadena
//	Definir intento Como Entero
//	
//	clave = "eureka"
//	intento=0
//	
//	Escribir "Ingrese la contraseña"
//	Leer contra
//	
//	Si Contra = clave Entonces
//		
//		intento = intento+1	
//		Escribir "Contraseña correcta"
//		
//	SiNo			
//		Hacer
//			Escribir "Contraseña incorrecta, ingrese nuevamente"
//			Leer contra
//			intento = intento+1
//		Hasta Que Contra = clave O intento = 2 //se corroboran 2 chekeos porque ya trae uno de la primer parte del si
//	
//		Si intento = 3 Y  Contra = clave Entonces
//			Escribir "Contraseña correcta"
//		SiNo
//			Si intento = 2 Y Contra <> clave  Entonces //aca no se porque son 2 intentos en vez de 3
//				Escribir "Has agotado los 3 intentos"
//			SiNo
//				Si Contra = clave Entonces
//					Escribir "Contraseña correcta"
//				FinSi
//			FinSi
//		FinSi
//		
//	FinSi
//		
//FinAlgoritmo
