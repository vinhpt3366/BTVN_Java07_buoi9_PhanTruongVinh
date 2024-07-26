package battap5.oop;

public class BaiTap5Application {
	public static void main(String[] args) {
		DieuHoa airConditioner = new DieuHoa("Sharp", 746, 25);
		airConditioner.printInfo();

		MaySay dryer = new MaySay("Bluestone", 1100, 60);
		dryer.printInfo();
	}
}
