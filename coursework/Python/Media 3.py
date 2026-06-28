not1, not2, not3, not4 = input().split()
not1 = float(not1)
not2 = float(not2)
not3 = float(not3)
not4 = float(not4)

media = (not1 * 2 + not2 * 3 + not3 * 4 + not4 * 1) / 10

if media >= 7:
    print("Media: ""%.1f" %media)
    print("Aluno aprovado.")
elif media < 5:
    print("Media: ""%.1f" %media)
    print("Aluno reprovado.")
else:
    print("Media: ""%.1f" %media)
    print("Aluno em exame.")
    nota = float(input())
    medf = (media + nota) / 2
    if medf < 5:
        print("Nota do exame: ""%.1f" %medf)
        print("Aluno reprovado.")
        print("Media final: ""%.1f" %medf)
    else:
        print("Nota do exame: ""%.1f" %nota)
        print("Aluno aprovado.")
        print("Media final: ""%.1f" %medf)

