/*
 * Lambda expression example 2 with no parameter
 */
package com.practice1;

interface Sayable {
	public String say();
}

public class LambdaExpressionExample2 {
	public static void main(String[] args) {

		// Lambda with no parameter
		Sayable s = () -> {
			return "I have nothing to say...";
		};
		System.out.println(s.say());
	}
}

// OUTPUT
// I have nothing to say...