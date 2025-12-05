numbers = input("Enter a sequence of comma separated values: ").split(",")

sum = 0

for num in numbers:
    sum = sum+int(num)

print("Sum of the given numbers is " , sum)   

