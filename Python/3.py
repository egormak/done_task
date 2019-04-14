def first_action (cand_price, cook_price):
    return (cand_price/1000*300) + (cook_price/1000*400)

def second_action (cand_price, cook_price):
    return (3 * (( cand_price * 2 ) + ( cook_price / 1000 * 1800 )))

def main():
    candies_price = int(input("Enter price for candies(1 kg): "))
    cookie_price = int(input("Enter price for cookie(1 kg): "))
    print(first_action(candies_price,cookie_price))
    print(second_action(candies_price,cookie_price))

if __name__ == "__main__":
    main()