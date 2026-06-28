N = int(input())
ced = N
cem = ced // 100
ced = ced % 100
cinq = ced // 50
ced = ced % 50
vint = ced // 20
ced = ced % 20
dez = ced // 10
ced = ced % 10
cin = ced // 5
ced = ced % 5
dois = ced // 2
ced = ced % 2
print("%i" %N)
print("%i ""nota(s) de R$ 100,00" %cem)
print("%i ""nota(s) de R$ 50,00" %cinq)
print("%i ""nota(s) de R$ 20,00" %vint)
print("%i ""nota(s) de R$ 10,00" %dez)
print("%i ""nota(s) de R$ 5,00" %cin)
print("%i ""nota(s) de R$ 2,00" %dois)
print("%i ""nota(s) de R$ 1,00" %ced)

