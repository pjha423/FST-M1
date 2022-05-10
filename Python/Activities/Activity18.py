from ast import Import
from traceback import print_tb

import pandas


import pandas
dataframe = pandas.read_csv("Activity17.csv")
print(dataframe)

print("Usernames")
print(dataframe["Usernames"])

print("username : ",dataframe["Usernames"][1]," Password : ",dataframe["Passwords"][1])

print("sort Usernames column in ascending order")
print(dataframe.sort_values("Usernames"))


print("sort Passwords column in descending order")
print(dataframe.sort_values("Passwords",ascending=False))

