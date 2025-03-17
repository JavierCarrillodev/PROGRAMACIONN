
listaIngredientes = ['Tomate', 'Queso', 'Pollo', 'Bacon', 'Piña', 'Jamon', 'York', 'Mozzarella']
print(listaIngredientes)

def listaUsuario():
    listaUsuario = []
    while True:
        usuario = input('Ingrediente: ')
        if usuario in listaIngredientes:
            listaUsuario.append(usuario)
            if len(listaUsuario) >= 5:
                break
        else:
            print('El ingrediente no esta en la lista')
    return listaUsuario

print(listaUsuario())