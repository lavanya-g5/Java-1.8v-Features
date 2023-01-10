/*
 * Lambda expression example 4 with multiple parameters
 */

package com.practice1;

interface Addable {
	public int add(int a, int b);
}

public class LambdaExpressionExample4 {

	public static void main(String[] args) {

		// Multiple parameters in lambda expression
		Addable add = (x, y) -> x + y;
		System.out.println("Result: " + add.add(2, 3));

		// Multiple parameter with data type in lambda expression
		Addable add1 = (int a, int b) -> (a + b);
		System.out.println("Result1: " + add1.add(4, 6));
	}
}

// OUTPUT
// Result: 5
// Result1: 10