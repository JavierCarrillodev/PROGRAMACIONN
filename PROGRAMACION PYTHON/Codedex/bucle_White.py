guess = 0
tries = 0
while guess != 6 and tries < 5:
    guess = int(input("El numero de guess: ")) 
    tries = tries +1

if guess != 6:
    print("Rango no valido")

else:
    print("Lo hicestes")