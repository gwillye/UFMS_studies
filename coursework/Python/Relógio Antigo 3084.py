while True:
  try:
    anghor, angmin = input().split()
    anghor = int(anghor)
    angmin = int(angmin)
    if angmin == 0 and anghor == 0:
      print("00:00")
    else:
      hor = int((anghor / 360) * 12)
      min = int((angmin / 360) * 60)
      if min < 10 or hor < 10:
        if min < 10 and hor >= 10:
          print("%i"":0""%i" %(hor, min))
        if hor < 10 and min >= 10:
          print("0""%i"":""%i" %(hor, min))
        if hor < 10 and min < 10:
          print("0""%i"":0""%i" %(hor, min))      
      else:      
        print("%i"":""%i" %(hor, min))
  except EOFError:
    break
