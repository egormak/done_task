package main

import (
	"fmt"
)

func sum(x, y float64) float64 {
	return x + y
}
func multipl(x, y float64) float64 {
	return x * y
}

func main() {
	var x, y float64

	fmt.Print("Enter Value x: ")
	fmt.Scan(&x)
	fmt.Print("Enter Value y: ")
	fmt.Scan(&y)

	fmt.Println("Summa: ", sum(x, y))
	fmt.Println("Multiple: ", multipl(x, y))
}
