#O código a seguir é referente ao exercício 2409 no BeeCrowd, que foi realizado como exercício avaliativo na disciplina de Sistemas de Informação turma 2022-01 com o professor Irineu Sotoma
'''Minha ideia e criar dois while, que vao ficar recebendo os numeros, e vao criar uma variavel men para o menor e mai para o maior, e entao calcular a media em seguida'''
#While True para que o codigo fique rodando infinito, ate um EOFE error
while True:
    try:
#O contador que recebe os numeros 
        cont = 0
# Como o menor numero deve ser resetado a cada ciclo, criamos aqui a variavel 
        min = 0
# Esse laco vai ser executado dez vezes, procurando pelo menor numero
        while cont < 10:
            num = int(input())
# Como nao vai existir um menor numero para o primeiro, declaramos que ele eh o menor numero
            if cont == 0:
# Os numeros seguintes passam por uma verificacao para descobrir quem eh o menor
                men = num
            else:
                if men > num:
                    men = num
# Atualizamos o contador para ele rodar apenas dez vezes
            cont = cont + 1
#Zeramos o contador antes de fazer a mesma coisa, mas dessa vez em um laco para encontrar o maior numero
        cont = 0
        while cont < 10:
            num = int(input())
            if cont == 0:
                mai = num
            else:
                if mai < num:
                    mai = num
            cont = cont + 1
#Apos achar os dois valores desejados, calculamos a media e a imprimimos. Como estamos trabalhando com inteiros, o maximo de casas decimais a se usar sera uma, quando a soma de ambos for impar
        med = (mai + men) / 2
        print(med)
    
    except EOFError:
        break