package Circle1;

public class Circle1 {
	int radius;
	String name;
	
	public Circle1 () {
	radius = 1; name="";
	}

	public Circle1 (int r, String n) {
		radius = r; name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle1 pizza = new Circle1(10, "자바피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle1 donut = new Circle1();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
