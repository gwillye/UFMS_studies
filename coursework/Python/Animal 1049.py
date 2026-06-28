var1 = input()
var2 = input()
var3 = input()

if var1 == 'vertebrado':
    if var2 == 'ave':
        if var3 == 'carnivoro':
            print("aguia")
        if var3 == 'onivoro':
            print("pomba")
    if var2 == 'mamifero':
        if var3 == 'onivoro':
            print("homem")
        if var3 == 'herbivoro':
            print("vaca")
if var1 == 'invertebrado':
    if var2 == 'inseto':
        if var3 == 'hematofago':
            print("pulga")
        if var3 == 'herbivoro':
            print("lagarta")
    if var2 == 'anelideo':
        if var3 == 'hematofago':
            print("sanguessuga")
        if var3 == 'onivoro':
            print("minhoca")
