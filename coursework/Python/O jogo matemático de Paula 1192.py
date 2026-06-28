test = int(input())

while test > 0:
  string = input()
  if string[0] == string[2]:
    print(int(string[0]) * int(string[2]))
  elif string[1].isupper():
    print(int(string[2]) - int(string[0]))
  elif string[1].islower():
    print(int(string[0]) + int(string[2]))
  test = test - 1
