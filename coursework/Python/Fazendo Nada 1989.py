while True:
    temp, minut = input().split()
    temp = int(temp)
    minut = int(minut)
    if temp == -1 and minut == -1:
        break
    
    time = 0
    item = 0
    total = 0
            
    capit = input().split()
            
    while item < len(capit):
        capit[item] = int(capit[item])
        time = time + (capit[item] * minut)
        total = time + total
        item = item + 1
                
    print(total)
