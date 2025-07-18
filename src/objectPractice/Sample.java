package objectPractice;

public class Sample {
	// フィールドはprivate
	private String lastName;
	private String firstName;

	Sample(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	// lastNameのゲッター
	public String getLastName() {
		return this.lastName;
	}

	// firstNameのゲッター
	public String getFirstName() {
		return this.firstName;
	}
}
