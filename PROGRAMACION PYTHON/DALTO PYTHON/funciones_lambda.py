numeros = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]

#def es_par(num):
  #  if (num % 2 ==0):
 #       return True
#numeros_pares = filter(es_par, numeros)
#print(list(numeros_pares))

# Ahora lo mismo que antes pero con lambda
numeros_pares = filter(lambda num: num % 2 == 0, numeros)
print(list(numeros_pares))

