listOne = [10, 20, 23, 11, 17]
listTwo = [13, 43, 24, 36, 12]

ListThree = []

for x in listOne:
    if(x%2!=0):
        ListThree.append(x)

for y in listTwo:
    if(y%2==0):
        ListThree.append(y)

print("Generated List three is" , ListThree)