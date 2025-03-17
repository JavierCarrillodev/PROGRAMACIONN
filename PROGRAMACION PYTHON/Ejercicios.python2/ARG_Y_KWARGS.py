#Eje3 Escribe una función que utilice "arg y ***Kwargs para aceptar multiples parámetros y los imprima como formato

def imprimir_datos(*args, **kwargs):
    print("Argumentos posicionales" ,args)
    print("Argumentos nombrados:", kwargs)

#Ejemplo de uso de la funcion ej3
imprimir_datos(1, 2, 3, 4, 5, nombre = "juan", edad = 30)

