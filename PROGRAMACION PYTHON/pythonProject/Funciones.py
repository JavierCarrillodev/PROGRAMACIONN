# FUNCIONES Y MODALIDAD

# La sintaxi básica de una función

'''def nombre_funcion(parametros)
        #Cuerpo de la fincion
        return resultado

def: palabra clave para definir uan fincioin nombre_funcion: nombre descritivo que la id paraetros. Variables que la recibe de la función return: devuelve un valor (opcional)'''


# Ejemplo básico

def saludar(nombre):
    print(f"Hola,{nombre}")


# Llamada o invocacion a la funcion
saludar("Carlos")


# Parámetro posicionales. Deben ser proporcionados en el mismo orden en el que se definen en la función
# Parámetros nombrados (keyword arguments) que permiten especificar un valor de manera explícita, sin importar el orden

def mostrar_info(nombre, edad):
    print(f"Nombre: {nombre}, Edad: {edad}")


# Llamada con parámetros posicionales
mostrar_info("Lucía", 25)

# Llamada con parámetros nombrados
mostrar_info(edad=30, nombre="Paco")


# Valores por defecto en parámetros
def saludar(nombre, mensaje="Hola"):
    print(f"{mensaje}, {nombre}")


saludar("Ana")
saludar("Ana", "Buenos días")


# Funciones que devuelven valores -> return
def sumar(a, b):
    return a + b


# Argumentos y parametros flexibles

# Parametros poscional indefinido: "arg"
def suma(*numeros):
    total = 0
    for num in numeros:
        total += num
    return total


# Llamada a la funcion
print(suma(1, 2, 3, 4, ))


# "arg permite recibir una tupla con todos los valores que se

# Parametros nombrados idenfinido: **kwargs
# Permite recibir un numero indefinido de parametros con nombre en forma de un diccionario

def mostrar_datos(**datos):
    for clave, valor in datos.items():
        print(f"{clave}: {valor}")


mostrar_datos(nombre="Ana", edad=25, ciudad="Madrid")

dicc1 = {
    "Nombre": "Sara",
    "Edad": 27,
    "DNI": 17491365
}
print(dicc1)


# Funciones anidadas y Ámbitos de variabñes

# Funciones dentro de una funcion. Es util cuando una funcion necesita logica adiccional, que no se utilizara fuera de su contexto

def operacion(opcion):
    def suma(a, b):
        return a + b

    def resta(a, b):
        return a - b

    if opcion == "sumar":
        return suma
    elif opcion == "restar":
        return resta


func = operacion("sumar")
print(func(5, 3))  # Salida: 8

func = operacion("restar")
print(func(5, 3))  # Salida: 2


# Ambito de variables: las variables definidas dentro de ina funcion tienen un ámbito local, lo que significa que no son accesibles fuera de esa función
def saludo():
    mensaje = "Hola, Dam1"
    print(id(mensaje))


saludo()  # Salida Hola, Dam1
mensaje = 0
print(id(mensaje))

# funciones Lambda: funciones anónimas
# Son funciones pequeñas y rápidas definidas en una sola línea que son útiles cuando se necesita una función para un uso temporal

# Uso de Lambda: lambda para sumar 2 números

lambda a, b: a + b
print(suma(5, 3))

numeros = [1, 2, 3, 4, 5]
dobles = list(map(lambda x: x * 2, numeros))
print(dobles)

# Funciones como objetos. Es decir, las funciones pueden ser asignadas a variables, pasarlas como argumentos y retornarlas desde otras funciones

def saludo():
    return "Hola"


def despedida():
    return "Adiós"


# Asigna una funcion a una variable
accion = saludo
print(accion())


# Pasar funciones como argumento
def ejecutar_funcion(func):
    print(func())


ejecutar_funcion(despedida)

# Decoradores. Funciones avanzadas

def decorador(func):
    def nueva_funcion():
        print("ANTES de la funcion original")
        func()
        print("DESPUÉS de la funcion original")
    return nueva_funcion()
@decorador
def saludar():
    print("Hola")

saludar()

# EJERCICIOS DE FUNCIONES

#Ej1. Define una funcion que reciba una lista de números y retorne una nueva lista de números y retorne una nueva lista con los números pares
def es_par(num):
    return num % 2 == 0

def numero_pares(lista):
    pares = []
    for i in lista:
        if es_par(i):
            pares.append(i)
    return pares
listilla = [1, 2, 3, 4, 5, 6]
print(numero_pares(listilla))

listilla2 = [1 ,3 ,5 ,7 ,9 ,12 ]
print(numero_pares(listilla2))

def obtener_lista():
    lista = []
    while True:
        numeros = input("Dame números y termina con 'fin': ")
        if numeros.lower() == "fin":
            break
        numero = int(numeros)
        lista.append(numero)

    return lista

# Ejemplo de uso, prueba de las funciones, ejecución final
lista_usuarios = obtener_lista()
print(f"La lista original es : {lista_usuarios}")
print(f"La lista de numeros pares es: {numero_pares(lista_usuarios)}")

print("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::")














#Eje2 Crea uan funcion que reciba uan cadena de texto y cuente cuántas palabras tiene.




#Eje3 Escribe una función que utilice "arg y ***Kwargs para aceptar multiples parámetros y los imprima como formato







# Eje3 MODULARIDAD
# Un modulo en python es un archivo que contiene definiciones y declaraciones de variables, funciones y clases, los modulos permiten organizar el código en aprtes reutilizables y separar y separar funcionalidades dentro de un proyecto
# Para usar el contenido de un modulo en otro archivo ->import
