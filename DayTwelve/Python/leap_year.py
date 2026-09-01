def leap_year():

    counter = 0

    for count in range(1900,2025,1):

        if count % 4 == 0:

            counter+=1

    return counter

result = leap_year()

print(result)
