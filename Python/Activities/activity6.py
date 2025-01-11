"""for i in range(10):
    print(str(i)*i)"""

for i in range(1,10):
    for j in range(1,10):
        if j<=i:
            print(i, end=" ")
    print()

