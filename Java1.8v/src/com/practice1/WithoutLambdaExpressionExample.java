/*
 * Without Lambda expression example.
 */

package com.practice1;

interface Drawable {
	public void draw();
}

public class WithoutLambdaExpressionExample {

	public static void main(String[] args) {
		int width = 10;

		// Without Lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			@Override
			public void draw() {
				System.out.println("Drawing: " + width);
			}
		};
		d.draw();
	}
}

// OUTPUT
// Drawing: 10