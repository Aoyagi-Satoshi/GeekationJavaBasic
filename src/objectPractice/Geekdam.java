package objectPractice;

public class Geekdam {

	public String name;
	public int age;
	public double height;

	// 元のコンストラクタ
	Geekdam(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// オーバーロードしたコンストラクタ
	Geekdam(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
}
