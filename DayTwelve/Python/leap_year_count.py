def leap_year_count():

    for count in range(1900,2025,1):

        if count % 4 == 0:

            print(count)

result = leap_year_count()

print(result)
