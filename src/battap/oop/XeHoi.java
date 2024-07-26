package battap.oop;

public class XeHoi {
	String manufacturer;
	String color;
	int yearOfManufacture;

	public XeHoi() {
	}

	public XeHoi(String manufacturer, String color, int yearOfManufacture) {
		this.manufacturer = manufacturer;
		this.color = color;
		this.yearOfManufacture = yearOfManufacture;
	}

	public void printInformation() {
		System.out.println("---- THÔNG TIN XE HƠI ----");
		System.out.printf("%-15s: %s%n", "Hãng sản xuất", this.manufacturer);
		System.out.printf("%-15s: %s%n", "Màu", this.color);
		System.out.printf("%-15s: %s%n", "Năm sản xuất", this.yearOfManufacture);
	}
}
