package battap.oop;

public class HocSinh {
	String fullName;
	int age;
	double mathScore;
	double physicsScore;
	double chemistryScore;
	double averageScore;

	public HocSinh() {
	}

	public HocSinh(String fullName, int age, double mathScore, double physicsScore, double chemistryScore) {
		this.fullName = fullName;
		this.age = age;
		this.mathScore = mathScore;
		this.physicsScore = physicsScore;
		this.chemistryScore = chemistryScore;

		calculateAverageScore();
	}

	public void calculateAverageScore() {
		this.averageScore = (this.mathScore + this.physicsScore + this.chemistryScore) / 3;
	}

	public void printInformation() {
		System.out.println("---- THÔNG TIN HỌC SINH ----");
		System.out.printf("%-15s: %s%n", "Họ tên", this.fullName);
		System.out.printf("%-15s: %d%n", "Tuổi", this.age);
		System.out.printf("%-15s: %,.1f%n", "Điểm trung bình", this.averageScore);
	}
}
