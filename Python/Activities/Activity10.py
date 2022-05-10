inputTuple = tuple(input("Enter numbers separated by space. ").split())
print("Numbers divisible by 5:")
for i in inputTuple:
    if(int(i) % 5 == 0):
        print(i)

