package objectExercise;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Apartment apartment = new Apartment("いい感じアパートメント", "山田 マンション太郎", "マンション", 50000000, "3LDK");
		apartment.propertyInfo();

		Land land = new Land("いい感じの土地", "山田 土地太郎", "土地", 8000000, 105.2);
		land.propertyInfo();

		System.out.println(land.getName());
	}

}
