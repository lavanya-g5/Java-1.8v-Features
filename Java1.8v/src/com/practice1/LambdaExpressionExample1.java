/*
 * Lambda Expression (From 1.8 version)
 * Lambda expression is used to provide implementation of Functional interface.
 * Functional interface - Is an interface which has only one abstract method (Single abstract method SAM)
 * @FunctionalInterface - Which is used to declare an interface as functional interface.
 * Java lambda expression is treated as function, so compiler does not create .class file.
 * Lambda Advantages - To provide the implementation of functional interface and Less coding.
 * Syntax: (argument-list) -> {Body};
 * Argument-list: It can be empty or non-empty as well.
 * Arrow-token: Used to link argument-list & Body of expression.
 * Body: It contains expressions and statements for lambda expression.
 */

// NO PARAMETER SYNTAX:
// () -> {body};

/*
 * Lambda expression example with no parameter.
 */
package com.practice1;

// @FuntionalInterface  // Optional
interface Drawable1 {
	public void draw();
}

public class LambdaExpressionExample1 {
	public static void main(String[] args) {
		int height = 15;

		// With Lambda
		Drawable d = () -> {
			System.out.println("Drawing: " + height);
		};
		d.draw();
	}
}

// OUTPUT
// Drawing: 15