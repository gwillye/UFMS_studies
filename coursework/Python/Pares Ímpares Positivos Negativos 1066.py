a = int(input())
b = int(input())
c = int(input())
d = int(input())
e = int(input())
par = 0
pos = 0
zeros = 0
if (a % 2 == 0):
    par = par + 1
if a > 0:
    pos = pos + 1
if (b % 2 == 0):
    par = par + 1
if b > 0:
    pos = pos + 1
if (c % 2 == 0):
    par = par + 1
if c > 0:
    pos = pos + 1
if (d % 2 == 0):
    par = par + 1
if d > 0:
    pos = pos + 1
if (e % 2 == 0):
    par = par + 1
if e > 0:
    pos = pos + 1
if a == 0:
    zeros = zeros + 1
if b == 0:
    zeros = zeros + 1
if c == 0:
    zeros = zeros + 1
if d == 0:
    zeros = zeros + 1
if e == 0:
    zeros = zeros + 1
imp = 5 - par
neg = 5 - (pos + zeros)
pos = 5 - neg - zeros
print("%i " "valor(es) par(es)" %par)
print("%i " "valor(es) impar(es)" %imp)
print("%i " "valor(es) positivo(s)" %pos)
print("%i " "valor(es) negativo(s)" %neg)
