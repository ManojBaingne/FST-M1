try:
    print(x)
except NameError:
    print("X not declared the type")

except:
    print("Some other error")

finally:
    print("This block will run always")

print("this is after error")