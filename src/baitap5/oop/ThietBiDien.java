package baitap5.oop;

public class ThietBiDien {
	String name;
	double power;
	String uses;

	public ThietBiDien() {
	}

	public ThietBiDien(String name, double power, String uses) {
		this.name = name;
		this.power = power;
		this.uses = uses;
	}

	public void printInfo() {
		System.out.println("---- THÔNG TIN THIẾT BỊ ----");
		System.out.printf("%-15s: %s%n", "Hãng", this.name);
		System.out.printf("%-15s: %.2f W%n", "Công suất", this.power);
		System.out.printf("%-15s: %s%n", "Công dụng", this.uses);
	}

}
