dict_Fruits = {
    "apple": 20,
    "grapes": 30,
    "banana": 10,
    "orange": 25
}

fruit = input("Enter a fruit name to check it is available").lower()

if (fruit in dict_Fruits):
   print("Fruit is available")
else:
   print("Fruit is not available")    
