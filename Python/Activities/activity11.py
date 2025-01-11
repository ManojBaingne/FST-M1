fruit = {
    "mango" : 15,
    "orange" : 10,
    "apple" : 20,
    "banana" :  30

}

fruit_key = input("Which fruit want to check: ").lower()
if fruit_key in fruit:
    print("yes, available")
else:
    print("No, it is not available")