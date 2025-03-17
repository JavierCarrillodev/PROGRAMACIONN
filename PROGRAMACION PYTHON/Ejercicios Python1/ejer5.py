Pedido1 = int(input("Dime cuantos Payasos quieres: "))
Pedido2 = int(input("Dime cuantas munecas quieres quieres: "))

# Pedimos que nos multiplique lo introducido en la variable pedido1
PayasosGramos = 112 * Pedido1
MuñecasGramos = 75 * Pedido2
PesoTotal = (PayasosGramos * MuñecasGramos) /10000

# Para introducir las variables dentro de un print sin tener que poner (,) fuera de las comillas. Le añadiremos  F de strings lo que hace es convertir cualquier dato o número en texto para que salga por pantalla. También hay que añadir las llaves dentro del texto de print.
print(f"En este ultimo pedido se ha pedido {Pedido1} payasos y {Pedido2} muñecas el paquete pesara: {PesoTotal} Kilos ")