package basicSyntax;

public class GeekIntroduction {

	public static void greeting(int age, double height) {
		System.out.println("こんにちは! 私はGeek君でごわす。");
		System.out.println("年は" + age + "歳でごわす。");
		System.out.println("身長は" + height + "mでごわす。");
	}

	public static void specialSkill(int num1, int num2) {
		for (; num1 <= num2; num1++) {
			if (num1 < 0 || num2 < 0) {
				System.out.println("num1とnum2は0より大きい値にしてください。");
				break;
			} else if (num2 <= num1) {
				System.out.println("num2はnum1より大きい値にしてください。");
				break;
			} else if (300 <= num1 || 300 < num2) {
				System.out.println("num1とnum2は300以下にしてください。");
				break;
			} else if (num1 % 3 == 0 && num1 % 5 == 0) {
				System.out.println(num1 + "は3の倍数かつ5の倍数です。");
			} else if (num1 % 3 == 0) {
				System.out.println(num1 + "は3の倍数です。");
			} else if (num1 % 5 == 0) {
				System.out.println(num1 + "は5の倍数です。");
			} else {
				System.out.println(num1);
			}

		}
	}
}
