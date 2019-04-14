def main():
    candies_user_mass = int(input("Enter candies mass: "))
    candies_user_price = int(input("Enter candies price: "))
    candies_price = candies_user_price / candies_user_mass

    user_candies_count = int(input("Enter how much do you need(kg): "))
    user_candies_price = candies_price * user_candies_count
    print("You need to pay: ", user_candies_price)

    user_candies_money = int(input("Enter how much money do you have: "))
    user_candies_mass = user_candies_money / candies_price
    print("You can buy: ", user_candies_mass)

if __name__ == "__main__":
    main()