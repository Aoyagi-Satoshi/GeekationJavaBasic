package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int result = addNumber(8, 5);
		System.out.println("計算結果は" + result + "です");
		result = subNumber(8, 5);
		System.out.println("計算結果は" + result + "です");
		result = mulNumber(8, 5);
		System.out.println("計算結果は" + result + "です");
		result = truedivNumber(8, 5);
		System.out.println("計算結果は" + result + "です");
	}

	public static int addNumber(int a, int b) {
		int add = a + b;
		return add;
	}

	public static int subNumber(int a, int b) {
		int sub = a - b;
		return sub;
	}

	public static int mulNumber(int a, int b) {
		int mul = a * b;
		return mul;
	}

	public static int truedivNumber(int a, int b) {
		int truediv = a / b;
		return truediv;
	}

}
