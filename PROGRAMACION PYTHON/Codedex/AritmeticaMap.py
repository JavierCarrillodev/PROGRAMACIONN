'''Programa que calcule y escriba la media aritmetica de 3 números enteros leídos de teclado'''

n1, n2, n3 = map (int, input('Dame tres numero separado por espacios: ').split())

print(f"Los número son {n1}, {n2}, {n3}")

media = float (n1+n2+n3) / 3
print(f"La media obtenida son: {round(media, 2)}")