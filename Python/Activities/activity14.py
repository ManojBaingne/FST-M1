def fibonacci(num):
    if num <=1:
        return num
    else:
        return fibonacci(num-1) + fibonacci(num-2)
    
num_input = int(input("Enter the number: "))

if num_input < 1:
    print("Enter the positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(num_input):
        print(fibonacci(i))