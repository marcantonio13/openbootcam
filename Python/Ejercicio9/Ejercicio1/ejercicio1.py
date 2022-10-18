 
""" Crea un script que le pida al usuario una lista de países (separados por comas). 
Éstos se deben almacenar en una lista. No debería haber países repetidos (haz uso de set).
 Finalmente, muestra por consola la lista de países ordenados alfabéticamente y separados por comas.
"""

print("Hola me podrias dar una lista de países: ")
miLista= [
    input("Dame el primer país: "),
    input("Dame el segundo país: "),
    input("Dame el tercero país: "),
    input("Dame el  cuarto país: "),
]

miLista  = list(set(miLista))
print("La lista da paises que diste es ", miLista)

