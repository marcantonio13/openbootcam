
""" En este segundo ejercicio, tendréis que crear un programa que tenga una clase llamada Alumno 
que tenga como atributos su nombre y su nota. Deberéis de definir los métodos para inicializar 
sus atributos, imprimirlos y mostrar un mensaje con el resultado de la nota y si ha aprobado o no. """

import re


class Alumno: 

    def Nota(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota 
        if nota <= 6: 
            print(nombre, "la nota no es suficiente: ", nota) 
        elif nota >= 6:
            print(nombre,"la nota es aprobatoria: ", nota)   
        else:   
            print("Ocurrio un error ")


alumno1 = Alumno()
alumno1.Nota("Antonio",9)






