user1 = input("What is Player 1's name? ")
	
user2 = input("What is Player 2's name? ")

choiceofuser1 = input(user1 + ", What you do you choose?  Rock, Paper or Scissors?" ).lower()
choiceofuser2 = input(user2 + ", What you do you choose?  Rock, Paper or Scissors?" ).lower()

if choiceofuser1 == choiceofuser2:
    print("It's a tie")
elif choiceofuser1 == 'rock':
    if choiceofuser2 == 'scissors':
        print(user1 + ", win with " +choiceofuser1)
    else:
        print("Paper wins")

elif choiceofuser1 == 'scissors':
    if choiceofuser2 == 'paper':
        print(user1 + ", win with " +choiceofuser1)
    else:
        print("Rock wins")

elif choiceofuser1 == 'paper':
    if choiceofuser2 == 'rock':
        print(user1 + ", win with " +choiceofuser2)
    else:
        print("Scissors wins")        
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")


    repeat = input("Do you want to play another round? Yes/No: ").lower()
		
    if(repeat == "yes"):
        pass
    elif(repeat == "no"):
        raise SystemExit
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit