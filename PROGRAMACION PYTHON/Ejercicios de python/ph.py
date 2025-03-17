Ph = int(input("Escribe tu ph del (0-14): "))

if Ph > 7 and Ph <= 14:
    print("Tu Ph es Basico")

elif Ph < 7:
    print("Ácido") 
else:
    print("Neutral")