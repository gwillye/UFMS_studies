not1 = float(input())
while 0 > not1 or 10 < not1:
    print("nota invalida")
    not1 = float(input())
not2 = float(input())
while 0 > not2 or 10 < not2:
    print("nota invalida")
    not2 = float(input())
else:
    media = (not1 + not2) / 2
    print("media = ""%.2f" %media)

