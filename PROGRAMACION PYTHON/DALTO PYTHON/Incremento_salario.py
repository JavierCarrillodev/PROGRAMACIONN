def incremento_salario(salario,x):
    nuevoSalario = salario + (salario*(x/100))
    return nuevoSalario

salarioActual = float(input("Ingrese el salario actual"))
incremento = float(input("Ingrese el porcentaje de incremento"))
nuevoSalario = incremento_salario(salarioActual,incremento)
print(f"El nuevo salario es de: {nuevoSalario}")