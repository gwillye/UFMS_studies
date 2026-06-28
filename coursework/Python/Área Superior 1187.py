# op = Ler a operação a ser realizada ('S' ou 'M')
op = input()

# Mat = lista vazia para a matriz
Mat = []

# para i de 0 a 11
for i in range(12):
    # lst = Criar lista vazia para a linha
    lst = []
    # para j de 0 a 11
    for j in range(12):
        # Ler o valor, convertê-lo para float
        # e atribuí-lo à lista lst
        lst.append(float(input()))
    # Colocar a linha lst na matriz Mat
    Mat.append(lst)

# Contador n para a quantidade de elementos de interesse
n = 0

# Variável soma para armazenar a soma dos
# elementos de interesse
soma = 0.0

# cf = 10
cf = 10
cont = 11
# para i de 0 a 10
for i in range(5):
    # para j de 0 a cf
    
    for j in range(12):
        if j > i and j < cont:
            soma += Mat[i][j]
            n += 1
    cont -= 1
        
# se op == 'S'
if op == 'S':
    # Mostrar soma com 1 casa decimal
    print("{0:.1f}".format(soma))
# senão
else:
    # Mostrar soma/n com 1 casa decimal
    print("{0:.1f}".format(soma/n))
