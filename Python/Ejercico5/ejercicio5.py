
# Escribe una función que pueda decirte si un año (número entero) es bisiesto o no.


def bisiesto(x):  
  if((x % 400 == 0) or  
     (x % 100 != 0) and  
     (x % 4 == 0)):   
    print("El año es bisiesto!");    
  else:  
    print ("El año no es  Bisiesto!")    
x = int(input("Dame el año: "))   


bisiesto(x)     

def  _



