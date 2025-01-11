def sum_list(numbers):
    sum = 0
    for number in numbers:
        sum = sum + number
    return sum

num_list = [10,20,30,40,50]
result = sum_list(num_list)

print(result)