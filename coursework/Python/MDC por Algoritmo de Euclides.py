a, b = input().split()
a = int(a)
b = int(b)
if (b == 0):
  print(a)
else:
  while (b != 0):
       r = a % b
       a = b
       b = r
  print(a)
