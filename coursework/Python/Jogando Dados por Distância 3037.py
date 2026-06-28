tot = int(input())
cont = 0
while cont < tot:
  c = 0
  cm = 0
  joao = 0
  maria = 0
  while c < 3:
    j1, j2 = input().split()
    j1 = int(j1)
    j2 = int(j2)
    joao = joao + j1 * j2
    c = c + 1
  while cm < 3:
    m1, m2 = input().split()
    m1 = int(m1)
    m2 = int(m2)
    maria = maria + m1* m2
    cm = cm + 1
  if joao > maria:
    print("JOAO")
  else:
    print("MARIA")
  cont = cont + 1
