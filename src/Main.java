
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello Geekation");

		StringBuilder sb = new StringBuilder();

		// 文字列を追加&結合します
		sb.append("hoge");
		sb.append("fuga");
		// または、メソッドチェーン(メソッドを繋げて)で記述することも可能です。
		sb.append("hoge").append("fuga");

		// StringBuilderをStringに変換して出力します
		// SringBuilderクラスはSringBuilder自身を戻り値として返します。そのためStringクラスにキャストしてから出力する必要があります。
		String result = sb.toString();
		System.out.println(result);
	}
}
