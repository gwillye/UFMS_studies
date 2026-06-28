T = int(input())
A, B, C, D, E = input().split()
A = int(A)
B = int(B)
C = int(C)
D = int(D)
E = int(E)
cont = 0
if A == T:
    cont = cont + 1
if B == T:
    cont = cont + 1
if C == T:
    cont = cont + 1
if D == T:
    cont = cont + 1
if E == T:
    cont = cont + 1
print(cont)
