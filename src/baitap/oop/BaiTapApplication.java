package baitap.oop;

public class BaiTapApplication {
	public static void main(String[] args) {
		cau1();
		cau2();
		cau3();
	}

	public static void cau1() {
		HocSinh student = new HocSinh("Nguyen Van C", 18, 5, 6, 7);
		student.printInformation();
	}

	public static void cau2() {
		XeHoi car = new XeHoi("Honda", "Xanh", 1900);
		car.printInformation();
	}

	public static void cau3() {
		TroChoi game = new TroChoi();
		game.startGame();
		game.endGame();
	}

}
