def trans_app(number):    
    print("transaction_main_menu:")

    main_menu = """
    1 Deposit
    2 Widthdrawal
    3 Show Transactions
    4 Exit
    """
    print(main_menu)
    choice = int(input("choice an option"))
    if choice == 1:
        deposite = int(input("Enter deposit amount: "))
        first_balance = balance + deposit
        print("Deposit successful")
        print("The balance is", balance)
        break

    elif choice == 2:
        widthdrawal = int(input("Enter widthdrawal amount: "))
        if widthdrawal > balance:
            print("Insufficient funds")
        else:
            second_balance = first_balance - widthdrawal
            print("Widthdrawal successful")
            print("Remaining balance is:", second_balance)
            

    elif choice == 3:
        print("Deposited:", {deposite})
        print("New balance is:", first_balance)
        print("Widthdraw:", widthdrawal)
        print("New balance is:", second_balance)
        
    elif choice == 4:
        print("Final balance is:", second_balance)
        print("Thank you for using Transaction Log App")
        break










