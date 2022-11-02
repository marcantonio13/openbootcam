# En este ejercicio tenéis que crear una lista de RadioButton que 
# muestre la opción que se ha seleccionado y que contenga un botón de 
# reinicio para que deje todo como al principio.

#Al principio no tiene que haber una opción seleccionada.

from tkinter import Tk,StringVar,Radiobutton,Button,W

options = ['Java','Python', 'Go', 'C#']
window = Tk()
window.geometry('220x140')
window.columnconfigure(1,weight=1)
window.columnconfigure(3,weight=1)
window.title('Select..')
var = StringVar()
var.set(0)

def reset():
    var.set(0)
    window.title('Select..')

def selected():
    window.title(f'{var.get()}')

for i in range(0,len(options)):
    Radiobutton(window, text=options[i], variable=var, 
    value=options[i], command=selected).grid(padx=0,row=i,column=0,sticky=W)

Button(window, text="Reset", command=reset,width=15,height=5).grid(column=2,row=0,rowspan=5)

window.mainloop()