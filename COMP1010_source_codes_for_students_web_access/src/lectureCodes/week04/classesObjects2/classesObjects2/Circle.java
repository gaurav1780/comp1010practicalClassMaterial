package lectureCodes.week04.classesObjects2.classesObjects2;

public class Circle  {
	public double radius;
	
	public double getRadius() {
		return 0;
	}

	public void setRadius(double radius) {
		if(radius < 0)
			this.radius = 1;
		else
			this.radius = radius;
	}

	public Circle(){
		setRadius(1);
	}
	
	public Circle(double radius) {
		setRadius(radius);
	}
	
	public String toString() {
		return "radius = "+radius + ", area = "+area();
	}

	public double area() {
		return Math.PI * radius * radius;
	}
}
