Algoritmo Ejercicio4
	
	Definir edad, eMayor, eMenor Como Entero
	
	eMenor <- 200
	
	Para i<-1 Hasta 20 Con Paso 1 Hacer
		
		Escribir "Ingrese edad: " i
		Leer edad
		
		Si edad > eMayor Entonces
			eMayor <- edad
		Fin Si
		
		Si edad < eMenor Entonces
			eMenor <- edad
		Fin Si
		
	Fin Para
	
	Escribir "Edad Mayor: " , eMayor
	Escribir "Edad Menor: " , eMenor
	
FinAlgoritmo
