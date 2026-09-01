def gcd(number_one, number_two):

    common_number = 1
    for number in range(1, number_one +1):

        if number_one % number == 0 and number_two % number == 0:

            common_number = number

    return common_number

number_one = 12

number_two = 18

result = gcd(number_one, number_two)

print(result)
            
    
