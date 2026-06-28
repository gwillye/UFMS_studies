while True:
    try:
        cont = 0
        min = 0
        while cont < 10:
            num = int(input())
            if cont == 0:
                men = num
            else:
                if men > num:
                    men = num
            cont = cont + 1
        cont = 0
        while cont < 10:
            num = int(input())
            if cont == 0:
                mai = num
            else:
                if mai < num:
                    mai = num
            cont = cont + 1
        med = (mai + men) / 2
        print(med)
    
    except EOFError:
        break


