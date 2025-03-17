
def calcular_IVA(p):
    IVA = p * 0,19
    return IVA
precioCompra = float(input("Ingrese el valor de la compra: "))
IVA = calcular_IVA(precioCompra)
print("El valor de la compra sin iva es de:",precioCompra)
print("El valor a pagar en total (IVA incluido) es de ",(precioCompra + IVA))
