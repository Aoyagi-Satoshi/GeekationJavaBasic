package objectExercise;

public class Apartment extends Property {

	protected String layout;

	Apartment(String name, String owner, String type, int price, String layout) {
		super(name, owner, type, price);
		this.layout = layout;
	}

	public void propertyInfo() {
		super.propertyInfo();
		System.out.println("間取り:" + this.layout);
	}

	public String getLayout() {
		return this.layout;

	}

	public void setLayout(String layout) {
		this.layout = layout;
	}
}
