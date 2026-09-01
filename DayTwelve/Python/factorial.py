def factorial(number):

    product = 1    
    for count in range(number, 0, -1):

        product = product * count

    return product

number = int(input("Enter a number: "))

result = factorial(number)

print(result) 

        
