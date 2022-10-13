""" En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:

 # Color

Ruedas

Puertas

Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:

Velocidad

Cilindrada

Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.  """


class Vehiculo:
    
    def __init__(self , color, ruedas, puertas):
            self.color = color
            self.ruerdas =  ruedas 
            self.puertas = puertas
            
        

class Coche(Vehiculo):
    

    def PotenciaCoche(self, velocidad,cilindrada):
        self.velocidad = velocidad
        self.cilindrada = cilindrada
       

nuevoCoche = Coche("amarillo",34,5)
nuevoCoche.PotenciaCoche(250,150)
print("EL color de su coche es: ",nuevoCoche.color)
print("El tamaño de su ruedas es: ",nuevoCoche.ruerdas," [pl]")
print("El número de puertas de su coche es: ", nuevoCoche.puertas)
print("El tamaño de los cilindros de su motor es: ",nuevoCoche.cilindrada, " [cc]")
print("La velocidad máxima de su coche es: ",nuevoCoche.velocidad, "[km/h]")


