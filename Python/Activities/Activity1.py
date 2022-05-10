from datetime import date



name = input("Enter your name")
age = int(input("How old are you?"))
year = 100-age
currentDate = date.today()
currentYear = currentDate.year
yearTurnHundred = currentYear+year
print("you will turn hundred in ",yearTurnHundred )