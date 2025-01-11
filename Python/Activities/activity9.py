list1 = [1,2,3,4,5,6,7,8,9]
list2 = [10,11,1,2,13,14,15,16,17,18,19,20]
numbers = []

for num in list1:
    if num % 2 == 1:
        numbers.append(num)

for num in list2:
    if num % 2 == 0:
        numbers.append(num)

print(numbers)