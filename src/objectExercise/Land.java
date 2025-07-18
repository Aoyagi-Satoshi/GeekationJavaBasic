package objectExercise;

public class Land extends Property {

	protected double area;

	Land(String name, String owner, String type, int price, double area) {
		super(name, owner, type, price);
		this.area = area;
	}

	public void propertyInfo() {
		super.propertyInfo();
		System.out.println("広さ:" + this.area + "㎡");
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
