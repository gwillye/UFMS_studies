while True:
  try:
    
    num1, num2 = input().split()
    num1 = int(num1)
    num2 = int(num2)
    a = num1
    b = num2
    while (b != 0):
      r = a % b
      a = b
      b = r

    result = (num1 / a) * 2 + (num2 / a) * 2
    result = int(result)
    print(result)
  
  except EOFError:
    break
