//Funções de Probabilidade

//Função Fatorial
def fatorial(num):
  result = num
  cont=num-1
  if num == 0:
    return 1 
  while cont>=1:
    result=result*cont
    cont=cont-1
  return result
  
//Função Combinação
def comb(num):
 n = int(input())
 p = int(input())
 n1 = fatorial(n)
 p1 = fatorial(p)
 a = n - p
 a = fatorial(a)
 comb = n1 / (a * p1)
 print(comb)
z = 0
comb(z)


//Fatorial
num = int(input())
num = fatorial(num)
print(num)

