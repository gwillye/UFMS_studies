'''
Desenvolva um algoritmo que, dado uma lista de números, calcula de forma recursiva o fatorial de cada número presente na lista

Ex:
Input: [1, 2, 3, 4, 5]
Output: [1, 2, 6, 24, 120]
'''

def fatorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * fatorial(n-1)

def fat(lista):
    return [fatorial(x) for x in lista]

lista_num= [1, 2, 3, 4, 5]
result = fat(lista_num)
print(result)

