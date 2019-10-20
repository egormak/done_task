package main

import (
	"fmt"
	"math"
)

func main() {
	var x float64 = 1.7
	var y float64 = 3

	resultX := math.Pow(x+1, 2) + 3*(x+1)
	resultY := math.Pow(y+1, 2) + 3*(y+1)

	fmt.Println("Result for x: ", resultX)
	fmt.Println("Result for y: ", resultY)
}

// Вычислите значение выражения (x+1)^2+3(x+1) при:
//   а) x=1.7;
//   б) x=3.
// Ответ:
//   а) 15.39
//   б) 28
