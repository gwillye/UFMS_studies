n = int(input())

lista = input().split()

pontos = 1
conta = 1

for i in range(0, n-1):
    if lista[i] == lista[i+1]:
        conta += 1
        if conta > pontos:
            pontos = conta
    else:
        conta = 1
print(pontos)
