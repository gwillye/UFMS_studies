A, B, C = input().split()
num1 = float(A)
num2 = float(B)
num3 = float(C)

#Achar o maior
if num1 < num2:
    a = num2
    num2 = num1
    num1 = a
if num1 < num3:
    a = num3
    num3 = num1
    num1 = a

if num1 >= (num2 + num3):
    print("NAO FORMA TRIANGULO")
else:
    num12 = num1 * num1
    num22 = num2 * num2
    num32 = num3 * num3
    if num12 == (num22 + num32):
        print("TRIANGULO RETANGULO")
    else:
        if num12 > (num22 + num32):
            print("TRIANGULO OBTUSANGULO")
        if num12 < (num22 + num32):
            print("TRIANGULO ACUTANGULO")
    if num1 == num2 == num3:
        print("TRIANGULO EQUILATERO")
    if (num1 == num2 and num1 != num3) or (num1 == num3 and num1 != num2)or (num2 == num3 and num1 != num2):
        print("TRIANGULO ISOSCELES")

