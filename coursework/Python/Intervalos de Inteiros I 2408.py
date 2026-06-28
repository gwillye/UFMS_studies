#O código a seguir é referente ao exercício 2408 no BeeCrowd, que foi realizado como exercício avaliativo na disciplina de Sistemas de Informação turma 2022-01 com o professor Irineu Sotoma
'''A ideia é desenvolver este código por partes. Primeiro vou fazer o que o código pede, para por último criar o laço e as especificações pedidas em torno da saída.
Inicialmente, desenvolverei a parte lógica do código, então vou montar um while que vai rodar com um contador averiguando todos os números de dentro do intervalo para verificar quais
deles são par, quais deles são impar e quantos são divisiveis por 5, para ai então definir todos eles nas variaveis e imprimir. Depois, usando um sistema de pula, que foi aplicado em
um dos exercicios da lista de preparação, desenvolver um método para poder pular linha sempre, com exceção do ultimo codigo.'''
#Reg é o registrador, ele vai identificar a hora de encerrar o laço
reg = 0
while reg == 0:
#Declaração das variáveis iniciais
    num1, num2 = input().split()
    x = int(num1)
    y = int(num2)
#Aqui defino quantos inteiros terão no código, que é um total de o maior menos o menor menos um
    inteiros = y - x - 1
#Agora criamos um laço que vai fazer as verificações dentro do intervalo que desejamos. Primeiro, se nomeia as variáveis com contador:
    cont = x + 1
    impar = 0
    par = 0
    div = 0
#Definimos o contador como o intervalo + 1, assim ele vai começar como um numero de dentro do intervalo, e vai rodar até passar por todos os outros
    while cont < y:
#Vamos verificar se o numero é par ou ímpar, e adicionar ao contador
        if cont % 2 != 0:
            impar = impar + 1
        else:
            par = par + 1
#Agora verifica se ele é divisível por 5
        if cont % 5 == 0:
            div = div + 1
        cont = cont + 1
#Por fim vem os print pedidos
    print("Intervalo (%i, %i):" %(x, y))
    print("Quantidade de inteiros: %i" %inteiros)
    print("Quantidade de pares: %i" %par)
    print("Quantidade de ímpares: %i" %impar)
    print("Quantidade de divisíveis por 5: %i" %div)
    #Pra finalizar, averiguamos se é necessário encerrar o laço. Se div for par, imprime uma nova linha. Se for ímpar, adiciona 1 ao reg, que encerra o contador
    if div % 2 != 0:
        print("")
    else:
        reg = 1
    