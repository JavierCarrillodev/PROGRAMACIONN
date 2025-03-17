'''Programa que lea de teclado una letra minúscula (suponemos que la entrada de datos es correcta), y escriba la letra mayúscula correspondiente a la letra minúscula leída previamente'''

try:
    # Leer una letra desde el teclado
    minus = input("Dime una letra: ")
    mayusc = minus.upper()

    # Comprobamos que se haya introducido una única letra
    if len(minus) != 1:
        raise ValueError ("La entrada debe de ser una unica letra")

    # Comprobamos que sea un caracter alfabético
    if not minus.isalpha():
        raise ValueError("La entrada debe ser una letra")
    
    # Comprobamos que la letra de entrada sea minuscula
    if not minus.islower():
        raise ValueError ("La letra debe de ser minuscula")

    print(f"Tu letra introducida '{minus}' ahora es '{minus.upper()}' ")
except ValueError as e:
    print(f"Error: {e}")

