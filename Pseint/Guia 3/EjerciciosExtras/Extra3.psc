//// Crear una funci�n llamada "Login", que recibe un nombre de usuario y una contrase�a
//// y que devuelve Verdadero si el nombre de usuario es "usuario1" y si la contrase�a es
//// "asdasd". Adem�s la funci�n calculara el n�mero de intentos que se ha usado para
//// loguearse, tenemos solo 3 intentos, si nos quedamos sin intentos la funci�n devolver� Falso

Funcion banderaLocal=Login(user,pass)
	Definir banderaLocal Como Logico
	Definir i Como Entero
	i=0
	
	Si user = "usuario1" Y pass = "asdasd" Entonces
		banderaLocal=Verdadero
	SiNo
		Hacer	
			Escribir "Usuario o contrase�a incorrecto, ingrese nuevamente"
			Escribir "Intentos restantes ",3-i 
			Leer user, pass
			i=i+1
			Escribir "-------------"
			
		Hasta Que i=3 O (user = "usuario1" Y pass = "asdasd")
		
		Si i=3 Y (user <> "usuario1" Y pass <> "asdasd") Entonces
			banderaLocal = Falso
		SiNo
			banderaLocal= Verdadero
		FinSi
	FinSi
FinFuncion

Algoritmo Extra3
	Definir usuario, contra Como cadena
	Definir bandera Como Logico
	
	Escribir "Ingrese USUARIO"
	Leer usuario
	Escribir "Ingrese CONTRASE�A"
	Leer contra
	
	bandera = Login(usuario,contra)
	
	Si bandera=Verdadero Entonces
		Escribir "Ingreso exitoso al sistema"	
	SiNo
		Escribir "Usted agoto sus 3 intentos"
	FinSi
	
FinAlgoritmo
