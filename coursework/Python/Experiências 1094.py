tot = int(input())
cont = 0
coelhos = 0
sapos = 0
ratos = 0
nt = 0
while cont < tot:
    num, ani = input().split()
    num = int(num)
    if ani == 'C':
        coelhos = coelhos + num
    if ani == 'R':
        ratos = ratos + num
    if ani == 'S':
        sapos = sapos + num
    nt = num + nt
    cont = cont + 1

pc = coelhos / nt * 100
ps = sapos / nt * 100
pr = ratos / nt * 100

print("Total: ""%i"" cobaias" %nt)
print("Total de coelhos: ""%i" %coelhos)
print("Total de ratos: ""%i" %ratos)
print("Total de sapos: ""%i" %sapos)
print("Percentual de coelhos: ""%.2f" %pc, end='')
print(" %")
print("Percentual de ratos: ""%.2f" %pr, end='')
print(" %")
print("Percentual de sapos: ""%.2f" %ps, end='')
print(" %")
