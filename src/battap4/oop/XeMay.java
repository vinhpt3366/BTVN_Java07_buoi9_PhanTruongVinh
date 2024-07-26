package battap4.oop;

public class XeMay extends PhuongTienGiaoThong {

	public XeMay() {
	}

	public XeMay(String manufacturer, String color, int yearOfManufacture) {
		super(manufacturer, color, yearOfManufacture);
	}

	@Override
	public void printInfo() {
		System.out.println("---- THÔNG TIN XE MÁY ----");
		System.out.printf("%-15s: %s%n", "Hãng sản xuất", this.manufacturer);
		System.out.printf("%-15s: %s%n", "Màu", this.color);
		System.out.printf("%-15s: %s%n", "Năm sản xuất", this.yearOfManufacture);
	}
}
