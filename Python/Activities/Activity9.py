list1 = [11,12,13,14,15,16]
list2 = [21,22,23,24,25,26]

print("list 1",list1)
print("list 2",list2)

list3 = []

for i in list1:
    if(i % 2!=0):
        list3.append(i)

for j in list2:
    if(j % 2 == 0):
        list3.append(j)

print("list 3",list3)        

        