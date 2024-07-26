package battap4.oop;

public class XeHoi extends PhuongTienGiaoThong {

	public XeHoi() {
	}

	public XeHoi(String manufacturer, String color, int yearOfManufacture) {
		super(manufacturer, color, yearOfManufacture);
	}

	@Override
	public void printInfo() {
		System.out.println("---- THÔNG TIN XE HƠI ----");
		System.out.printf("%-15s: %s%n", "Hãng sản xuất", this.manufacturer);
		System.out.printf("%-15s: %s%n", "Màu", this.color);
		System.out.printf("%-15s: %s%n", "Năm sản xuất", this.yearOfManufacture);
	}
}
