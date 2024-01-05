import tkinter

ventana= tkinter.Tk()
ventana.title("CALCULADORA")
ventana.geometry("+480+180")

def Sumar():
    try:
        valor1= e_valor1.get()
        valor2 = e_valor2.get()
        label_resultado.grid(row= 7, column=0, columnspan=2)

        if valor1 == "" or valor2 == "":
             label_resultado["text"] = "¡Faltan valores por sumar!"
             messagebox.showwarning("Error", "Faltan valores por sumar")
        else:
             resultado = int(valor1) + int(valor2)
             label_resultado["text"]= resultado
    except:
        messagebox.showerror("Error nivel dos", "Error, valores no validos")

def Restar():

        try:
            valor1= e_valor1.get()
            valor2 = e_valor2.get()
            label_resultado.grid(row= 7, column=0, columnspan=2)

            if valor1 == "" or valor2 == "":
               label_resultado["text"] = "¡Faltan valores por restar!"
               messagebox.showwarning("Error", "Faltan valores por restar")
            else:
               resultado = int(valor1) - int(valor2)
               label_resultado["text"]= resultado
        except:
           messagebox.showerror("Error nivel dos", "Error, valores no validos")


def Mul():
        try:
          valor1= e_valor1.get()
          valor2 = e_valor2.get()
          label_resultado.grid(row= 7, column=0, columnspan=2)

          if valor1 == "" or valor2 == "":
               label_resultado["text"] = "¡Faltan valores por multiplicar!"
               messagebox.showwarning("Error", "Faltan valores por multiplicar")
          else:
               resultado = int(valor1) * int(valor2)
               label_resultado["text"]= resultado
        except:
            messagebox.showerror("Error nivel dos", "Error, valores no validos")

def Div():
        try:
           valor1= e_valor1.get()
           valor2 = e_valor2.get()
           label_resultado.grid(row= 7, column=0, columnspan=2)

           if valor1 == "" or valor2 == "":
               label_resultado["text"] = "¡Faltan valores por dividir!"
               messagebox.showwarning("Error", "Faltan valores por dividir")
           else:
               resultado = int(valor1) / int(valor2)
               label_resultado["text"]= resultado
        except:
            messagebox.showerror("Error nivel dos", "Error, valores no validos")


ventana.columnconfigure(0, weight=1)
ventana.columnconfigure(1, weight=1)

ventana.rowconfigure(0, weight=1)
ventana.rowconfigure(1, weight=1)
ventana.rowconfigure(2, weight=1)
ventana.rowconfigure(3, weight=1)
ventana.rowconfigure(4, weight=1)
ventana.rowconfigure(5, weight=1)
ventana.rowconfigure(6, weight=1)

label_titulo =tkinter.Label(ventana, text="Calculadora", font="arial 20")
label_valor1 =tkinter.Label(ventana, text="Valor 1", font="arial 10")
label_valor2 =tkinter.Label(ventana, text="Valor 2", font="arial 10")

e_valor1=tkinter.Entry(ventana, font="arial 15")
e_valor2=tkinter.Entry(ventana, font="arial 15")

button_suma=tkinter.Button(ventana, text="Suma",bg="black", fg="white", font="arial 12",width=25, command=Sumar)
button_resta=tkinter.Button(ventana, text="Restar",bg="black", fg="white", font="arial 12",width=25, command=Restar)
button_mul=tkinter.Button(ventana, text="Multiplica",bg="black", fg="white", font="arial 12",width=25, command=Mul)
button_div=tkinter.Button(ventana, text="Divide",bg="black", fg="white", font="arial 12",width=25, command=Div)

label_titulo.grid (row=0, column=0, columnspan=2, pady=8)

label_valor1.grid (row=1, column=0, pady=5)
label_valor2.grid (row=2, column=0)

e_valor1.grid(row=1, column=1, padx=8)
e_valor2.grid(row=2, column=1)

button_suma.grid(row=3, column=0,pady=10, columnspan=2)
button_resta.grid(row=4, column=0,pady=5, columnspan=2)
button_mul.grid(row=5, column=0,pady=5, columnspan=2)
button_div.grid(row=6, column=0,pady=5, columnspan=2)

label_resultado = tkinter.Label(ventana)

ventana.mainloop()
