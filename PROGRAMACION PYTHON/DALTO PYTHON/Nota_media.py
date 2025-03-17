#Programa que toma las tres nota media de un estudiante y diga la nota final del curso
#Tenga en cuenta que la primera y segunda nota valen en 30% de la nota final. La tercera nota vale el 40%

def calcular_nota(n1, n2 , n3):
    return (n1*0,3) + (n2*0,3) + (n3*0,4)

n1 = float(input("Diga la primera nota: "))
n2 = float(input("Diga la segunda nota: "))
n3 = float(input("Diga la tercera nota: "))

notaFinal = calcular_nota(n1, n2 , n3)

print ("Nota final del estudiante es:",notaFinal)

