# FUNCIONES Y MODALIDAD

#La sintaxi básica de una función

'''def nombre_funcion(parametros)
        #Cuerpo de la fincion
        return resultado
        
def: palabra clave para definir uan fincioin nombre_funcion: nombre descritivo que la id paraetros. Variables que la recibe de la función return: devuelve un valor (opcional)'''

# Ejemplo básico

def saludar (nombre):
    print(f"Hola,{nombre}")

# Llamada o invocacion a la funcion
saludar ("Carlos")

# Parámetro posicionales. Deben ser proporcionados en el mismo orden en el que se definen en la función
# Parámetros nombrados (keyword arguments) que permiten especificar un valor de manera explícita, sin importar el orden

def mostrar_info(nombre, edad):
    print(f"Nombre: {nombre}, Edad: {edad}")

# Llamada con parámetros posicionales
mostrar_info("Lucía", 25)

# Llamada con parámetros nombrados
mostrar_info(edad = 30, nombre="Paco")

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
def suma (*numeros):
    total = 0
    for num in numeros:
        total += num
    return total

# Llamada a la funcion
print(suma(1,2,3,4,))

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
    def suma(a,b):
        return a + b
    def resta(a, b):
        return a - b
    if opcion == "sumar":
        return suma
    elif opcion == "restar":
        return resta

func = operacion("sumar")
print(func(5,3)) #Salida: 8 

func = operacion("restar")
print(func(5, 3)) # Salida: 2

# Ambito de variables: las variables definidas dentro de ina funcion tienen un ámbito local, lo que significa que no son accesibles fuera de esa función
def saludo():
    mensaje = "Hola, Dam1"
    print(id(mensaje))

saludo() #Salida Hola, Dam1
mensaje = 0
print(id(mensaje))

# funciones Lambda: funciones anónimas
# Son funciones pequeñas y rápidas definidas en una sola línea que son útiles cuando se necesita una función para un uso temporal

# Uso de Lambda: lambda para sumar 2 números

lambda a, b: a + b
print(suma(5,3))

numeros = [1,2,3,4,5]
dobles = list(map(lambda x: x*2, numeros))
print(dobles)