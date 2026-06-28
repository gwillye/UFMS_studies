num1, num2 = input().split()
num1 = int(num1)
num2 = int(num2)

mdc = num1

while num1 % mdc != 0 or num2 % mdc != 0:
  mdc = mdc - 1
print(mdc)

