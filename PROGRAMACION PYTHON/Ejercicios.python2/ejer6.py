def tabla_de_Multiplicar(n1,n2):
    return str(n1) + "*" + str(n2) + "=" + str(n1*n2)
n = int(input("Ingresa un numero entero: "))

for i in range(0,11):
    print(tabla_de_Multiplicar(n,i))
