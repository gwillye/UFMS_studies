num1, num2 = input().split()
num2 = int(num2)
num1 = int(num1)
if num1 == 1:
    pre1 = 4.00
if num1 == 2:
    pre1 = 4.50
if num1 == 3:
    pre1 = 5.00
if num1 == 4:
    pre1 = 2.00
if num1 == 5:
    pre1 = 1.50
pre = pre1 * num2
print("Total: R$ ""%.2f" %pre)
