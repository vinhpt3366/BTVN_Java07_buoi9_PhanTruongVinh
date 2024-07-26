package baitap5.oop;

public class DieuHoa extends ThietBiDien {
	int temperature;

	public DieuHoa() {
	}

	public DieuHoa(String name, double power, int temperature) {
		super(name, power, "Làm mát");
		this.temperature = temperature;
	}

	@Override
	public void printInfo() {
		System.out.println("---- THÔNG TIN ĐIỀU HÒA ----");
		System.out.printf("%-15s: %s%n", "Hãng", this.name);
		System.out.printf("%-15s: %.1f W%n", "Công suất", this.power);
		System.out.printf("%-15s: %s%n", "Chức năng", this.uses);
		System.out.printf("%-15s: %d°C%n", "Nhiệt độ", this.temperature);
	}
}
