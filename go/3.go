package main

import "fmt"

func main() {
	var aCandy float64 = 0.3
	var aCook float64 = 0.4
	var bCandy float64 = 1.8
	var bCook float64 = 2
	var count float64 = 3
	var priceCandy, priceCook float64

	fmt.Print("Введите цену за 1 кг конфет: ")
	fmt.Scan(&priceCandy)
	fmt.Print("Введите цену за 1 кг печенья: ")
	fmt.Scan(&priceCook)

	firstSum := priceCandy*aCandy + priceCook*aCook
	secondSum := count * (priceCandy*bCandy + priceCook*bCook)
	fmt.Println("Первая покупка: ", firstSum)
	fmt.Println("Вторая покупка: ", secondSum)

}
