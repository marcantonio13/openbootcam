""" En este segundo ejercicio, tendréis que crear un archivo py y dentro crearéis una clase Vehículo,
 haréis un objeto de ella, lo guardaréis en un archivo y luego lo cargamos.

"""

import pickle


class Vehiculo: 

    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
    
    def Compro(self):
            return print("Su carro es un", self.marca, "del año",self.modelo)

carro = Vehiculo('Bugatti', 2020)   
carro.Compro()  

f = open('datos.bin','wb')
pickle.dump(carro,f)
f.close()


f = open('datos.bin', 'rb')
carro = pickle.load(f)
f.close




