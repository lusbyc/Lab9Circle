import java.text.DecimalFormat;

public class CircleTwo {
	private double radius;

	// No-argument constructor.
	public CircleTwo() {
	}

	// Constructor with arguments.
	public CircleTwo(double radius) { 					// Build Spec A
		super();
		this.radius = radius;
	}
	
//	public double getRadius() {  // not requested in the build specs
//		return radius;
//	}
//
//	public void setRadius(double rad) {  // not requested in the build specs
//		radius = rad;
//	}
//
	
	public double getCircumference() {  			// Build Spec B
		return 2 * radius * Math.PI;
	}
	
	public String getFormattedCircumference() {		// Build Spec C
		return formatNumber(getCircumference());
	}
	
	public double getArea() {						// Build Spec D
		return radius * radius * Math.PI;
	}
	
	public String formattedArea() {					// Build Spec E
		return formatNumber(getArea());
	}
	
	public String formatNumber(double x) {			// Build Spec F
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(x);

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
