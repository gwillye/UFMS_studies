#Equacao de segundo grau
import math
A, B, C = input().split()
A = float(A)
B = float(B)
C = float(C)

if A == 0.0  or (B ** 2 - 4 * A * C) < 0:
  print("Impossivel calcular")
else:
  delta = (B * B) - (4 * A * C)
  raiz = math.sqrt(delta)
  R1 = ((-1 * B) + raiz) / (2 * A)
  R2 = ((-1 * B) - raiz) / (2 * A)
  print("R1 = %.5f" %R1)
  print("R2 = %.5f" %R2)
