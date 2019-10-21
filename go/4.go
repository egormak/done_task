package main

import "fmt"

func main() {
	var countCandy, summaCandy, takeCandy, totalSumma float64
	fmt.Print("Введите кг конфет: ")
	fmt.Scan(&countCandy)
	fmt.Print("Введите сумму: ")
	fmt.Scan(&summaCandy)
	priceCandy := summaCandy / countCandy
	fmt.Print("Сколько необходимо конфет? ")
	fmt.Scan(&takeCandy)
	summaCandyTake := priceCandy * takeCandy
	fmt.Println("Стоимость конфет: ", summaCandyTake)
	fmt.Print("Сколько у вас денег? ")
	fmt.Scan(&totalSumma)
	canTake := totalSumma / priceCandy
	fmt.Println("Можно взять: ", canTake)
}
