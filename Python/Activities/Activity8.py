inputString = list(input("Enter numbers separated by space").split(" "))
firstNumber = inputString[1]
lastNumber = inputString[-1]

if(firstNumber==lastNumber):
    print("True")
else:
    print("false")