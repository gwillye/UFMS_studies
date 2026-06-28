n =int(input())
a = input().split()

for i in range(len(a)):
    a[i] = int(a[i])

menor = a[0]
posicao = 0
for j in range(1,len(a)):
    if a[j] < menor:
        menor = a[j]
        posicao = j

print("Menor valor: %i" %menor)
print("Posicao: %i" %posicao)
