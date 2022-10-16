""" En este segundo ejercicios tendréis que crear un script que nos diga si es la hora de ir a casa.
 Tendréis que hacer uso del modulo time. Necesitaréis la fecha del sistema y poder comprobar la hora.
En el caso de que sean más de las 7, se mostrará un mensaje y en caso contrario, 
haréis una operación para calcular el tiempo que queda de trabajo. """

import time

fecha =time.strftime('%Y-%m-%d %H:%M:%S', time.localtime())

#Varibles en hora actual formato de 24 hrs.
horaActual = int(time.strftime('%H'))
minutoActual = int(time.strftime('%M'))
segundoActual = int(time.strftime('%S'))


#Hora de salida del trabajo
horaSalida = int('19')
minutoSalida = int('0')
segundoSalida = int('0')

#Operaciones

horasRestantes = horaActual - horaSalida
minutoRestantes = 60 - minutoActual
segundoRestante = 60 - segundoActual


print("La fecha y hora de hoy es: ",fecha)



if horaActual >= horaSalida:
    print("Es tu hora de salida")

elif horaActual <= horaSalida :
    print("Aun no es tu hora de salida") 
    print("El tiempo para tu hora de salida es:",horasRestantes,":",minutoRestantes,":",segundoRestante,"hrs.")
   

    

    











