while True:
    try:
        novalinha = ""
        linha = input()

        M = True

        for letra in linha:
            if letra == ' ':
                novalinha += ' '
                continue
            if M:
                novalinha = novalinha + letra.upper()
                M = False
            else:
                novalinha = novalinha + letra.lower()
                M = True
        print(novalinha)
    except EOFError:
        break
