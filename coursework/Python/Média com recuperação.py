Caso ainda não tenha passado, se imprime a nova MA e a mensagem que ele reprovou.'''
#O primeiro passo é receber os 4 valores das notas, que erão expressos como variáveis: "P1", "P2", "P3", "TP"
P1, P2, P3, TP = input().split()
#Em seguida, convertemos os valores inseridos para um formato de número, e não mais string
P1 = float(P1)
P2 = float(P2)
P3 = float(P3)
TP = float(TP)
#Em seguida, se faz o cálculo de MA.
#Foi feito um código semelhante em "Média 3", então para fins de comparação, o senhor pode averiguar no link:https://github.com/GWillye/Python/blob/main/Media%203
#Agora vamos determinar a primeira média, a MA, que recebe P1, P2 e P3
MA = (((P1 + P2 + P3) / 3) * 80 + (TP * 20)) / 100
#Após isso, se deve averiguar se a média do aluno é menor que 6,0
if MA < 6:
    print("O(A) estudante precisa fazer a prova optativa!")
#Como o aluno não foi aprovado, se pede como entrada a prova optativa, aqui chamada de OPT
    OPT = float(input())
#Após se receber a OPT, deve-se substituir ela pela menor nota
#Para isso, vamos achar o maior numero entre elas.
    Menor = P1
    if Menor > P2:
        Menor = P2
    if Menor > P3:
        Menor = P3
#Agora que foi encontrada a menor nota, se deve descobrir se a OPT é maior ou menor que ela e, em seguida, substituir a menor nota pela OPT se necessário:
    if Menor == P1 and OPT > P1:
        P1 = OPT
    if Menor == P2 and OPT > P2:
        P2 = OPT
    if Menor == P3 and OPT > P3:
        P3 = OPT
#Após atualizar o valor (ou não), calcula-se novamente a MA e se descobre se o aluno passou ou reprovou
    MA = (((P1 + P2 + P3) / 3) * 80 + (TP * 20)) / 100
    if MA < 6:
        print("MA: ""%.1f" %MA)
        print("Estudante reprovado(a)")
    else:
        print("MA: ""%.1f" %MA)
        print("Estudante aprovado(a)")
#Se cria também o else, onde vai sser inserido a informação final, caso o MA seja maior ou igual a 6
else:
    print("MA: ""%.1f" %MA)
    print("Estudante aprovado(a)")
#Fim de código! - Criado por Gabriel Willye

