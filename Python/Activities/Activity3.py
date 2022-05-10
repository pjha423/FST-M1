from ast import While


player1_name = input("Enter player1 name")
player2_name = input("Enter player2 name")

player1_Selection = input(player1_name+ "..Select one of these options...Rock, paper and scissors").lower()
player2_Selection = input(player2_name+ "..Select one of these options...Rock, paper and scissors").lower()


if player1_Selection == player2_Selection:
    print ("tie")
elif player1_Selection == "rock":
    if player2_Selection == "scissors":
        print("rock wins")
    else :
        print("paper wins")
elif player1_Selection == "scissors":
    if player2_Selection  == "paper":
        print("scissors wins")
    else:
        print("rock wins")
elif player1_Selection == "paper":
    if player2_Selection == "rock":
        print("paper wins")     
    else:
        print("scissors wins")
else :
    print("Please enter valid input")                            
