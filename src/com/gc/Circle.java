package com.gc;

import java.text.DecimalFormat;

public class Circle {
	private double radius;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	// Constructor with arguments.
	public Circle(double radius) { 								// Build Spec A
		super();
		this.radius = radius;
	}

	public double getCircumference(double radius) { 			// Build Spec B
		return 2 * radius * Math.PI;
	}

	public String getFormattedCircumference(double radius) {	// Build Spec C
		return formatNumber(getCircumference(radius));
	}

	public double getArea(double radius) { 						// Build Spec D
		return radius * radius * Math.PI;
	}

	public String getFormattedArea(double radius) { 			// Build Spec E
		return formatNumber(getArea(radius));
	}

	public String formatNumber(double x) { 						// Build Spec F
		DecimalFormat df = new DecimalFormat("#.00");
		df.format(x);
		return String.format("%.2f", x);

	}

}
