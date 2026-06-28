cont = int(input())
while cont > 0:
    jog1, jog2 = input().split()
    if jog1 == 'tesoura':
        if jog2 == 'papel' or jog2 == 'lagarto':
            print("rajesh")
        elif jog2 == 'pedra' or jog2 == 'spock':
            print("sheldon")
        else:
            print("empate")
    elif jog1 == 'spock':
        if jog2 == 'pedra' or jog2 == 'tesoura':
            print("rajesh")
        elif jog2 == 'papel' or jog2 == 'lagarto':
            print("sheldon")
        else:
            print("empate")
    elif jog1 == 'pedra':
        if jog2 == 'tesoura' or jog2 == 'lagarto':
            print("rajesh")
        elif jog2 == 'papel' or jog2 == 'spock':
            print("sheldon")
        else:
            print("empate")
    elif jog1 == 'papel':
        if jog2 == 'pedra' or jog2 == 'spock':
            print("rajesh")
        elif jog2 == 'tesoura' or jog2 == 'lagarto':
            print("sheldon")
        else:
            print("empate")
    elif jog1 == 'lagarto':
        if jog2 == 'papel' or jog2 == 'spock':
            print("rajesh")
        elif jog2 == 'lagarto':
            print("empate")
        else:
            print("sheldon")
    cont = cont - 1
