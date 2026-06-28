reset = 1
cont = 0
vGre = 0
vInt = 0
emp = 0
while reset == 1:
    gols = input().split()
    gGre = int(gols[0])
    gInt = int(gols[1])
    if gGre > gInt:
        vGre+= 1
    elif gGre < gInt:
        vInt+= 1
    else:
        emp+= 1
    cont+= 1
    print("Novo grenal (1-sim 2-nao)")
    reset = int(input())
print("%d grenais", cont)
print("Inter: %d", vInt)
print("Gremio: %d", vGre)
print("Empates: %d", emp)
if vGre > vInt:
    print("Gremio venceu mais")
elif vGre < vInt:
    print("Inter venceu mais")
else:
    print("Nao houve vencedor")
