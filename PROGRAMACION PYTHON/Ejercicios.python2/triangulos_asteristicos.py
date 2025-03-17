# Dibujar un trinagulo de asteristicos con altura N

# El ejercicio solicita leer un numero entero N del teclado para dibujar un triángulo de asteristicos

# Se deben definir al menos 3 subprogramas

# Ejemplo de Output: Triangulo de altura 4


#*
#***
#******
#*******

def triangulo_asteristicos(n):
    for i in range (n):
        print("*", end="")
    print()



def imprimir_triangulo(altura):
    # Esta función imprime el triángulo de asteriscos de altura 'N'
    for fila_triangulo in range(1, altura + 1):
        triangulo_asteristicos(fila_triangulo)

def main():
    # Esta es la función principal que solicita la altura al usuario y llama a las funciones necesarias
    altura = int(input("Ingresa la altura del triángulo: "))
    imprimir_triangulo(altura)

# Llamamos a la función principal para ejecutar el programa
main()
