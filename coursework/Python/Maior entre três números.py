num1, num2, num3 = input().split()
num1 = int(num1)
num2 = int(num2)
num3 = int(num3)

M = ( num1 + num2 + abs(num1 - num2)) / 2
M = ( M + num3 + abs(M - num3)) / 2
print("%i"" eh o maior" %M)

