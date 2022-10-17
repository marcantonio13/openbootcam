"""  En este ejercicio, tendréis que crear un archivo py donde creéis un archivo txt,
 lo abráis y escribáis dentro del archivo. Para ello, tendréis que acceder dos veces al archivo creado.
"""


f = open('fichero.txt','w')
lista = [
    'hola\n',
    'como\n',
    'esta\n',
    'fichero\n',
    'adios\n',

]

f.writelines(lista)

f.close
