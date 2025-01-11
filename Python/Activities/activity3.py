#get user name as input
player1 = input("Enter the 1st palyer name ")
player2 = input("Enter the 2nd player name ")

#enter the user choice
user1_choice = input(player1 +" Choose anyone of Rock, Paper or Scissors: ").lower()
user2_choice = input(player2 +" Choose anyone of Rock, Paper or Scissors: ").lower()
if user1_choice == user2_choice:
    print("Match is Tie")
elif user1_choice == "rock":
    if user2_choice == "scissors":
        print("Rock wins the match")
    else:
        print("Paper wins the match")
elif user1_choice == "scissors":
    if user2_choice == "paper":
        print("Scissor wins the match")
    else:
        print("Rock wins the match")
elif user1_choice == "paper":
    if user2_choice == "rock":
        print("paper wins the match")
    else:
        print("scissors wins the match")
else:
    print("invalid input: please enter correct input")
