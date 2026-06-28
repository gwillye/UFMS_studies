print("Um dia, monstros saíram da terra. Ninguém sabe de onde eles vieram, apenas que rapidamenteconquistaram tudo em seu caminho. Vendo que a situação estava caótica, o rei então decidiu criar uma unidade especial treinada e preparada para enfrentar estes monstros. Essa unidade de mercenários recebeu o nome de Sunrise (em português, Amanhecer). Sua missão? Exterminar todos os monstros que assolam o reino.")
print("Seja bem-vindo novo agente! Qual será seu apelido?")
nick = input()
car = 10
con = 10
des = 10
forc = 10
inte = 10
sab = 10
cont = 0
while cont == 0:
  print("Bem vindo ""%s""! Escolha em qual classe você deseja operar: 'Swordman'(Espadachim), um poderoso guerreiro meelee (corpo-a-corpo), ou 'gunslinger'(Atirador), um especialista ranged (longo alcance) que elimina os inimigos com uma grande distância? \nPara fazer sua escolha, digite 'gunslinger' ou 'swordman' sem as aspas." %nick)
  classe = input()
  if classe == 'swordman':
    print(classe)
    forc = forc + 2
    cont = 1
  if classe == 'gunslinger':
    print(classe)
    des = des + 2
    cont = 1
print("Boa escolha agente! Bem-vindo ao menu principal! Para decidir suas próximas ações, digite 'Info'. Se quiser ver sua próxima missão, digite 'Objetivos'; Para ver seus status, digite 'Status'; Para ir para o Mapa, digite 'Mapa'.")
main = 0
#Contadores
miss1 = 0
m1ond = 0
vilas = 0
while main == 0:
    print("\nMENU PRINCIPAL")
    menu = input()
    if menu == 'Status':
        print("Seus Status atuais são: \nCarisma: %i \nConstituição: %i \nForça: %i \nDestreza: %i \nInteligência: %i \nSabedoria: %i" %(car, con, forc, des, inte, sab))
    elif menu == 'Objetivos':
        if miss1 == 0:
            print("Missão 1: \nMonstros apareceram em uma vila próximo daqui, ao lado da floresta de Wornnie. Sua missão é ir até lá e exterminar todas as ondas de monstros que ameaçam os cidadãos.")
            print("Ondas concluídas: %i" %m1ond)
            vilas = 1
    elif menu == 'Mapa':
        print("Total de vilas desbloqueadas: %i" %vilas)
        if vilas == 1:
            cont = 0
            while cont == 0:
                print("\nVila de Sotom (para selecionar, digite 1) \nPara voltar ao Menu Principal, digite 0")
                naveg = int(input())
                if naveg == 0:
                    cont = 1
                elif naveg == 1:
                    cont = 1
                    missao = 0
                    while missao == 0:
                        print("Missão em execução... \n")
                else:
                    print("Opção inválida!")