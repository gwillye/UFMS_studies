Dia, dia = input().split()
dia = int(dia)
hor, dp, minut, doispontos, seg = input().split()
hor = int(hor)
minut = int(minut)
seg = int(seg)
Dia2, dia2 = input().split()
dia2 = int(dia2)
hor2, dp2, minut2, doispontos2, seg2 = input().split()
hor2 = int(hor2)
minut2 = int(minut2)
seg2 = int(seg2)
time = dia * 86400 + hor * 3600 + minut * 60 + seg
time2 = dia2 * 86400 + hor2 * 3600 + minut2 * 60 + seg2
time = time2 - time
dia = time // 86400
hor = time % 86400
horas = hor // 3600
minut = hor % 3600
minutos = minut // 60
seg = minut % 60
print("%i" " dia(s)" %dia)
print("%i" " hora(s)" %horas)
print("%i" " minuto(s)" %minutos)
print("%i" " segundo(s)" %seg)

