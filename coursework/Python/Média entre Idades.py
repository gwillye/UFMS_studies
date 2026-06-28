#Para sair do laço, digite um número negativo
cont = 0
idad = 0
id = int(input())
while id > 0:
    idad = id + idad
    id = int(input())
    cont = cont + 1
media = idad / cont
print("%.2f" %media)

