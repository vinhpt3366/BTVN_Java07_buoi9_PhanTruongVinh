package baitap5.oop;

public class MaySay extends ThietBiDien {
	int temperature;

	public MaySay() {
	}

	public MaySay(String name, double power, int temperature) {
		super(name, power, "Làm khô");
		this.temperature = temperature;
	}

	@Override
	public void printInfo() {
		System.out.println("---- THÔNG TIN MÁY SẤY ----");
		System.out.printf("%-15s: %s%n", "Tên", this.name);
		System.out.printf("%-15s: %.1f W%n", "Công suất", this.power);
		System.out.printf("%-15s: %s%n", "Chức năng", this.uses);
		System.out.printf("%-15s: %d°C%n", "Nhiệt độ", this.temperature);
	}

}
