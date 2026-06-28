cont = int(input())

while cont > 0:
    com = float(input())
    day = 0
    while com > 1:
        com = com / 2
        day = day + 1
        
    print("%i dias" %day)
    cont = cont - 1
