#O código a seguir é referente ao exercício 2407 no BeeCrowd, que foi realizado como exercício avaliativo na disciplina de Sistemas de Informação turma 2022-01 com o professor Irineu Sotoma
'''Depois de pensar em uma lógica extensa, mas funcional, acredito que colocar em um laço vai ser a melhor solução. Vou colocar um contador que vai rodar o mesmo numero de vezes que
o numero inserido dentro do codigo, e conforme o valor do contador se atualiza, vou adicionar as variaveis agua e esgoto mais um preço, e no final imprimir tudo.'''
#Primeiro passo é receber a variável
num = int(input())
#Declaramos o contador e as variaveis de agua e esgoto
cont = 0
agua = 0
esgo = 0
while cont <= num:
    if 1 <= cont and cont <= 10:
#A partir de agora, vamos atualizar o valor das variaveis baseado em que lugar o contador se encaixa
        agua = agua + 6.08
        esgo = esgo + 4.26
    elif 11 <= cont and cont <= 15:
        agua = agua + 7.79
        esgo = esgo + 5.45
    elif 16 <= cont and cont <= 20:
        agua = agua + 7.93
        esgo = esgo + 5.55
    elif 21 <= cont and cont <= 25:
        agua = agua + 8.75
        esgo = esgo + 6.13
    elif 26 <= cont and cont <= 30:
        agua = agua + 10.76
        esgo = esgo + 7.53
    elif 31 <= cont and cont <= 50:
        agua = agua + 12.9
        esgo = esgo + 9.03
    elif cont >= 51:
        agua = agua + 14.21
        esgo = esgo + 9.95
#E no final do laço, atualizamos o contador
    cont = cont + 1
#Agora, juntamos a soma total, que junta tanto o esgoto quanto a agua e o preço padrao:
som = agua + esgo + 15.05
#Após rodar o código, mandamos imprimir os valores desejados:
print("Consumo: %i metros cúbicos" %num)
print("Total a pagar: R$ 15.05 + R$ %.2f + R$ %.2f = R$ %.2f" %(agua, esgo, som))