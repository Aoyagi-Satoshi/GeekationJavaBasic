package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 15;
		int b = 10;
		boolean isGreaterA = a > b;
		System.out.println(isGreaterA);

		boolean isSunny = true;
		boolean isWarm = true;
		boolean weather = isSunny && isWarm;
		System.out.println(weather);

		int x = 5;
		int y = 10;
		boolean isGreaterOrEqualOrEvenNumber = x >= 0 && y % 2 == 0;
		System.out.println(isGreaterOrEqualOrEvenNumber);

		boolean hasPermission = false;
		hasPermission = !(hasPermission);
		System.out.println(hasPermission);
	}

}
