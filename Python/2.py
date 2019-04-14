def summa (first, second):
    return first + second

def multip (first, second):
    return first * second

def main():
    first = int(input("Enter first value: "))
    second = int(input("Enter second value: "))
    print(summa(first,second))
    print(multip(first,second))

if __name__ == "__main__":
    main()