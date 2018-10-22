package com.gc;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double radius = 0;
		String cont = "y";

		Circle circle = new Circle();

		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Circle Tester");
			System.out.println("Enter radius: ");
			radius = scan.nextDouble();
			System.out.println();

			System.out.println("Unformatted Circumference: " + circle.getCircumference(radius));
			System.out.println("Unformatted Area: " + circle.getArea(radius));
			
			System.out.println("Circumference: " + circle.getFormattedCircumference(radius));
			System.out.println("Area: " + circle.getFormattedArea(radius));

			System.out.println();
			System.out.println("Continue? (y/n): ");
			cont = scan.next();
			System.out.println();

		}
		scan.close();
		System.out.println("Thanks for playing!");

	}
}
