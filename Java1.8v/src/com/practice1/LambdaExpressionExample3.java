/*
 * Lambda Expression example 3 with single parameter
 */

package com.practice1;

interface Sayable1 {
	public String say(String name);
}

public class LambdaExpressionExample3 {
	public static void main(String[] args) {

		// Lambda Expression with single parameter
		Sayable1 s = (name) -> {
			return "Hello " + name;
		};
		System.out.println(s.say("ABC"));
	}
}

// OUTPUT
// Hello ABC