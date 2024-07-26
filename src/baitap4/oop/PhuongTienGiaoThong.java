package baitap4.oop;

public class PhuongTienGiaoThong {
	String manufacturer;
	String color;
	int yearOfManufacture;

	public PhuongTienGiaoThong() {
	}

	public PhuongTienGiaoThong(String manufacturer, String color, int yearOfManufacture) {
		this.manufacturer = manufacturer;
		this.color = color;
		this.yearOfManufacture = yearOfManufacture;
	}

	public void printInfo() {
		System.out.println("---- THÔNG TIN XE ----");
		System.out.printf("%-15s: %s%n", "Hãng sản xuất", this.manufacturer);
		System.out.printf("%-15s: %s%n", "Màu", this.color);
		System.out.printf("%-15s: %s%n", "Năm sản xuất", this.yearOfManufacture);
	}
}
