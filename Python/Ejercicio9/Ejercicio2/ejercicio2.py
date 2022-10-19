"""
En este segundo ejercicio, tenéis que crear una aplicación que obtendrá los elementos impares de una lista pasada 
por parámetro con filter y realizará una suma de todos estos elementos obtenidos mediante reduc
"""

from functools import reduce

numero = [1,2,3,4,5,6,7,8,9,10,11,12,13]

numerosImpares = filter(lambda num :  num % 2 != 0, numero)
sumar = reduce(lambda a, b : a + b, numerosImpares)

print(sumar)


